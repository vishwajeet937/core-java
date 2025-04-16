package com.triniti.java2flowchart.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class JavaCodeParser
{
	Map<String, List<MethodCallExpr>> classVsMethodCalls = new HashMap<>();
	
	Map<String, Map<String, Map<String, String>>> fileLevelInstanceVariableDetails = new HashMap<>();
	Map<String, Map<String, String>> classLevelInstanceVariableDetails = null;
	Map<String, String> instanceVariableDetails;
	
	Map<String, List<String>> fileLevelImports = new HashMap<>();
	List<String> importsList;
	
	public Map<String, List<ClassOrInterfaceDeclaration>> listClassesFromSourceCode(File sourceFolder)
	{
		//System.out.println("fetching all details of the .java file of sourcefolder:-"+sourceFolder+" and keping .java file name as key and that java file entire detais as value(List<ClassOrInterfaceDeclaration>) in HashMap<String,List<ClassOrInterfaceDeclaration>>.");
		Map<String, List<ClassOrInterfaceDeclaration>> classesByFile = new HashMap<>();
		
		//System.out.println("intiating DirExplorer class.");
    	DirExplorer dirExplorer = new DirExplorer();
    	//System.out.println("invoking setFilter(-) method of class DirExplorer.");
    	dirExplorer.setFilter((level, path, file) -> path.endsWith(".java"));
    	//System.out.println("invoking setFileHandler(-) method of class DirExplorer.");
    	dirExplorer.setFileHandler(
			(level, path, file) -> 
			{
	            try 
	            {
	                new VoidVisitorAdapter<Object>() 
	                {
	                    public void visit(ImportDeclaration importDeclaration, Object arg) {
	                        super.visit(importDeclaration, arg);
	                        
	                        importsList = fileLevelImports.get(file.getAbsolutePath());
	                        if(importsList == null)
	                        {
	                        	importsList = new ArrayList<>();
	                        	fileLevelImports.put(file.getAbsolutePath(), importsList);
	                        }
	                        
	                        importsList.add(importDeclaration.getNameAsString());
	                    }
	                	
	                    public void visit(ClassOrInterfaceDeclaration classOrInterfaceDeclaration, Object arg) 
	                    {
	                        super.visit(classOrInterfaceDeclaration, arg);
	                        List<ClassOrInterfaceDeclaration> javaClassesOrInterfacesList = classesByFile.get(file.getAbsolutePath());
	                        if(javaClassesOrInterfacesList == null)
	                        {
	                        	javaClassesOrInterfacesList = new ArrayList<>();
	                        	classesByFile.put(file.getAbsolutePath(), javaClassesOrInterfacesList);
	                        }
	                        javaClassesOrInterfacesList.add(classOrInterfaceDeclaration);

	                        classLevelInstanceVariableDetails = fileLevelInstanceVariableDetails.get(file.getAbsolutePath());
	                        if(classLevelInstanceVariableDetails == null)
	                        {
	                        	classLevelInstanceVariableDetails = new HashMap<>();
	                        	fileLevelInstanceVariableDetails.put(file.getAbsolutePath(), classLevelInstanceVariableDetails);
	                        }
	                        
	                        importsList = fileLevelImports.get(file.getAbsolutePath());
	                        instanceVariableDetails = classLevelInstanceVariableDetails.get(classOrInterfaceDeclaration.getNameAsString());
	                        
	                        if(instanceVariableDetails == null)
	                        {
	                        	instanceVariableDetails = new HashMap<>();
	                        	classLevelInstanceVariableDetails.put(classOrInterfaceDeclaration.getNameAsString(), instanceVariableDetails);
	                        }
                        
                        	List<FieldDeclaration> fields = classOrInterfaceDeclaration.getFields();
                        
	                        for (FieldDeclaration fieldDeclaration : fields) 
	                        {
								instanceVariableDetails.put(fieldDeclaration.getVariable(0).getNameAsString(), fieldDeclaration.getVariable(0).getTypeAsString());
							}
	                    }
	                }.visit(StaticJavaParser.parse(file), null);
	            }
	            catch (IOException e) 
	            {
	            	e.printStackTrace();
	            }
	        }
    	);
    	dirExplorer.explore(sourceFolder);
		
        return classesByFile;
	}

    public List<MethodCallExpr> listMethodCallsFromMethod(File projectDir, String className, MethodDeclaration fromMethod)
    {
    	
    	int startLine = fromMethod.getBegin().get().line;
    	int endLine = fromMethod.getEnd().get().line;
    	
    	List<MethodCallExpr> methodCalls = new ArrayList<>();
    	
    	DirExplorer dirExplorer = new DirExplorer();
    	dirExplorer.setFilter((level, path, file) -> path.endsWith(className));
    	
    	dirExplorer.setFileHandler(
			(level, path, file) -> {
	            try 
	            {
	            	VoidVisitorAdapter<Object> visitorAdapter = new VoidVisitorAdapter<Object>() 
	                {
	                    @Override
	                    public void visit(MethodCallExpr n, Object arg) 
	                    {
	                        super.visit(n, arg);
	                        if(n.getBegin().get().line >= startLine && n.getBegin().get().line <= endLine)
	                        {
		                        methodCalls.add(n);
	                        }
	                    }
	                };
	                
	                visitorAdapter.visit(StaticJavaParser.parse(file), null);
	            } 
	            catch (IOException e) 
	            {
	                throw new RuntimeException(e);
	            }
	        }
    	);
    	
        dirExplorer.explore(projectDir);
        return methodCalls;
    }
    
    public List<Statement> listAllStatementsFromAMethod(File projectDir, String javaFilePath, MethodDeclaration fromMethod)
    {
    	List<Statement> statements = new ArrayList<>();
    	
    	int startLine = fromMethod.getBegin().get().line;
    	int endLine = fromMethod.getEnd().get().line;
    	
    	DirExplorer dirExplorer = new DirExplorer();
    	dirExplorer.setFilter((level, path, file) -> javaFilePath.replace("\\", "/").endsWith(path));
    	dirExplorer.setFileHandler(
			(level, path, file) -> {
	            try 
	            {
	                StaticJavaParser.parse(file)
                    .findAll(Statement.class)
                    .forEach(statement -> {
                        if(statement.getBegin().get().line >= startLine && 
                    		statement.getBegin().get().line <= endLine)
                        {
                        	statements.add(statement);
                        }
                    });
	                if(statements.size() > 0)
	                {
	                	statements.remove(0);
	                }
	            } catch (IOException e) {
	                throw new RuntimeException(e);
	            }
	        }
    	);
    	
        dirExplorer.explore(projectDir);
        return statements;
    }
    
    public List<Object> listImportsAndFieldsAClass(File projectDir, String javaFilePath, ClassOrInterfaceDeclaration classDeclaration)
    {
    	List<Object> importsAndFields = new ArrayList<>();
    	
    	List<ImportDeclaration> imports = new ArrayList<>();
    	List<FieldDeclaration> fields = new ArrayList<>();
    	
    	int startLine = classDeclaration.getBegin().get().line;
    	int endLine = classDeclaration.getEnd().get().line;
    	
    	DirExplorer dirExplorer = new DirExplorer();
    	dirExplorer.setFilter((level, path, file) -> javaFilePath.replace("\\", "/").endsWith(path));
    	dirExplorer.setFileHandler(
			(level, path, file) -> {
	            try 
	            {
	            	CompilationUnit unit = StaticJavaParser.parse(file);
	            	unit.getChildNodes().stream()
	            	.forEach(node -> 
	            	{
	            		
	            		if(node instanceof ImportDeclaration)
	            		{
	            			imports.add((ImportDeclaration) node);
	            		}
	            		else if(node instanceof ClassOrInterfaceDeclaration)
	            		{
	                        if(node.getBegin().get().line >= startLine && node.getBegin().get().line <= endLine)
	                        {
		            			List<Node> classChilds = node.getChildNodes();
		            			classChilds.stream()
		            			.forEach(node2 -> 
		            			{
		            				if(node2 instanceof FieldDeclaration)
		            				{
		            					fields.add((FieldDeclaration) node2);
		            				}
		            			});
	                        }
	            		}
	            	});
	            	//System.out.println(fields+"-DirExp: "+imports);
	            	importsAndFields.add(imports);
	            	importsAndFields.add(fields);
	            	
	            } 
	            catch (IOException e) 
	            {
	                throw new RuntimeException(e);
	            }
	        }
    	);
    	
        dirExplorer.explore(projectDir);
        return importsAndFields;
    }
    
    public Map<String, Map<String, Map<String, String>>> getFileLevelInstanceVariableDetails() 
    {
		return fileLevelInstanceVariableDetails;
	}
    
    public Map<String, List<String>> getFileLevelImports()
    {
		return fileLevelImports;
	}
}
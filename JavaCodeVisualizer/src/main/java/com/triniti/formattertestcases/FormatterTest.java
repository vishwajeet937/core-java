package com.triniti.formattertestcases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;

import eDynamo.classes.T_STATEMENTS;

public class FormatterTest {
	
	private static String DBStatFormattedFileLocation;

	public static String formatJavaCode(StringBuilder classStat) {
		Formatter format=new Formatter();
		String value=null;
		try {
			value=format.formatSource(classStat.toString());
			//System.out.println(value);
			return value;
		} catch (Exception e) {
			try {
				
				//System.out.println(value);
				if(classStat.toString().contains("CloudPutController")) {
					System.out.println("yes this Excpetion:: "+e.getMessage());
				Thread.sleep(50000);
				
				
				}
				else
					Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
			return "";
		}

	}
	
	public static void main(String[] args) {
			Formatter format=new Formatter();
			try {
				String val=format.formatSource("");
			} catch (FormatterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void generateJavaFile(String projectName,Object classMap,String location) {
		try {
		LinkedHashMap classMapMain=(LinkedHashMap)classMap;
		String packageName="";
		String className=null;
		String classStat=null;
		String importStat=null;
		String classDec=null;
		String classVar=null;
		String methodDec=null;
		String methodBody=null;
		className=String.valueOf(classMapMain.get("className"));
		packageName=String.valueOf(classMapMain.get("package"));
		classDec=String.valueOf(classMapMain.get("classDec"));
		if(!classDec.contains("{"))
			classDec=classDec.concat("{");
		else if(classDec.contains("{}")) {
			classDec=classDec.replace("{}", "{");
			//System.out.println("condition is true..."+classDec);
			//Thread.sleep(5000);
		}
		LinkedHashMap importMap=(LinkedHashMap) classMapMain.get("importStat");
		LinkedList classDecList=(LinkedList) classMapMain.get("classDecList");
		LinkedList methodList=(LinkedList)classMapMain.get("methodList");
		StringBuilder classLevelVar=new StringBuilder();
		StringBuilder importStatment=new StringBuilder();
		StringBuilder packageStat=new StringBuilder();
		StringBuilder allMethodImplBody=new StringBuilder();
		classDecList.forEach(refVar->{
			classLevelVar.append((((LinkedHashMap)refVar).get("refVar")));
		});
		
		/*importMap.keySet().forEach(importClassName->{
			if(importMap.get(importClassName).toString().contains("import") || importMap.get(importClassName).toString().contains("package") )
			importStatment.append(importMap.get(importClassName));
		});*/
		importMap.forEach((className01,importStat01)->{
			
			if(importStat01.toString().contains("import") && !importStat01.toString().contains("*") )
				importStatment.append(importStat01);
			else if(importStat01.toString().contains("package")) {
				packageStat.append(importStat01.toString());
			
			}
			
		});
		packageStat.append(importStatment);
		methodList.forEach(methodDet->{
		StringBuilder methodDec01=new StringBuilder(String.valueOf(((LinkedHashMap)methodDet).get("actualCode")));
		if(!methodDec01.toString().contains("{") && !methodDec01.toString().equals("null"))
			methodDec01.append("{\r\n");
		LinkedList methodStatList=(LinkedList) ((LinkedHashMap)methodDet).get("statement");
		methodStatList.forEach(stat->{
			String actualCode=((T_STATEMENTS)stat).ACTUAL_CODE;
			methodDec01.append(actualCode);
			
		});
		if(!methodDec01.toString().equals("null"))
		methodDec01.append("\r\n}");
		allMethodImplBody.append(methodDec01);
	//	System.out.println("act:: "+methodDec01);
		});
		
		classVar=classLevelVar.toString();
		importStat=importStatment.toString();
		methodBody=allMethodImplBody.toString();
		if(classVar==null || classVar.equals("null"))
			classVar="";
		if(methodBody.equals("null"))
			methodBody="";
		String finalVal=packageStat.toString().concat("\r\n"+classDec).concat("\r\n"+classVar).concat("\r\n"+methodBody).concat("}");
		if(className.contains("CloudPutController")) {
			System.out.println(className+"finalVal:>? "+finalVal);
			//System.out.println(importStatment);
			
		}
		//System.out.println(className+"finalVal:>? "+finalVal);
		
		String fileVal=FormatterTest.formatJavaCode(new StringBuilder(finalVal));
		
		
		try {
			File file=new File(location+File.separator+projectName+File.separator+packageName+File.separator+className+".java");
			file.getParentFile().mkdirs();
			FileWriter writer=new FileWriter(file);
			writer.append(fileVal);
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.sleep(5000);
		}
		}catch (Exception e) {
			
			e.printStackTrace();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}

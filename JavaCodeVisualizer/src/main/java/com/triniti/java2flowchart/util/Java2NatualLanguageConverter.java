package com.triniti.java2flowchart.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.ArrayAccessExpr;
import com.github.javaparser.ast.expr.ArrayCreationExpr;
import com.github.javaparser.ast.expr.ArrayInitializerExpr;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.BooleanLiteralExpr;
import com.github.javaparser.ast.expr.CastExpr;
import com.github.javaparser.ast.expr.ConditionalExpr;
import com.github.javaparser.ast.expr.EnclosedExpr;
import com.github.javaparser.ast.expr.FieldAccessExpr;
import com.github.javaparser.ast.expr.InstanceOfExpr;
import com.github.javaparser.ast.expr.LambdaExpr;
import com.github.javaparser.ast.expr.LiteralExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.MethodReferenceExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.SimpleName;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.expr.UnaryExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.BreakStmt;
import com.github.javaparser.ast.stmt.ContinueStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.type.ArrayType;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.PrimitiveType;
import com.github.javaparser.ast.type.Type;
import com.triniti.java2flowchart.main.JavaCodeVisualizer;
import com.triniti.java2flowchart.model.FlowChartNode;

public class Java2NatualLanguageConverter 
{
	private JavaCodeVisualizer javaCodeVisualizer;
	private Properties apiDefinitionProps;
	private Map<String, String> variablesMap;
	private Map<String, String> importedClassDetailsMap;
	
	public Java2NatualLanguageConverter(JavaCodeVisualizer javaStatementsVisualizer) 
	{
		this.javaCodeVisualizer = javaStatementsVisualizer;
		getAPIDefinitionProperties();
	}

	public List<Object> getStatementInNaturalLanguage(Node javaStatementNode) 
	{
		StringBuilder statementBuilder = new StringBuilder();
		
		List<Node> childNodes = null;
		Node childNode = null;
		
		List<Object> statementsInNaturalLanguage = new ArrayList<>();
		
		if(javaStatementNode instanceof ExpressionStmt)
		{
			
			if(javaCodeVisualizer.hasLambdaExpressionInIt(javaStatementNode))
			{
				List<Object> listOfStatements = getStatementsListFromLambdaExpr((ExpressionStmt) javaStatementNode);
				statementsInNaturalLanguage.addAll(listOfStatements);
			}
			else if(javaStatementNode.toString().contains("stream()"))
			{
				
				List<Object> listOfStatements = getStatementsListFromLambdaExpr((ExpressionStmt) javaStatementNode);
				statementsInNaturalLanguage.addAll(listOfStatements);
			}
			else if(javaStatementNode.toString().contains(".asList(") && 
					javaStatementNode.toString().indexOf(".asList") == javaStatementNode.toString().indexOf(".")
			)
			{
				statementsInNaturalLanguage.addAll(getStatementFromArraysAsList((ExpressionStmt) javaStatementNode));
			}
			else
			{
				System.out.println("yes we are here...");
				childNodes = javaStatementNode.getChildNodes();
				
				int noOfChildNodes = childNodes.size();
				
				
				if(noOfChildNodes == 1)
				{
					childNode = childNodes.get(0);
					
					
					if(childNode instanceof VariableDeclarationExpr)
					{
						Object statementsFromVariableDeclarationExpr = getStatementFromVariableDeclarationExpr(childNode);
						if(statementsFromVariableDeclarationExpr instanceof List)
						{
							statementsInNaturalLanguage.addAll((List)statementsFromVariableDeclarationExpr);
						}
					}
					else if(childNode instanceof AssignExpr)
					{
						Object statementsFromAssignExpr = getStatementsFromAssignExpr((AssignExpr) childNode);
						
						
						if(statementsFromAssignExpr instanceof List)
						{
							statementsInNaturalLanguage.addAll((List)statementsFromAssignExpr);
						}
						else if(statementsFromAssignExpr instanceof String)
						{
							statementBuilder.append(statementsFromAssignExpr);
						}
					}
					else if(childNode instanceof MethodCallExpr)
					{
						childNodes = childNode.getChildNodes();
						
						
						for (Object childNode123 : childNodes) 
						{
						}
						
						if((childNodes.get(0).toString().equalsIgnoreCase("System.out") || 
							childNodes.get(0).toString().equalsIgnoreCase("System.err")) &&
							childNodes.get(1).toString().startsWith("print"))
						{
							statementBuilder.append("Print (").append(childNodes.get(2)).append(")");
						}
						else if((childNodes.get(0) instanceof NameExpr || childNodes.get(0) instanceof EnclosedExpr) && childNodes.get(1) instanceof SimpleName)
						{
							
							String statement = getStatementFromJavaAPIClasses(childNodes);
							
							
							
							if(statement == null || statement.trim().equals("null") || statement.trim().equals(""))
							{
								statementBuilder.append("Call ").append(childNodes.get(1)).append("() on ");
								statementBuilder.append("variable ");
								statementBuilder.append(childNodes.get(0));
							}
							else
							{
								statementBuilder.append(statement);
							}
						}
						else if(childNodes.size() == 2 && childNodes.get(1) instanceof SimpleName)
						{
							statementBuilder.append("Call ").append(childNodes.get(1)).append("() on ");
							if(childNodes.get(0) instanceof NameExpr)
							{
								statementBuilder.append("variable ");
							}
							statementBuilder.append(childNodes.get(0));
						}
						else if(childNodes.get(0) instanceof SimpleName)
						{
							if(childNodes.get(0).toString().equals("close"))
							{
								statementBuilder.append("Close ").append(childNodes.get(1));
							}
							else
							{
								statementBuilder.append("Call ").append(childNodes.get(0)).append("()");
							}
						}
						else if(childNodes.get(0) instanceof ObjectCreationExpr)
						{
							statementBuilder.append("Create an instance of ")
							.append(childNodes.get(0).getChildNodes().get(0));
							statementBuilder.append(". And Call ").append(childNodes.get(1)).append("() on it");
						}
						else
						{
						}
					}
					else if(childNode instanceof UnaryExpr)
					{
						if(childNode.toString().endsWith("++"))
						{
							statementBuilder.append("Increment ").append(childNode.getChildNodes().get(0)).append(" by 1");
						}
						else if(childNode.toString().endsWith("--"))
						{
							statementBuilder.append("Decrement ").append(childNode.getChildNodes().get(0)).append(" by 1");
						}
						else if(childNode.toString().startsWith("!"))
						{
							statementBuilder.append("Not ").append(childNode.getChildNodes().get(0));
						}
					}
					else if(childNode instanceof BinaryExpr)
					{
						statementBuilder.append(getStatementFromBinaryExpr((BinaryExpr) childNode));
					}
					else if(childNode instanceof BooleanLiteralExpr)
					{
						statementBuilder.append(childNode);
					}
					else
					{
					}
				}
			}
		}
		else if(javaStatementNode instanceof VariableDeclarationExpr)
		{
			Object statementsFromVariableDeclarationExpr = getStatementFromVariableDeclarationExpr(javaStatementNode);
			if(statementsFromVariableDeclarationExpr instanceof List)
			{
				statementsInNaturalLanguage.addAll((List)statementsFromVariableDeclarationExpr);
			}
		}
		else if(javaStatementNode instanceof BinaryExpr)
		{
			statementBuilder.append(getStatementFromBinaryExpr((BinaryExpr) javaStatementNode));
		}
		else if(javaStatementNode instanceof MethodCallExpr)
		{
			List<Object> statementsFromMethodCall = getStatementsFromMethodCall((MethodCallExpr) javaStatementNode);
			statementsInNaturalLanguage.addAll(statementsFromMethodCall);
		}
		else if(javaStatementNode instanceof BooleanLiteralExpr)
		{
			statementBuilder.append(javaStatementNode);
		}
		else if(javaStatementNode instanceof NameExpr)
		{
			statementBuilder.append(javaStatementNode);
		}
		else if(javaStatementNode instanceof BlockStmt)
		{
			List<Object> statementsFromBlock = javaCodeVisualizer.getStatementsFromBlock((BlockStmt) javaStatementNode);
			
			for (Object statementFromBlock : statementsFromBlock) 
			{
				if(statementFromBlock instanceof FlowChartNode)
				{
					statementsInNaturalLanguage.add(((FlowChartNode)statementFromBlock).getNodeName());
				}
				else
				{
					statementsInNaturalLanguage.add(statementFromBlock);
				}
			}
			
		}
		else if(javaStatementNode instanceof Parameter)
		{
			statementBuilder.append("For each ").append(javaStatementNode).append(" from List");
		}
		else if(javaStatementNode instanceof FieldAccessExpr)
		{
			statementBuilder.append(javaStatementNode.toString());
		}
		else if(javaStatementNode instanceof UnaryExpr)
		{
			statementBuilder.append(getStatementFromUnaryExpr((UnaryExpr) javaStatementNode));
		}
		else if(javaStatementNode instanceof InstanceOfExpr)
		{
			childNodes = javaStatementNode.getChildNodes();
			statementBuilder.append(childNodes.get(0)).append( " is instance of ").append(childNodes.get(1));
		}
		else if(javaStatementNode instanceof ReturnStmt)
		{
			statementBuilder.append(getStatementFromReturnStmt((ReturnStmt) javaStatementNode));
		}
		else if(javaStatementNode instanceof BreakStmt)
		{
			statementBuilder.append(getStatementFromBreakStmt((BreakStmt) javaStatementNode));
		}
		else if(javaStatementNode instanceof ContinueStmt)
		{
			statementBuilder.append(getStatementFromContinueStmt((ContinueStmt) javaStatementNode));
		}
		else if(javaStatementNode instanceof AssignExpr)
		{
			Object statementsFromAssignExpr = getStatementsFromAssignExpr((AssignExpr) javaStatementNode);
			
			if(statementsFromAssignExpr instanceof List)
			{
				statementBuilder.append(((List)statementsFromAssignExpr).get(0));
			}
			else
			{
				statementBuilder.append(statementsFromAssignExpr);
			}
		}
		else if(javaStatementNode instanceof LiteralExpr)
		{
			statementBuilder.append(javaStatementNode.toString());
		}
		else if(javaStatementNode instanceof VariableDeclarator)
		{
			statementBuilder.append(getStatementFromVariableDeclarator(javaStatementNode));
		}
		else if(javaStatementNode instanceof com.github.javaparser.ast.expr.EnclosedExpr)
		{

			Node innerExpression = javaStatementNode.getChildNodes().get(0);
			
			if(innerExpression instanceof BinaryExpr)
			{
				statementBuilder.append(getStatementFromBinaryExpr((BinaryExpr) innerExpression));
			}
			statementBuilder.append(javaStatementNode.toString());
		}
		else
		{
		}
		
		if(statementBuilder.toString().trim().length() > 0)
		{
			statementsInNaturalLanguage.add(statementBuilder.toString().trim());
		}
		
		return statementsInNaturalLanguage;
	}
	
	private String getStatementFromJavaAPIClasses(List<Node> childNodes) 
	{
		
		Node referenceNode = childNodes.get(0);
		
		if(referenceNode instanceof EnclosedExpr)
		{
			referenceNode = referenceNode.getChildNodes().get(0);
		}

		if(referenceNode instanceof CastExpr)
		{
			referenceNode = referenceNode.getChildNodes().get(1);
		}
		
		
		String definitionKey = null;
		StringBuilder statementBuilder = new StringBuilder();
		
		
		if(childNodes.size() == 1)
		{
			statementBuilder.append("Call ").append(referenceNode);
		}
		else
		{
			if(referenceNode.toString().contains("Arrays") && childNodes.get(1).toString().contains("asList"))
			{
				if(childNodes.get(2) instanceof ArrayCreationExpr)
				{
					childNodes = childNodes.get(2).getChildNodes();
					if(childNodes.get(1).toString().equals("[]"))
					{
						statementBuilder.append("Create List from " + referenceNode + " array of " + childNodes.get(2));
					}
				}
			}
			else if(referenceNode.toString().contains("Stream") && childNodes.get(1).toString().contains("range"))
			{
				statementBuilder.append("Create an " + referenceNode.toString() + " from " + childNodes.get(2) + " to " + childNodes.get(3));
			}
			else if(referenceNode.toString().contains("Class") && childNodes.get(1).toString().contains("forName"))
			{
				statementBuilder.append("Load " + childNodes.get(2) + " class into JVM");
			}
			else if(referenceNode.toString().contains("Math") && childNodes.get(1).toString().contains("sqrt"))
			{
				definitionKey = referenceNode.toString() + "." + childNodes.get(1).toString();
				statementBuilder.append(getStatementFromProperties(definitionKey, new Object[] {childNodes.get(2)}));
			}
			else if(referenceNode.toString().contains("System") && childNodes.get(1).toString().contains("currentTimeMillis"))
			{
				definitionKey = referenceNode.toString() + "." + childNodes.get(1).toString();
				statementBuilder.append(getStatementFromProperties(definitionKey, null));
			}
			else if(isItALoggerReference(referenceNode))
			{
				if(referenceNode.toString().contains("getContext") || childNodes.get(1).toString().contains("getContext"))
				{
					statementBuilder.append("Get Logger Context");
				}
				else
				{
					statementBuilder.append("Print").append(" (").append(childNodes.get(2)).append(")");
				}
			}
			else if(isItAConnectionReference(referenceNode))
			{
				String methodName = childNodes.get(1).toString();
				definitionKey = "Connection" + "." + methodName;
				String statement = null;
				String sqlObjectDetails = null;
				
				Object[] values = null;
				
				if(methodName.equals("prepareCall"))
				{
					String packageName = null;
					String funcOrProcCall = childNodes.get(2).toString();
					boolean functionCall = false;
					
					if(funcOrProcCall.contains("call "))
					{
						if(funcOrProcCall.indexOf("?") < funcOrProcCall.indexOf("call "))
						{
							functionCall = true;
						}
						
						funcOrProcCall = funcOrProcCall.substring(funcOrProcCall.indexOf("call ") + 5);
						if(funcOrProcCall.contains("("))
						{
							funcOrProcCall = funcOrProcCall.substring(0, funcOrProcCall.indexOf("("));
						}
						else if(funcOrProcCall.endsWith("}"))
						{
							funcOrProcCall = funcOrProcCall.substring(0, funcOrProcCall.indexOf("}"));
						}
						if(funcOrProcCall.contains("."))
						{
							packageName = funcOrProcCall.substring(0, funcOrProcCall.indexOf("."));
							funcOrProcCall = funcOrProcCall.substring(funcOrProcCall.indexOf(".") + 1);
						}
						
						
						if(functionCall)
						{
							sqlObjectDetails = "Function ";
						}
						else
						{
							sqlObjectDetails = "Procedure ";
						}
						
						if(funcOrProcCall != null)
						{
							sqlObjectDetails += funcOrProcCall;
						}
						
						if(packageName != null)
						{
							sqlObjectDetails += " from package " + packageName;
						}
					}
					values = new Object[] {sqlObjectDetails};
				}
				else if(methodName.equals("close"))
				{
					values = new Object[] {referenceNode};
				}
				else if(methodName.equals("prepareStatement"))
				{
					values = new Object[] {childNodes.get(2)};
				}
				
				statement = getStatementFromProperties(definitionKey, values);
				
				if(statement != null)
				{
					statementBuilder.append(statement);
				}
			}
			else if(isItAnSQLStatementReference(referenceNode))
			{
				String statement = null;
				String methodName = childNodes.get(1).toString();
				
				
				Object[] values = null;
				
				if(methodName.startsWith("set"))
				{
					methodName = "set";
					values = new Object[] {childNodes.get(1).toString().substring(3), childNodes.get(3), referenceNode, childNodes.get(2)};
				}
				else if(methodName.startsWith("get"))
				{
					methodName = "get";
					values = new Object[] {childNodes.get(1).toString().substring(3), childNodes.get(2), childNodes.get(1)};
				}
				else if(methodName.equals("close"))
				{
					values = new Object[] {referenceNode};
				}
				else if(methodName.equals("registerOutParameter"))
				{
					String type = childNodes.get(3).toString();
					if(type.contains("Types."))
					{
						type = type.substring(6);
					}
					values = new Object[] {childNodes.get(2), type};
				}
				else if(methodName.equals("executeUpdate") || methodName.startsWith("execute"))
				{
					values = new Object[] {referenceNode};
				}
				else if(methodName.equals("clearParameters"))
				{
					values = new Object[] {referenceNode};
				}
				else if(methodName.equals("addBatch"))
				{
					values = new Object[] {referenceNode};
				}
				else if(methodName.equals("clearBatch"))
				{
					values = new Object[] {referenceNode};
				}
				else
				{
					values = new Object[] {referenceNode};
				}
				
				definitionKey = "Statement." + methodName;
				statement = getStatementFromProperties(definitionKey, values);
				
				if(statement != null)
				{
					statementBuilder.append(statement);
				}
				
			}
			else if(isItAnSQLResultSetReference(referenceNode))
			{
				String statement = null;
				
				if(childNodes.get(1).toString().startsWith("get"))
				{
					definitionKey = "ResultSet.get";
					statement = getStatementFromProperties(definitionKey, new Object[] {childNodes.get(1).toString().substring(3), referenceNode, childNodes.get(1)});
				}
				else if(childNodes.get(1).toString().startsWith("close"))
				{
					definitionKey = "ResultSet.close";
					statement = getStatementFromProperties(definitionKey, new Object[] {referenceNode});
				}
				
				statementBuilder.append(statement);
			}
			else if(isItAnIOReference(referenceNode))
			{
				String methodName = childNodes.get(1).toString();
				definitionKey = "IO." + methodName;
				Object[] values = null;
				if(methodName.equals("close"))
				{
					values = new Object[] {referenceNode};
				}
				else if(methodName.equals("writeObject"))
				{
					values = new Object[] {referenceNode};
				}
				else if(methodName.equals("readObject"))
				{
					values = new Object[] {referenceNode};
				}
				
				if(definitionKey != null)
				{
					String statement = getStatementFromProperties(definitionKey, values);
					statementBuilder.append(statement);
				}
			}
			else if(isItAMapReference(referenceNode))
			{
				String methodName = childNodes.get(1).toString();
				Object[] values = null;
				
				definitionKey = "Map."+ methodName;
				
				if(methodName.equals("get"))
				{
					values = new Object[] {referenceNode, childNodes.get(2)};
				}
				else if(methodName.equals("put"))
				{
					values = new Object[] {childNodes.get(3), referenceNode, childNodes.get(2)};
				}
				else if(methodName.equals("clear"))
				{
					values = new Object[] {referenceNode};
				}
				
				if(definitionKey != null)
				{
					String statement = getStatementFromProperties(definitionKey, values);
					statementBuilder.append(statement);
				}
			}
			else if(isItAPropertiesReference(referenceNode))
			{
				String methodName = childNodes.get(1).toString();
				Object[] values = null;
				
				definitionKey = "Properties."+ methodName;
				
				if(methodName.equals("load"))
				{
					values = new Object[] {childNodes.get(2), referenceNode};
				}
				else if(methodName.equals("getProperty"))
				{
					values = new Object[] {childNodes.get(2), referenceNode};
				}
				
				if(definitionKey != null)
				{
					String statement = getStatementFromProperties(definitionKey, values);
					statementBuilder.append(statement);
				}
			}
			else if(isItAListReference(referenceNode))
			{
				String methodName = childNodes.get(1).toString();
				Object[] values = null;
				
				definitionKey = "List."+ methodName;
				
				if(methodName.equals("add"))
				{
					values = new Object[] {childNodes.get(2), referenceNode};
				}
				else if(methodName.equals("addAll"))
				{
					values = new Object[] {childNodes.get(2), referenceNode};
				}
				else if(methodName.equals("get"))
				{
					values = new Object[] {childNodes.get(2), referenceNode};
				}
				else if(methodName.equals("clear"))
				{
					values = new Object[] {referenceNode};
				}
				else if(methodName.equals("remove"))
				{
					values = new Object[] {childNodes.get(2), referenceNode};
				}
				else if(methodName.equals("removeAll"))
				{
					values = new Object[] {referenceNode};
				}
				
				if(definitionKey != null)
				{
					String statement = getStatementFromProperties(definitionKey, values);
					statementBuilder.append(statement);
				}
			}
			else if(isItAStringReference(referenceNode))
			{
				String methodName = childNodes.get(1).toString();
				Object[] values = null;
				
				definitionKey = "String."+ methodName;
				
				if(methodName.equals("split"))
				{
					values = new Object[] {referenceNode, childNodes.get(2)};
				}
				else if(methodName.equals("equalsIgnoreCase"))
				{
					values = new Object[] {referenceNode, childNodes.get(2)};
				}
				
				if(definitionKey != null)
				{
					String statement = getStatementFromProperties(definitionKey, values);
					statementBuilder.append(statement);
				}
			}
			else if(childNodes.get(1).toString().startsWith("close"))
			{
				if(childNodes.size() > 2)
				{
					if(isSQLRelatedStatement(childNodes.get(2)))
					{
						statementBuilder.append("Close ")
						.append(childNodes.get(2));
					}
				}
			}
			else
			{
				if(childNodes.get(1).toString().trim().equals("map"))
				{
					String mappingValue = childNodes.get(1).toString();
					
					if(mappingValue.endsWith(";"))
					{
						mappingValue = mappingValue.substring(0, mappingValue.length() - 1);
					}
					
					childNodes = childNodes.get(2).getChildNodes();
					statementBuilder.append("Map ").append(childNodes.get(1))
					.append(" to ").append(referenceNode);
				}
				else if(childNodes.get(1).toString().trim().equals("sorted"))
				{
					List originalChildNodes = childNodes;
					childNodes = childNodes.get(2).getChildNodes();
					
					
					if(referenceNode.toString().equals("Comparator") && 
							childNodes.get(1).toString().startsWith("comparing") &&
							childNodes.get(2).toString().equals("File::lastModified")
					)
					{
						statementBuilder.append("Sort files based on Last modified date");
					}
					else
					{
					}
				}
				else if(childNodes.size() > 2 && (childNodes.get(1).toString().equals("collect") ||
					childNodes.get(2).toString().startsWith("Collectors."))
				)
				{
					String toCollectionString = childNodes.get(2).toString().substring("Collectors.".length());
					if(toCollectionString.startsWith("to"))
					{
						toCollectionString = toCollectionString.substring(2, toCollectionString.length() - 2);
					}
					statementBuilder.append("Collect the results into a ").append(toCollectionString);
				}
				else if(referenceNode instanceof MethodCallExpr)
				{
					String statement = null;
					
					Node action = childNodes.get(1);

					if(childNodes.size() >= 3)
					{
						statement = getStatementsIfItsBigDecimal(childNodes);
					}
					else
					{
						statement = getStatementOnMethodCall((MethodCallExpr) referenceNode);
					}
					
					if(action != null && action.toString().equals("doubleValue"))
					{
						statementBuilder.append("Get double value from " + statement);
					}
					else
					{
						statementBuilder.append(statement);
					}
				}
			}
		}
		
		return statementBuilder.toString();
	}

	private String getStatementFromProperties(String definitionKey, Object[] values) 
	{
		String statement = apiDefinitionProps.getProperty(definitionKey);
		if(values != null && values.length > 0)
		{
			statement = replaceTokensInStatement(statement, values);
		}
		
		return statement;
	}

	private List<Object> getStatementsFromAssignExpr(AssignExpr assignExpr) 
	{
		List<Object> statementsList = new ArrayList<>();
		StringBuilder statementBuilder = new StringBuilder();
		
		List<Node> childNodes = assignExpr.getChildNodes();
		
		
		for (Node node : childNodes) 
		{
		}
		
		if(childNodes.size() == 2)
		{
			if(childNodes.get(0) instanceof NameExpr)
			{
				if(childNodes.get(1) instanceof ObjectCreationExpr)
				{
					statementBuilder.append("Create an instance of ")
					.append(childNodes.get(1).getChildNodes().get(0));
					statementBuilder.append(" and assign the result to variable ").append(childNodes.get(0));
				}
				else if(childNodes.get(1) instanceof LiteralExpr)
				{
					String operand = assignExpr.toString().substring(childNodes.get(0).toString().length());
					operand = operand.substring(0, operand.indexOf(childNodes.get(1).toString())).trim();
					switch(operand)
					{
						case "=" : 
							statementBuilder.append("Assign ").append(childNodes.get(1)).append(" to ").append(childNodes.get(0));
							break;
						case "+=":
							statementBuilder.append("Append ").append(childNodes.get(1)).append(" to ").append(childNodes.get(0));
							break;
						case "*=":
							statementBuilder.append("Multiply ").append(childNodes.get(0)).append(" by ").append(childNodes.get(1));
							break;
					}
				}
				else if(childNodes.get(1) instanceof NameExpr)
				{
					String leftOperand = childNodes.get(0).toString();
					String rightOperand = childNodes.get(1).toString();
					String operator = assignExpr.toString().substring(leftOperand.length(), assignExpr.toString().lastIndexOf(rightOperand)).trim();
					
					if(operator.equals("="))
					{
						statementBuilder.append("Assign ").append(rightOperand).append(" to ").append(leftOperand);
					}
					else if(operator.endsWith("="))
					{
						operator = operator.substring(0, operator.length() - 1);
						
						switch(operator) 
						{
							case "+" : {
								statementBuilder.append("Increment ").append(leftOperand)
								.append(" by ").append(rightOperand);
							}
							break;
							case "-" : {
								statementBuilder.append("Decrement ").append(leftOperand)
								.append(" by ").append(rightOperand);
							}
							break;
							case "*" : {
								statementBuilder.append("Multiply ").append(leftOperand)
								.append(" by ").append(rightOperand);
							}
							break;
							case "/" : {
								statementBuilder.append("Divide ").append(leftOperand)
								.append(" by ").append(rightOperand);
							}
							break;
						}
					}
					else
					{
					}
				}
				else if(childNodes.get(1) instanceof MethodCallExpr)
				{
					String statementOnMethodCall = getStatementOnMethodCall((MethodCallExpr) childNodes.get(1));
					statementBuilder.append(statementOnMethodCall)
					.append(" and assign the result to variable ").append(childNodes.get(0));
				}
				else if(childNodes.get(1) instanceof ArrayCreationExpr)
				{
					String statementOnMethodCall = getStatementFromArrayCreationExpr((ArrayCreationExpr) childNodes.get(1));
					statementBuilder.append(statementOnMethodCall)
					.append(" and assign it to variable ").append(childNodes.get(0));
				}
				else if(childNodes.get(1) instanceof ArrayAccessExpr)
				{
					String statementOnArrayAccessExpr = getStatementFromArrayAccessExpr((ArrayAccessExpr) childNodes.get(1));
					statementBuilder.append(statementOnArrayAccessExpr)
					.append(" and assign the result to variable ").append(childNodes.get(0));
				}
				else if(childNodes.get(1) instanceof ConditionalExpr)
				{
					Node assignmentVariable = childNodes.get(0);
					Node conditionExpr = childNodes.get(1);
					childNodes = conditionExpr.getChildNodes();
					
					Node condition = null;
					Node operand1 = null;
					Node operand2 = null;
					
					if(childNodes.size() == 3)
					{
						List ifConditionSummary = new ArrayList<>();
						List ifCondition = new ArrayList<>();
						List ifBlockLogicList = new ArrayList<>();
						List elseBlockLogicList = new ArrayList<>();

						condition = childNodes.get(0);
						
						if(condition instanceof EnclosedExpr)
						{
							condition = condition.getChildNodes().get(0);
						}

						operand1 = childNodes.get(1);
						operand2 = childNodes.get(2);
						
						ifConditionSummary.add("IF");
						ifConditionSummary.add(ifCondition);
						ifConditionSummary.add(ifBlockLogicList);
						ifConditionSummary.add(elseBlockLogicList);
						
						String statement = null;
						
						if(condition instanceof BinaryExpr)
						{
							statement = getStatementFromBinaryExpr((BinaryExpr) condition);
						}
						else
						{
							statement = getStatementOnMethodCall((MethodCallExpr) condition);
						}
						
						ifCondition.add(statement);
						ifBlockLogicList.add("Assign " + operand1 + " to " + assignmentVariable);
						elseBlockLogicList.add("Assign " + operand2 + " to " + assignmentVariable);
						
						statementsList.add(ifConditionSummary);
						
						return statementsList;
					}
				}
				else if(childNodes.get(1) instanceof EnclosedExpr)
				{
					Node actualExpr = childNodes.get(1).getChildNodes().get(0);
					String actualStatement = null;
					if(actualExpr instanceof BinaryExpr)
					{
						actualStatement = getStatementFromBinaryExpr((BinaryExpr) actualExpr);
					}
					
					if(actualStatement != null && actualStatement.trim().length() > 0)
					{
						statementBuilder.append("(").append(actualStatement).append(")")
						.append(" and assign the result to variable ").append(childNodes.get(0));
					}
				}
				else if(childNodes.get(1) instanceof CastExpr)
				{
					Node actualExpr = childNodes.get(1).getChildNodes().get(1);
					List<Object> actualStatement = null;
					
					if(actualExpr instanceof MethodCallExpr)
					{
						actualStatement = getStatementsFromMethodCall((MethodCallExpr) actualExpr);
					}
					
					if(actualStatement != null && actualStatement.size() > 0)
					{
						statementBuilder.append(actualStatement.get(0))
						.append(" and assign the result to variable ").append(childNodes.get(0));
					}
				}
				else if(childNodes.get(1) instanceof FieldAccessExpr)
				{
					statementBuilder.append("Assign ").append(childNodes.get(1)).append(" to ").append(childNodes.get(0));
				}
				else if(childNodes.get(1) instanceof UnaryExpr)
				{
					statementBuilder.append(getStatementFromUnaryExpr((UnaryExpr) childNodes.get(1)));
				}
				else if(childNodes.get(1) instanceof BinaryExpr)
				{
					String statementFromBinaryExpr = getStatementFromBinaryExpr((BinaryExpr) childNodes.get(1));
					statementBuilder.append(statementFromBinaryExpr);
				}
				else if(childNodes.get(1).toString().startsWith("\"INSERT INTO"))
				{
					statementBuilder.append("Define an Insert query")
					.append(" and assign the result to variable ").append(childNodes.get(0));
				}
				else if(childNodes.get(1).toString().startsWith("\"UPDATE "))
				{
					statementBuilder.append("Define an Update query")
					.append(" and assign the result to variable ").append(childNodes.get(0));
				}
			}
			else if(childNodes.get(0) instanceof FieldAccessExpr && childNodes.get(1) instanceof NameExpr)
			{
				statementBuilder.append("Assign ").append(childNodes.get(1)).append(" to ").append(childNodes.get(0));
			}
			else if(childNodes.get(0) instanceof ArrayAccessExpr)
			{
				if(childNodes.get(1) instanceof MethodCallExpr)
				{
					String stmtFromMethodCall = getStatementOnMethodCall((MethodCallExpr) childNodes.get(1));
					statementBuilder.append(stmtFromMethodCall).append(" and assign it to ").append(childNodes.get(0));
				}
				if(childNodes.get(1) instanceof NameExpr)
				{
					statementBuilder.append("Assign ").append(childNodes.get(1)).append(" to ").append(childNodes.get(0));
				}
			}
			else
			{
				for (Node node2 : childNodes) 
				{
				}
			}
		}
		else
		{
		}
		
		statementsList.add(statementBuilder.toString());
		
		return statementsList;
	}

	public String getStatementFromReturnStmt(ReturnStmt returnStmt) 
	{
		List<Node> childNodes = returnStmt.getChildNodes();
		
		if(childNodes.size() == 0)
		{
			return "Return";
		}
		
		Node childNode = childNodes.get(0);
		String returnValue = null;
		
		if(childNode instanceof MethodCallExpr)
		{
			returnValue = getStatementOnMethodCall((MethodCallExpr) childNode);
		}
		else
		{
			returnValue = childNodes.get(0).toString();
		}
		
		return "Return " + returnValue;
	}
	
	private String getStatementFromContinueStmt(ContinueStmt continueStmt) 
	{
		return "Continue";
	}

	private String getStatementFromBreakStmt(BreakStmt breakStmt) 
	{
		return "Break";
	}

	private boolean isIORelatedStatement(Node javaStatementNode) 
	{
		boolean ioStatement = false;
		
		long noOfIOStmt = variablesMap.keySet()
		.stream().filter(variableName -> {
			String className = variablesMap.get(variableName);
			String importStmt = importedClassDetailsMap.get(className);
			return (importStmt != null && importStmt.startsWith("java.io."));
		}).count();
		
		ioStatement = noOfIOStmt > 0;
		
		return ioStatement;
	}

	private boolean isSQLRelatedStatement(Node javaStatementNode) 
	{
		boolean sqlStatement = false;
		long noOfSQLStmt = variablesMap.keySet()
		.stream().filter(variableName -> {
			String className = variablesMap.get(variableName);
			String importStmt = importedClassDetailsMap.get(className);
			return (importStmt != null && importStmt.startsWith("java.sql."));
		}).count();
		
		sqlStatement = noOfSQLStmt > 0;
		
		return sqlStatement;
	}

	private Object getStatementFromVariableDeclarationExpr(Node childNode) 
	{
		List<String> variableDeclarationsList = new ArrayList<>();
		List<Node> childNodes = childNode.getChildNodes();

		for (Node node : childNodes) 
		{

			if(node instanceof VariableDeclarator)
			{
				variableDeclarationsList.add(getStatementFromVariableDeclarator(node));
			}
		}
		
		return variableDeclarationsList;
	}

	private String getStatementFromVariableDeclarator(Node childNode) 
	{
		StringBuilder statementBuilder = new StringBuilder();
		
		List<Node> childNodes = childNode.getChildNodes();
		
		for (Node node : childNodes) 
		{
		}
		
		if(childNodes.size() == 3)
		{
			if(childNodes.get(0) instanceof ClassOrInterfaceType &&
				childNodes.get(1) instanceof SimpleName && 
				childNodes.get(2) instanceof ObjectCreationExpr)
			{
				statementBuilder.append("Create an instance of ").append(childNodes.get(0));
				statementBuilder.append(" and assign it to variable ").append(childNodes.get(1));
			}
			else if(childNodes.get(0) instanceof ClassOrInterfaceType &&
					childNodes.get(1) instanceof SimpleName && 
					childNodes.get(2) instanceof CastExpr)
			{
				List<Node> childs = childNodes.get(2).getChildNodes();
				Node actualNode = childs.get(1);
				
				if(actualNode instanceof MethodCallExpr)
				{
					String statementOnMethodCall = getStatementOnMethodCall((MethodCallExpr) actualNode);
					statementBuilder.append(statementOnMethodCall).append(" and assign the result to variable ").append(childNodes.get(1));
				}
			}
			else if(childNodes.get(0) instanceof ArrayType &&
					childNodes.get(1) instanceof SimpleName &&
					childNodes.get(2) instanceof ArrayInitializerExpr)
			{
				statementBuilder.append("Initialize an array ").append(childNodes.get(2)).append("");
				statementBuilder.append(" of type ").append(childNodes.get(0)).append("");
				statementBuilder.append(" to ").append(childNodes.get(0).toString());
			}
			else if(childNodes.get(0) instanceof ArrayType &&
					childNodes.get(1) instanceof SimpleName &&
					childNodes.get(2) instanceof ArrayCreationExpr)
			{
				statementBuilder.append("Create an empty array ").append(childNodes.get(1)).append("");
				statementBuilder.append(" of type ").append(childNodes.get(0)).append("");
				statementBuilder.append(" with size ").append(childNodes.get(2).getChildNodes().get(1).getChildNodes().get(0));
			}
			else if(childNodes.get(0) instanceof ArrayType &&
					childNodes.get(1) instanceof SimpleName &&
					childNodes.get(2) instanceof NameExpr)
			{
				statementBuilder.append("Initialize variable ").append(childNodes.get(1)).append("");
				statementBuilder.append(" of type ").append(childNodes.get(0)).append("");
				statementBuilder.append(" as ").append(childNodes.get(2).toString());
			}
			else if(childNodes.get(1) instanceof SimpleName &&
				childNodes.get(2) instanceof MethodCallExpr)
			{
				String statementOnMethodCall = getStatementOnMethodCall((MethodCallExpr) childNodes.get(2));
				statementBuilder.append(statementOnMethodCall).append(" and assign the result to variable ").append(childNodes.get(1));
			}
			else if(childNodes.get(0) instanceof ClassOrInterfaceType &&
					childNodes.get(1) instanceof SimpleName &&
					(childNodes.get(2) instanceof BinaryExpr || childNodes.get(2) instanceof StringLiteralExpr))
			{
				if("String".equalsIgnoreCase(childNodes.get(0).toString()))
				{
					String resultVariable = childNodes.get(1).toString();
					if(childNodes.get(2).toString().contains("SELECT "))
					{
						statementBuilder.append("Create an SQL Select statement")
						.append(" and assign the result to variable ").append(resultVariable);
					}
					else if(childNodes.get(2).toString().contains("UPDATE "))
					{
						statementBuilder.append("Create an SQL Update statement")
						.append(" and assign the result to variable ").append(resultVariable);
					}
					else if(childNodes.get(2).toString().contains("DELETE "))
					{
						statementBuilder.append("Create an SQL Delete statement")
						.append(" and assign the result to variable ").append(resultVariable);
					}
					else if(childNodes.get(2).toString().contains("+"))
					{
						statementBuilder.append(getStatementFromBinaryExpr((BinaryExpr) childNodes.get(2)))
						.append(" and assign the result to variable ").append(childNodes.get(1));
					}
					else
					{
						statementBuilder.append("Assign ").append(childNodes.get(2))
						.append(" to variable ").append(childNodes.get(1));
					}
				}
				else
				{
				}
			}
			else if(childNodes.get(0) instanceof Type &&
					childNodes.get(1) instanceof SimpleName &&
					childNodes.get(2) instanceof LiteralExpr)
			{
				statementBuilder.append("Initialize variable ").append(childNodes.get(1)).append("");
				statementBuilder.append(" of type ").append(childNodes.get(0)).append("");
				statementBuilder.append(" as ").append(childNodes.get(2).toString());
			}
			else if(childNodes.get(0) instanceof PrimitiveType &&
					childNodes.get(1) instanceof SimpleName &&
					childNodes.get(2) instanceof UnaryExpr)
			{
				statementBuilder.append("Initialize variable ").append(childNodes.get(1)).append("");
				statementBuilder.append(" of type ").append(childNodes.get(0)).append("");
				statementBuilder.append(" as ").append(childNodes.get(2).toString());
			}
			else if(childNodes.get(0) instanceof PrimitiveType &&
					childNodes.get(1) instanceof SimpleName &&
					childNodes.get(2) instanceof BinaryExpr)
			{
				statementBuilder.append("Initialize variable ").append(childNodes.get(1)).append("");
				statementBuilder.append(" of type ").append(childNodes.get(0)).append("");
				statementBuilder.append(" as ").append(getStatementFromBinaryExpr((BinaryExpr) childNodes.get(2)));
			}
			else if(childNodes.get(0) instanceof PrimitiveType &&
					childNodes.get(1) instanceof SimpleName &&
					childNodes.get(2) instanceof AssignExpr)
			{
				List stmts = getStatementsFromAssignExpr((AssignExpr) childNodes.get(2));
				if(stmts != null && stmts.get(0).toString().trim().length() > 0)
				{
					statementBuilder.append(stmts.get(0));
					statementBuilder.append(" and assign it to variable ").append(childNodes.get(1).toString());
				}
			}
			else if(childNodes.get(0) instanceof PrimitiveType &&
					childNodes.get(1) instanceof SimpleName &&
					childNodes.get(2) instanceof FieldAccessExpr)
			{
				if(childNodes.get(2).toString().contains(".length"))
				{
					statementBuilder.append("Find length of array ").append(childNodes.get(2).getChildNodes().get(0)).append("");
					statementBuilder.append(" and assign the result to variable ").append(childNodes.get(1).toString());
				}
			}
			else
			{
				for (Node node2 : childNodes) 
				{
				}
			}
		}
		else if(childNodes.size() == 2)
		{
			if(childNodes.get(1) instanceof SimpleName)
			{
				statementBuilder.append("Declare variable " + childNodes.get(1) + " of type " + childNodes.get(0));
			}
		}
		
		return statementBuilder.toString();
	}

	private boolean isItAPrintStatement(Node javaStatementNode) 
	{
		List<Node> childNodes = javaStatementNode.getChildNodes();
		
		if((childNodes.get(0).toString().equalsIgnoreCase("System.out") || 
				childNodes.get(0).toString().equalsIgnoreCase("System.err")) &&
				childNodes.get(1).toString().startsWith("print"))
		{
			return true;
		}

		return false;
	}

	private String getStatementFromPrintStatement(Node javaStatementNode) 
	{
		StringBuilder statementBuilder = new StringBuilder();
		List<Node> childNodes = javaStatementNode.getChildNodes();
		
		if((childNodes.get(0).toString().equalsIgnoreCase("System.out") || 
				childNodes.get(0).toString().equalsIgnoreCase("System.err")) &&
				childNodes.get(1).toString().startsWith("print"))
		{
			statementBuilder.append("Print (").append(childNodes.get(2)).append(")");
		}

		return statementBuilder.toString();
	}

	
	public String getStatementFromBinaryExpr(BinaryExpr binaryExpr) 
	{
		String returnStmtFromBinaryExpr = null;
		
		StringBuilder statementBuilder = new StringBuilder();
		
		List<Node> childNodes = binaryExpr.getChildNodes();
		
		Node leftOperand = childNodes.get(0).removeComment();
		Node rightOperand = childNodes.get(1).removeComment();
		String operator = binaryExpr.toString().substring(leftOperand.toString().length(), binaryExpr.toString().lastIndexOf(rightOperand.toString())).trim();
		
		
		String leftOperandMeaning = null;
		String rightOperandMeaning = null;
		String stmtFromBinaryExpr = null;
		
		
		if(leftOperand instanceof BinaryExpr)
		{
			leftOperandMeaning = getStatementFromBinaryExpr((BinaryExpr)leftOperand);
		}
		else if(leftOperand instanceof UnaryExpr)
		{
			leftOperandMeaning = getStatementFromUnaryExpr((UnaryExpr)leftOperand);
		}
		else if(leftOperand instanceof MethodCallExpr)
		{
			leftOperandMeaning = getStatementsFromMethodCall((MethodCallExpr) leftOperand).get(0).toString();
		}
		else
		{
			leftOperandMeaning = leftOperand.toString();
		}
		
		if(rightOperand instanceof BinaryExpr)
		{
			rightOperandMeaning = getStatementFromBinaryExpr((BinaryExpr)rightOperand);
		}
		else if(rightOperand instanceof UnaryExpr)
		{
			rightOperandMeaning = getStatementFromUnaryExpr((UnaryExpr)rightOperand);
		}
		else if(rightOperand instanceof MethodCallExpr)
		{
			rightOperandMeaning = getStatementsFromMethodCall((MethodCallExpr) rightOperand).get(0).toString();
		}
		else
		{
			rightOperandMeaning = rightOperand.toString();
		}
		
		
		if(operator != null)
		{
			stmtFromBinaryExpr = getStatementFromBinaryExpr(leftOperandMeaning, rightOperandMeaning, operator);
			statementBuilder.append(stmtFromBinaryExpr);
		}
		else
		{
			stmtFromBinaryExpr = getStatementFromBinaryExpr(leftOperandMeaning, rightOperandMeaning, operator);
			statementBuilder.append(stmtFromBinaryExpr);
		}
		
		
		returnStmtFromBinaryExpr = statementBuilder.toString();
		
		while(returnStmtFromBinaryExpr.contains("Concatenate Concatenate"))
		{
			returnStmtFromBinaryExpr = returnStmtFromBinaryExpr.replace("Concatenate Concatenate", "Concatenate");
		}
		

		return returnStmtFromBinaryExpr;
	}

	private String getStatementFromUnaryExpr(UnaryExpr unaryExpr) 
	{
		StringBuilder statementBuilder = new StringBuilder();
		
		List<Node> childNodes = null;
		
		if(unaryExpr.toString().endsWith("++"))
		{
			statementBuilder.append("Increment ").append(unaryExpr.getChildNodes().get(0)).append(" by 1");
		}
		else if(unaryExpr.toString().endsWith("--"))
		{
			statementBuilder.append("Decrement ").append(unaryExpr.getChildNodes().get(0)).append(" by 1");
		}
		else if(unaryExpr.toString().startsWith("!"))
		{
			Node nodeFromUnaryExpr = unaryExpr.getChildNodes().get(0);
			childNodes = nodeFromUnaryExpr.getChildNodes();
			if(nodeFromUnaryExpr instanceof MethodCallExpr)
			{
				Node referenceObject = null;
				Node methodName = null;
				List<Node> paramsList = null;
				
				if(childNodes.size() > 1)
				{
					referenceObject = childNodes.get(0);
					methodName = childNodes.get(1);
					paramsList = getParamsList(childNodes);
					List<String> descFromMethodCall = getDescriptionForMethodCall(referenceObject, methodName, paramsList, true);
					statementBuilder.append(descFromMethodCall.get(0));
				}
				else
				{
					methodName = childNodes.get(0);
					statementBuilder.append(methodName);
				}
				
			}
			else
			{
				statementBuilder.append("NOT ").append(childNodes.get(0));
			}
		}
		else if(unaryExpr.toString().startsWith("-"))
		{
			statementBuilder.append("Change the sign of ").append(unaryExpr.getChildNodes().get(0));
		}
		else
		{
		}
		return statementBuilder.toString();
	}

	private String getStatementFromBinaryExpr(String leftOperand, String rightOperand, String operator) 
	{
		StringBuilder statementBuilder = new StringBuilder();
		switch(operator) 
		{
			case "<" : {
				statementBuilder.append(leftOperand)
				.append(" is lesser than ")
				.append(rightOperand);
			}
			break;
			case ">" : {
				statementBuilder.append(leftOperand)
				.append(" is greater than ")
				.append(rightOperand);
			}
			break;
			case "<=" : {
				statementBuilder.append(leftOperand)
				.append(" is lesser than or equal to ")
				.append(rightOperand);
			}
			break;
			case ">=" : {
				statementBuilder.append(leftOperand)
				.append(" is greater than or equal to ")
				.append(rightOperand);
			}
			break;
			case "==" : {
				statementBuilder.append(leftOperand)
				.append(" is equal to ")
				.append(rightOperand);
			}
			break;
			case "!=" : {
				statementBuilder.append(leftOperand)
				.append(" is not equal to ")
				.append(rightOperand);
			}
			break;
			case "&&" : {
				statementBuilder.append(leftOperand)
				.append(" AND ")
				.append(rightOperand);
			}
			break;
			case "||" : {
				statementBuilder.append(leftOperand)
				.append(" OR ")
				.append(rightOperand);
			}
			break;
			case "%" : {
				statementBuilder.append(leftOperand)
				.append(" % ")
				.append(rightOperand);
			}
			break;
			case "+" : {
				statementBuilder.append("Concatenate ")
				.append(leftOperand).append(", ")
				.append(rightOperand);
			}
			break;
			case "-" : {
				statementBuilder.append("Subtract ")
				.append(rightOperand).append(" from ")
				.append(leftOperand);
			}
			break;
			case "*" : {
				statementBuilder.append("Multiply ").append(leftOperand)
				.append(" by ").append(rightOperand);
			}
			break;
			case "/" : {
				statementBuilder.append("Divide ")
				.append(leftOperand).append(" from ")
				.append(rightOperand);
			}
			break;
		}
		
		return statementBuilder.toString();
	}

	private String getStatementOnMethodCall(MethodCallExpr methodCallExpr) 
	{
		List<Node> childNodes = methodCallExpr.getChildNodes();
		

		String definitionKey = null;
		String statement = null;

		statement = getStatementFromJavaAPIClasses(methodCallExpr.getChildNodes());
		
		
		for (Object object : childNodes) 
		{
		}
		
		if(statement != null && !statement.trim().equals("null") && statement.trim().length() > 0)
		{
			return statement;
		}
		else if(childNodes.get(0) instanceof SimpleName)
		{
			//List paramsList = getParamsList(childNodes, 1);
			statement = "Call " + childNodes.get(0);// + " with Params " + paramsList;
			
			return statement;
		}
		else if(childNodes.size() >= 3)
		{
			Node action = childNodes.get(1);
			
			Node referenceObject = childNodes.get(0);
			Node methodNode = childNodes.get(1);
			List paramsList = getParamsList(childNodes);
			
			List<String> descFromMethodCall = getDescriptionForMethodCall(referenceObject, methodNode, paramsList, false);
			
			

			if(descFromMethodCall.size() > 0)
			{
				if(descFromMethodCall.get(0).toString().trim().length() > 0)
				{
					return descFromMethodCall.get(0);
				}
			}

			
			if(action instanceof SimpleName)
			{
				if(isItAConnectionReference(childNodes.get(0)))
				{
					String methodName = childNodes.get(1).toString();
					definitionKey = "Connection" + "." + methodName;
					
					String sqlObjectDetails = null;
					
					if(methodName.equals("prepareCall"))
					{
						String packageName = null;
						String funcOrProcCall = childNodes.get(2).toString();
						boolean functionCall = false;
						
						if(funcOrProcCall.contains("call "))
						{
							if(funcOrProcCall.indexOf("?") < funcOrProcCall.indexOf("call "))
							{
								functionCall = true;
							}
							
							funcOrProcCall = funcOrProcCall.substring(funcOrProcCall.indexOf("call ") + 5);
							funcOrProcCall = funcOrProcCall.substring(0, funcOrProcCall.indexOf("("));
							
							if(funcOrProcCall.contains("."))
							{
								packageName = funcOrProcCall.substring(0, funcOrProcCall.indexOf("."));
								funcOrProcCall = funcOrProcCall.substring(funcOrProcCall.indexOf(".") + 1);
							}
							
							
							if(functionCall)
							{
								sqlObjectDetails = "Function ";
							}
							else
							{
								sqlObjectDetails = "Procedure ";
							}
							
							if(funcOrProcCall != null)
							{
								sqlObjectDetails += funcOrProcCall;
							}
							
							if(packageName != null)
							{
								sqlObjectDetails += " from package " + packageName;
							}
						}
						
						statement = getStatementFromProperties(definitionKey, new Object[] {sqlObjectDetails});
					}
				}
				else if(childNodes.get(0) instanceof NameExpr)
				{

				}
				else
				{
					statement = getStatementsIfItsBigDecimal(childNodes);
				}
			}
			else
			{
			}

			return statement;
		}
		else if(childNodes.size() == 1)
		{
			return "Call " + childNodes.get(0) + "()";
		}
		
		return "Call " + childNodes.get(1) + "() on variable " + childNodes.get(0);
	}
	
	private String getStatementsIfItsBigDecimal(List<Node> childNodes) 
	{
		String statement = null;
		
		Node operand1 = childNodes.get(0);
		Node action = childNodes.get(1);
		Node operand2 = childNodes.get(2);
		boolean isOperand1BigDecimal = checkIfThisVariableIsBigDecimal(childNodes.get(0));
		boolean isOperand2BigDecimal = checkIfThisVariableIsBigDecimal(childNodes.get(2));
		
		if(isOperand1BigDecimal && isOperand2BigDecimal)
		{
			statement = getStatementFromBigDecimals(operand1, operand2, action);
		}
		else
		{
		}

		return statement;
	}

	private String getStatementFromBigDecimals(Node operand1, Node operand2, Node action) 
	{
		String statement = null;
		
		if(operand1 instanceof EnclosedExpr)
		{
			operand1 = operand1.getChildNodes().get(0);
		}
		
		if(operand2 instanceof EnclosedExpr)
		{
			operand2 = operand2.getChildNodes().get(0);
		}
		
		switch(action.toString())
		{
			case "subtract" :
				statement = "Substract " + getVariableFromBigDecimal(operand2) + " from " + getVariableFromBigDecimal(operand1);
				break;
			case "add" :
				statement = "Add " + getVariableFromBigDecimal(operand2) + " to " + getVariableFromBigDecimal(operand1);
				break;
			case "multiply" :
				if(operand1.toString().equals(operand2.toString()))
				{
					statement = "Square " + getVariableFromBigDecimal(operand1);
				}
				else
				{
					statement = "Multiply " + getVariableFromBigDecimal(operand1) + " with " + getVariableFromBigDecimal(operand2);
				}
				break;
			case "divide" :
				statement = "Divide " + getVariableFromBigDecimal(operand1) + " by " + getVariableFromBigDecimal(operand2);
				break;
		}
		
		return statement;
	}

	private boolean isItAnIOReference(Node node) 
	{
		String variableName = node.toString();
		String className = variablesMap.get(variableName);
		String importStmt = importedClassDetailsMap.get(className);
		return importStmt != null && importStmt.startsWith("java.io.");
	}

	private boolean isItAConnectionReference(Node node) 
	{
		String variableName = node.toString();
		String className = variablesMap.get(variableName);
		return className != null && className.equals("Connection");
	}

	private boolean isItAnSQLStatementReference(Node node) 
	{
		String variableName = node.toString();
		String className = variablesMap.get(variableName);
		return className != null && className.contains("Statement") && isSQLRelatedStatement(node);
	}

	private boolean isItAnSQLResultSetReference(Node node) 
	{
		String variableName = node.toString();
		String className = variablesMap.get(variableName);
		return className != null && className.contains("ResultSet") && isSQLRelatedStatement(node);
	}
	
	private boolean isItALoggerReference(Node node) 
	{
		String variableName = node.toString();
		String className = variablesMap.get(variableName);
		return className != null && className.contains("Logger");
	}

	private boolean isItAMapReference(Node node) 
	{
		String variableName = node.toString();
		String className = variablesMap.get(variableName);
		return className != null && (className.contains("Map") || className.contains("Hashtable"));
	}

	private boolean isItAListReference(Node node) 
	{
		String variableName = node.toString();
		String className = variablesMap.get(variableName);
		return className != null && (className.contains("List") || className.contains("Vector"));
	}

	private boolean isItAStringReference(Node node) 
	{
		String variableName = node.toString();
		String className = variablesMap.get(variableName);
		return className != null && className.contains("String");
	}

	private boolean isItAPropertiesReference(Node node) 
	{
		String variableName = node.toString();
		String className = variablesMap.get(variableName);
		String importStmt = importedClassDetailsMap.get(className);

		return importStmt != null && importStmt.startsWith("java.util.Properties");
	}
	
	private String getVariableFromBigDecimal(Node bigDecimal)
	{
		List<Node> childNodes = bigDecimal.getChildNodes();
		
		if(childNodes.size() == 3 && childNodes.get(1).toString().equals("valueOf"))
		{
			return childNodes.get(2).toString();
		}
		else if(childNodes.size() == 3)
		{
			String statement = getStatementsIfItsBigDecimal(childNodes);
			
			
			return "(" + statement + ")";
		}
		
		return bigDecimal.toString();
	}

	private boolean checkIfThisVariableIsBigDecimal(Node node) 
	{
		boolean isThisOperandBigDecimal = false;
		
		if(node instanceof EnclosedExpr)
		{
			node = node.getChildNodes().get(0);
		}


		if(node.toString().contains("BigDecimal"))
		{
			isThisOperandBigDecimal = true;
		}
		else if(node instanceof NameExpr)
		{
			String className = javaCodeVisualizer.getClassNameForThisVariable(node.toString());
			if(className != null && className.equals("BigDecimal"))
			{
				isThisOperandBigDecimal = true;
			}
			else if(className == null)
			{
			}
		}
		
		return isThisOperandBigDecimal;
	}

	public List<Object> getStatementsListFromLambdaExpr(ExpressionStmt expressionStmt) 
	{
		List<Object> statementsList = new ArrayList<>();
		List<Node> childNodes = expressionStmt.getChildNodes();
		
		for (Node node : childNodes) 
		{
		}
		
		if(childNodes.size() == 1)
		{
			if(childNodes.get(0) instanceof MethodCallExpr)
			{
				List<Object> stmtsFromMethodCall = getStatementsFromMethodCall((MethodCallExpr)childNodes.get(0));
				if(stmtsFromMethodCall != null && stmtsFromMethodCall.size() > 0)
				{
					statementsList.addAll(stmtsFromMethodCall);
				}
			}
			else if(childNodes.get(0) instanceof AssignExpr)
			{
				statementsList.addAll(getStatementsFromAssignExpr((AssignExpr) childNodes.get(0)));
			}
			else if(childNodes.get(0) instanceof VariableDeclarationExpr)
			{
				List<Object> statements = getStatementsListFromVariableDeclarationExpr(childNodes.get(0));
				statementsList.addAll(statements);
			}
		}
		

		return statementsList;
	}
	
	public List<Object> getStatementsFromMethodCall(MethodCallExpr methodCallExpr) 
	{
		
		List<Object> statementsList = new ArrayList<>();
		List<Node> childNodes = methodCallExpr.getChildNodes();


		Node referenceObject = null;
		Node methodName = null;

		if(childNodes.size() > 1)
		{
			referenceObject = childNodes.get(0);
			methodName = childNodes.get(1);
		}
		else
		{
			methodName = childNodes.get(0);
		}
		
		List<Node> paramsList = getParamsList(childNodes);
		
		
		if(referenceObject instanceof MethodCallExpr)
		{
			List<Object> statementsFromMethodCall = getStatementsFromMethodCall((MethodCallExpr) referenceObject);
			
			
			if(statementsFromMethodCall != null && statementsFromMethodCall.size() > 0)
			{
				for (Object object : statementsFromMethodCall) 
				{
					if(!statementsList.contains(object.toString().trim()))
					{
						statementsList.add(object.toString().trim());
					}
				}
			}
		}
		
		
		List<String> statementsFromMethodCall = getDescriptionForMethodCall(referenceObject, methodName, paramsList, false);
		
		if(statementsFromMethodCall != null)
		{
			if(methodName.toString().contains("forEach"))
			{
				childNodes = (paramsList.get(0)).getChildNodes();
				Node parameter = childNodes.get(0);

				List<Object> forBlockSummary = new ArrayList<>();
				List<Object> forBlockDetailsList = new ArrayList<>();
				List<Object> forStatementsList = new ArrayList<>();
				forBlockDetailsList.add("FOR");
				
				List<Object> forConditionList = new ArrayList<>();
				
				if(parameter instanceof NameExpr)
				{
					forConditionList.add("For each " + parameter.getClass().getName() + " from List");
				}
				else
				{
					forConditionList.add("For each value from List");
				}
				
				forBlockDetailsList.add(forConditionList);
				
				for (String eachStatement : statementsFromMethodCall) 
				{
					forStatementsList.add(eachStatement);
				}
				
				forStatementsList.add("End - For");
				forBlockDetailsList.add(forStatementsList);
				
				forBlockSummary.add(forBlockDetailsList);
				
				statementsList.add(forBlockDetailsList);
			}
			else if(methodName.toString().contains("lines"))
			{
				statementsList.add("Get lines from " + referenceObject);
			}
			else if(methodName.toString().contains("filter"))
			{
				statementsList.add(getStatementFromFilterStmt(paramsList));
			}
			else if(methodName.toString().contains("map"))
			{
				statementsList.add(getStatementOnMethodCall(methodCallExpr));
			}
			else
			{
				for (String eachStatement : statementsFromMethodCall) 
				{
					statementsList.add(eachStatement);
				}
			}
		}
		
		
		return statementsList;
	}

	private List<Node> getParamsList(List<Node> childNodes) 
	{
		return getParamsList(childNodes, 2);
	}
	
	private List<Node> getParamsList(List<Node> childNodes, int paramsIndex) 
	{
		List<Node> paramsList = null;
		if(childNodes.size() > paramsIndex)
		{
			paramsList = new ArrayList<>();
			for (int paramIndex = paramsIndex; paramIndex < childNodes.size(); paramIndex++) 
			{
				paramsList.add(childNodes.get(paramIndex));
			}
		}
		
		return paramsList;
	}

	public List<String> getDescriptionForMethodCall(Node referenceObject, Node methodName, List<Node> paramsList, boolean not)
	{

		List<String> statementsList = new ArrayList<>();
		String nodeName = null;
		if(methodName instanceof SimpleName)
		{
			if(methodName.toString().equals("forEach"))
			{
				if(paramsList.toString().contains("System.out::print"))
				{
					nodeName = "Print value";
				}
				else
				{
					if(paramsList.get(0) instanceof LambdaExpr)
					{
						List<String> statementFromLambda = getStatementFromLambda((LambdaExpr) paramsList.get(0));
						if(statementFromLambda != null && statementFromLambda.size() > 0)
						{
							nodeName = statementFromLambda.get(0);
						}
						else
						{
						}
					}
					else if(paramsList.get(0) instanceof MethodReferenceExpr)
					{
						nodeName = getStatementFromJavaAPIClasses(paramsList.get(0).getChildNodes());
					}
					else
					{
					}
				}
			}
			else if(methodName.toString().equals("filter"))
			{
				nodeName = getStatementFromFilterStmt(paramsList);
			}
			else if(methodName.toString().equals("asList") && referenceObject.toString().contains("Arrays"))
			{
				nodeName = "Create a List object from the Array of " + paramsList;
			}
			else if(methodName.toString().equals("stream"))
			{
				nodeName = "Open stream on " + referenceObject;
			}
			else if(methodName.toString().equals("isEmpty"))
			{
				nodeName = referenceObject + " is empty";
			}
			else if(methodName.toString().startsWith("print") && referenceObject.toString().startsWith("System."))
			{
				nodeName = "Print (" + paramsList.get(0) + ")";
			}
			else if(methodName.toString().startsWith("exists"))
			{
				nodeName = referenceObject + " is existing";
			}
			else if(methodName.toString().startsWith("next"))
			{
				nodeName = "rows are available in Result Set";
			}
			else if(methodName.toString().startsWith("contains") || methodName.toString().startsWith("startsWith") || methodName.toString().startsWith("endsWith"))
			{
				nodeName = referenceObject.toString();
				if(not)
				{
					nodeName += " doesn't";
				}
				nodeName += " " + methodName + " \"" + paramsList.get(0) + "\"";
			}
			else if(methodName.toString().equals("isNaN"))
			{
				nodeName = referenceObject + " is not a number";
			}
			else if(methodName.toString().startsWith("equals") || methodName.toString().startsWith("equalsIngoreCase"))
			{
				if(methodName.toString().startsWith("equalsIngoreCase"))
				{
					nodeName = "upper(\"" + referenceObject + "\") == upper(" + paramsList.get(0) + ")";
				}
				else
				{
					nodeName = "\"" + referenceObject + "\" == " + paramsList.get(0);
				}
			}
			else if(methodName.toString().startsWith("valueOf"))
			{
				nodeName = paramsList.get(0).toString();
			}
			else if(methodName.toString().startsWith("booleanValue"))
			{
				nodeName = referenceObject.toString();
			}
			else if(methodName.toString().equals("hasNext"))
			{
				nodeName = referenceObject.toString() + " has next value";
			}
			else if(methodName.toString().equals("isTerminated"))
			{
				nodeName = referenceObject.toString() + " is terminated";
			}
			else if(methodName.toString().equals("keySet"))
			{
				nodeName = "Get key set from " + referenceObject.toString();
			}
			else if(methodName.toString().contains("isPresent"))
			{
				nodeName = "value present in " + referenceObject.toString();
			}
			else if(methodName.toString().contains("lines"))
			{
				nodeName = "Get lines from " + referenceObject.toString();
			}
			else if(methodName.toString().contains("lines"))
			{
				nodeName = referenceObject.toString() + " and " + paramsList.get(0) + " are equal";
			}
			else if(referenceObject != null)
			{
				List<Node> childNodes = new ArrayList<>();
				childNodes.add(referenceObject);
				childNodes.add(methodName);
				if(paramsList != null && paramsList.size() > 0)
				{
					childNodes.addAll(paramsList);
				}
				
				nodeName = getStatementFromJavaAPIClasses(childNodes);
				
				if(nodeName == null || nodeName.trim().equals("null") || nodeName.trim().length() == 0)
				{
					if(getClassNameForVariable(referenceObject.toString()) != null)
					{
						nodeName = "Call " + methodName + " on variable " + getClassNameForVariable(referenceObject.toString());
					}
					else if(referenceObject.toString().startsWith("BigDecimal.valueOf") && methodName.toString().startsWith("setScale"))
					{
						nodeName = referenceObject.toString().substring("BigDecimal.valueOf(".length());
						nodeName = nodeName.substring(0, nodeName.indexOf(")"));
					}
					else
					{
						nodeName = "Call " + referenceObject + "." + methodName + " with params " + paramsList;
					}
				}
			}
			else if(referenceObject == null)
			{
				nodeName = methodName.toString();
			}
			
			statementsList.add(nodeName);
		}
		else if(methodName instanceof MethodCallExpr)
		{
			List<Object> statementsFromMethodCall = getStatementsFromMethodCall((MethodCallExpr) methodName);
			for (Object object : statementsFromMethodCall) 
			{
				if(object instanceof String)
				{
					statementsList.add((String) object);
				}
			}
		}
		else if(methodName instanceof NameExpr)
		{
			statementsList.add("Call " + referenceObject);
		}
		else
		{
		}
		
		
		return statementsList;
	}
	
	private String getStatementFromFilterStmt(List<Node> paramsList) 
	{
		String nodeName = null;
		

		List<String> filterStatements = getStatementFromLambda((LambdaExpr)(paramsList.get(0)));
		
		
		StringBuilder filterStmtBuilder = new StringBuilder();
		if(filterStatements != null && filterStatements.size() > 0)
		{
			int noOfFilterStatements = filterStatements.size();
			
			filterStmtBuilder.append("Filter values with condition");
			
			if(noOfFilterStatements > 1)
			{
				filterStmtBuilder.append("s");
			}
			
			filterStmtBuilder.append("\\n");

			for (int index = 0; index < noOfFilterStatements; index++) 
			{
				if(index > 0)
				{
					filterStmtBuilder.append(" \\n");
				}
				
				if(noOfFilterStatements > 1)
				{
					filterStmtBuilder.append((index + 1)).append(". ");
				}
				
				filterStmtBuilder.append(filterStatements.get(index));
			}
		}
		
		nodeName = filterStmtBuilder.toString();
		//nodeName = "Filter values with condition " + nodeName;

		return nodeName;
	}

	private List<String> getStatementFromLambda(LambdaExpr lambdaExpr) 
	{
		List<String> statementList = new ArrayList<>();
		
		String statement = null;
		
		List<Node> childNodes = lambdaExpr.getChildNodes();
		
		
		Node exprStmt = childNodes.get(1);
		
		
		if(exprStmt instanceof ExpressionStmt)
		{
			childNodes = exprStmt.getChildNodes();
			for (Node childNode : childNodes) 
			{
				
				if(childNode instanceof BinaryExpr)
				{
					boolean allBinaryExprs = true;
					
					for (Node node : childNode.getChildNodes()) 
					{
						if(!(node instanceof BinaryExpr))
						{
							allBinaryExprs = false;
							break;
						}
					}
					
					if(allBinaryExprs)
					{
						for (Node childOfChildNode : childNode.getChildNodes()) 
						{
							if(childOfChildNode instanceof BinaryExpr)
							{
								statement = getStatementFromBinaryExpr((BinaryExpr) childOfChildNode);
								statementList.add(statement);
							}
						}
					}
					else
					{
						statement = getStatementFromBinaryExpr((BinaryExpr) childNode);
						statementList.add(statement);
					}
				}
				else if(childNode instanceof MethodCallExpr)
				{
					List<Object> statementsFromMethodCall = getStatementsFromMethodCall((MethodCallExpr) childNode);
					
					for (Object object : statementsFromMethodCall) 
					{
						if(object != null)
						{
							statementList.add(object.toString());
						}
					}
				}
			}
		}
		else if(exprStmt instanceof BlockStmt)
		{
			List<Object> statementsFromBlock = javaCodeVisualizer.getStatementsFromBlock((BlockStmt) exprStmt);
			
			for (Object statementFromBlock : statementsFromBlock) 
			{
				if(statementFromBlock instanceof FlowChartNode)
				{
					statementList.add(((FlowChartNode)statementFromBlock).getNodeName());
				}
				else if(statementFromBlock instanceof List)
				{
					statementList.addAll((List)statementFromBlock);
				}
				else
				{
					statementList.add((String)statementFromBlock);
				}
			}
		}
		
		return statementList;
	}
	
	private String getStatementFromArrayAccessExpr(ArrayAccessExpr arrayAccessExpr)
	{
		List<Node> childNodes = arrayAccessExpr.getChildNodes();
		
		
		for (Node node : childNodes) 
		{
		}
		
		String indexOnArray = childNodes.get(1).toString();
		
		Node arrayExpr = childNodes.get(0);
		
		String arrayInfo = null;
		
		
		if(arrayExpr instanceof NameExpr)
		{
			arrayInfo = "Get element from " + arrayExpr + " at index " + childNodes.get(1);
		}
		else if(arrayExpr instanceof MethodCallExpr)
		{
			List<Object> stmts = getStatementsFromMethodCall((MethodCallExpr) arrayExpr);
			arrayInfo = stmts.get(0).toString();
			arrayInfo += " and access value from index " + indexOnArray;
		}
		
		return arrayInfo;
	}
	
	private String getStatementFromArrayCreationExpr(ArrayCreationExpr arrayCreationExpr) 
	{
		List<Node> childNodes = arrayCreationExpr.getChildNodes();
		
		Node typeExpr    = childNodes.get(0);
		String sizeExpr  = childNodes.get(1).toString();
		String arrayInfo = null;
		
		if(sizeExpr.startsWith("["))
		{
			sizeExpr = sizeExpr.substring(1);
		}
		
		if(sizeExpr.endsWith("]"))
		{
			sizeExpr = sizeExpr.substring(0, sizeExpr.length() - 1);
		}
		
		if(typeExpr instanceof PrimitiveType)
		{
			arrayInfo = "Define an array of type " + typeExpr + " with size " + sizeExpr;
		}
		
		return arrayInfo;
	}

	public List<Object> getStatementFromArraysAsList(ExpressionStmt node) 
	{
		List<Node> childNodes = null;
		Node childNode = null;
		
		String statement = null;
		List<Object> statementsList = new ArrayList<Object>();
		
		childNodes = node.getChildNodes();
		
		if(childNodes.size() == 1)
		{
			childNode = childNodes.get(0);
			
			if(childNode instanceof VariableDeclarationExpr)
			{
				List listOfStatements = getStatementsListFromVariableDeclarationExpr(childNode);
				statementsList.addAll(listOfStatements);
			}
		}
		
		return statementsList;
	}
	
	private List<Object> getStatementsListFromVariableDeclarationExpr(Node childNode) 
	{
		List<Object> statemtentsList = new ArrayList<>();
		List<Node> childNodes = null;
		String definitionKey = null;
		String statement = null;
		
		for (Node node : childNode.getChildNodes()) 
		{
		}
		
		if(childNode.getChildNodes().size() == 1)
		{
			childNode = childNode.getChildNodes().get(0);
			
			if(childNode instanceof VariableDeclarator)
			{
				childNodes = childNode.getChildNodes();
				
				for (Node node : childNodes) 
				{
				}
				
				if(childNodes.get(0) instanceof ClassOrInterfaceType &&
					childNodes.get(1) instanceof SimpleName
				)
				{
					if(childNodes.get(2) instanceof MethodCallExpr)
					{
						List<Object> stmtsFromMethodCall = getStatementsFromMethodCall((MethodCallExpr)childNodes.get(2));
						
						for (Object object : stmtsFromMethodCall) 
						{
						}
						
						statemtentsList.addAll(stmtsFromMethodCall);
					}
				}
			}
			else
			{
				childNodes = childNode.getChildNodes();
				
				if(childNodes.get(2).toString().contains("asList"))
				{
					Node asListExpr = childNodes.get(2);
					
					childNodes = asListExpr.getChildNodes();
	
					Node referenceType = childNodes.get(0);
					Node referenceVariable =  childNodes.get(1);
					
					if(referenceType.toString().contains("Arrays") && referenceVariable.toString().contains("asList"))
					{
						definitionKey = childNodes.get(0).toString() + "." + childNodes.get(1).toString();
						if(childNodes.get(2) instanceof ArrayCreationExpr)
						{
							childNodes = childNodes.get(2).getChildNodes();
							
							if(childNodes.get(1).toString().equals("[]"))
							{
								//statement = "Create List from " + childNodes.get(0) + " array of " + childNodes.get(2);
								statement = getStatementFromProperties(definitionKey, new Object[] {childNodes.get(0), childNodes.get(2)});
							}
						}
					}
				}
			}
		}

		if(statement != null)
		{
			statemtentsList.add(statement);
		}
		
		return statemtentsList;
	}

	private String replaceTokensInStatement(String statement, Object[] tokens) 
	{
		if(tokens == null) return statement;
		if(statement == null) return statement;
		
		String tokenString = "{}";
		
		int tokenIndex = -1;
		int tokenLength = 2;
		
		for (Object token : tokens) 
		{
			if(token != null)
			{
				tokenIndex = statement.indexOf(tokenString);
				if(tokenIndex > -1)
				{
					statement = statement.substring(0, tokenIndex) + token + statement.substring(tokenIndex + tokenLength);
				}
			}
		}
		
		return statement;
	}
	
	private String getClassNameForVariable(String variableName)
	{
		String className = variablesMap.get(variableName);
		return className;
	}

	private void getAPIDefinitionProperties()
	{
		apiDefinitionProps = new Properties();
		try
		(
			InputStream is = new FileInputStream("API_Definition.properties");
		)
		{
			apiDefinitionProps.load(is);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public void setVariablesMap(Map<String, String> variablesMap) 
	{
		this.variablesMap = variablesMap;
	}

	public void setImportedClassDetailsMap(Map<String, String> importedClassDetailsMap) 
	{
		this.importedClassDetailsMap = importedClassDetailsMap;
	}
}
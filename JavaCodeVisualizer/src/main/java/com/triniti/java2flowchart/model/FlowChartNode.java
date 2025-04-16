package com.triniti.java2flowchart.model;

import java.io.Serializable;
import java.util.List;

public class FlowChartNode implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String nodeName;
	
	private boolean methodCall;
	private List<String> methodCallDetails;
	
	public FlowChartNode(String nodeName) 
	{
		this.nodeName = nodeName;
	}

	public String getNodeName() 
	{
		return nodeName;
	}

	public void setMethodCall(boolean methodCall) 
	{
		this.methodCall = methodCall;
	}
	
	public boolean isMethodCall() 
	{
		return methodCall;
	}
	
	public void setNodeName(String nodeName) 
	{
		this.nodeName = nodeName;
	}
	
	public void setMethodCallDetails(List<String> methodCallDetails) 
	{
		this.methodCallDetails = methodCallDetails;
	}
	
	public List<String> getMethodCallDetails() 
	{
		return methodCallDetails;
	}
	
	@Override
	public String toString() {
		return nodeName;
	}
	
}

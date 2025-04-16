package com.triniti.java2flowchart.model;

import java.io.Serializable;

public class FlowChartLink implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private boolean itsAForLoop;
	private boolean itsAWhileLoop;
	
	public void setItsAForLoop(boolean itsAForLoop) 
	{
		this.itsAForLoop = itsAForLoop;
	}
	
	public boolean isItAForLoop() 
	{
		return itsAForLoop;
	}
	
	public void setItsAWhileLoop(boolean itsAWhileLoop) 
	{
		this.itsAWhileLoop = itsAWhileLoop;
	}
	
	public boolean isItAWhileLoop() 
	{
		return itsAWhileLoop;
	}
}

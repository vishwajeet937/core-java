package com.app.patternProgram;

public class Pattern6
{

	public static void main(String[] args) 
	{
	  int n=4;
	  for(int row=1;row<=n;row++)
	  {
		  for(int space=1;space<=n-row;space++)
		  {
			  System.out.print(" ");
		  }
		  System.out.println("*");
	  }
	}

}

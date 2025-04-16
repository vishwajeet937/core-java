package com.app.patternProgram;

public class Pattern2 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
          for (int i=1;i<=5;i++)
          {
        	  for (int j=5;j>=i;j--)
        	  {
        		  System.out.print(j);
        	  }
        	  for (int m=1;m<=5;m++)
        	  {
        		  System.out.print("-");
        	  }
        	  for (int k=1;k<=i;k++)
        	  {
        		  System.out.print(k);
        	  }
        	  System.out.println();
          }
	}

}

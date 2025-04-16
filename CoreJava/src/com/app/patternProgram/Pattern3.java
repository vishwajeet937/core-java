package com.app.patternProgram;
import java.util.Scanner;
public class Pattern3 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the number");
      int num=scan.nextInt();
     /* for(int i=1; i<=num; i++)
      {
    	  for (int j=num;j>=i;j--)
    	  {
    		  System.out.print(j);
    	  }
    	  System.out.println();
      }*/
      
      
      /*2nd way*/
     /* for(int row=1;row<=num;row++)
      {
    	  for(int space=1;space<= ;space++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int col=1;col<=num-row+1;col++)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }*/
	}
}

package com.app.patternProgram;
import java.util.Scanner;
public class Pattern9 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
          int num=scan.nextInt();
          
          for(int row=1;row<=num;row++)
           {
        	  for(int col=1;col<=row;col++)
        	  {
        		  if(col%2==0)
        		  {
        			  System.out.print(0);
        		  }
        		  else 
        		  {
        			  System.out.print(1);
        		  }
        	  }
        	  System.out.println();
           }
	}

}

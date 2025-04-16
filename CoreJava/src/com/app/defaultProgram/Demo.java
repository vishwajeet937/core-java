package com.app.defaultProgram;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
     {
		
	  int i=100;
	   try
	      {
	        	if (i%2==0)
		          {
            		 System.out.println(i);
			          throw new Exception();
		           }
	        }
	      catch (Exception e)
	            {
                     System.out.println("oddNumber");
	            }
     }
}

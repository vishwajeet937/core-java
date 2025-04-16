 package com.app.arrays;
import java.util.Scanner;
public class EvenNumber
{
    public static void main(String[] args)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the number");
    	int i=scan.nextInt();
    	int[] j=new int[i];
    	for(int k=0;k<=i;k++)
    	  {
    		 if(k%2!=1)
    		   {
    			 System.out.print(k);
    		   }
    		 else
    		   {
    			 System.out.println();
    		   }
    		 for(int l=0;l<=i;l++)
    		   {
    			 if(l%2!=0)
    			   {
    				 System.out.print(l);
    			   }
    			 else
    			   {
    				 System.out.println();
    			   }
    		   }
    	  }
    }
}

package com.app.arrays;
import java.util.Scanner;
public class EvenProgram
{
   public static void main(String[] args)
     {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int a=scan.nextInt();
	   int[] i=new int[a];
	   for(int j=0;j<=a;j++)
	   {
		   if(j%2==0)
		   {
			   System.out.print(j);
		   }
		   else
		   {
			   System.out.println();
		   }
		   //System.out.print(j);
	   }
	   //System.out.println();
     }
}

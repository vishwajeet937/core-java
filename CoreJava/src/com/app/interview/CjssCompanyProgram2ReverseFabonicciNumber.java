package com.app.interview;

public class CjssCompanyProgram2ReverseFabonicciNumber
{
    public static void main(String[] args) 
     {
	      int a=0;
		  int b=1;
		  int c;
	  for (int i=10 ;i>=1 ;i-- )
	  {
		  c=a+b;
		  System.out.println(" "+c);
		  a=b;
		  b=c;
	  }
     }

}

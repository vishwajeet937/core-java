package com.app.exceptionalHandeling;

public class FindOutCompilerErrorStatement 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        try
        {
        	System.out.println("try");
        }
        catch(ArithmeticException ae)
        {
        	System.out.println("ArithmeticException");
        }
        catch(NullPointerException npe)
        {
        	System.out.println("NullPointerException");
        }
       // catch(ArithmeticException ae)
        {
        	System.out.println("ArithmeticException01");
        }
	}

}

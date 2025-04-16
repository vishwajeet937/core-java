package com.app.exceptionalHandeling;

import java.rmi.AccessException;
import java.text.NumberFormat;

public class DevisionProgram1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
		int a=Integer.parseInt(args[40]);
		int b=Integer.parseInt(args[0]);
		int c=a/b;
		System.out.println(c);
		}
		//..............wrong statement.........................
		/*finally
		{
			System.out.println("finally");
		}*/
		//........................................................
		catch(ArrayIndexOutOfBoundsException aioobe)
		{
			//aioobe.printStackTrace();
			System.out.println("plz pass atlist two integer value");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("plz pass only integer value");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("plz don't pass second value by Zero");
		}

	}

}

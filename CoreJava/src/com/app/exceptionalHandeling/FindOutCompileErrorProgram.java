package com.app.exceptionalHandeling;

public class FindOutCompileErrorProgram 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//case1
		//...............true................................
		/*try 
		{
			System.out.println("try");
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("finally");
		}*/
               
//case2
		//..................true............................
		/*try
		{
			System.out.println("try");
		}
		finally
		{
			System.out.println("finally");
		}*/
//case3
		//.....................compiler Error........................
		/*try
		{
			System.out.println("try");
		}
		finally
		{
			System.out.println("finally");
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}*/
		
//case4
		//......................compiler Error.......................
		/*try
		{
			System.out.println("try");
		}*/
		
//case5
		//....................compiler Error...............................
		/*catch(Exception e)
		{
			System.out.println("catch");
		}*/
//case6
		//......................compiler Error...................................
		/*finally 
		{
			System.out.println("finally");
		}*/
//case7
		//..................compiler Error...................................
		/*try
		{
			System.out.println("try");
		}
		int i=10;
		catch(Exception e)
		{
			System.out.println("catch");
		}
		int b=20;
		finally
		{
			System.out.println("finally");
		}*/
	}

}

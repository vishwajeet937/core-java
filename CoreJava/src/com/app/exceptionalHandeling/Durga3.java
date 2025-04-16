package com.app.exceptionalHandeling;
import java.util.*;
import java.io.FileNotFoundException;
import java.sql.SQLException;

/*public class Durga3 
{
	int a=10;
	int b=0;
	
   public static void m1()
   {
	   System.out.println("m1");
   }
	public static void main(String[] args)
	{
		Durga3.m1();
		try
		   {
			int c=(a/b);
			System.out.println("Riscy code:"+c);
		   }
		   catch(ArithmeticException ae)
		   {
			  
			 // ae.printStackTrace();
			   //System.out.println("");
			  System.out.println("nj");
		   }
		  catch(SQLException se)
		   {
			   System.out.println("SQLException");
		   }
		   catch(FileNotFoundException fe)
		   {
			   System.out.println("FileNotFoundException");
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception:"+e.getMessage());
		   } */
	//}
	
	///////
   public class Durga3 
   {
   int a = 10;
   int b = 0; // Changed to 0 to demonstrate division by zero
   public static void m1() 
   {
       System.out.println("m1");
   }
	public static void main(String[] args)
	{
        Durga3.m1();
        try 
        {
            System.out.println("Risky code");
            //int c = (a/b); // Moved inside try block
           // System.out.println(c);
        } 
        catch (ArithmeticException ae) 
        {
            System.out.println("ArithmeticException: Division by zero");
        } 
        catch (Exception e)
        {
        	
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

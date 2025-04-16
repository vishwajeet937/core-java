package com.test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
@Test
public class Test6 
{
	Test6()
	{
		System.out.println("Zero-parrem Constructor");
	}
	Test6(int i,String s,float f)
	{
		String name="vishwajeet";
		int rollNo=904;
		float sal=0.0f;
		System.out.println("Name:"+name+"/n"+"RollNo:"+rollNo+"/n"+"Sal:"+sal);
	}
	
    class Test7 extends Test6
     {
    	 
		@Test
    	 public void test7()
    	 {
    		 for(int i=1; i<=5; i++)
    		 {
    			 for(int j=1; j<=i; j++)
    			 {
    				 System.out.print(i);
    			 }
    			 System.out.println();
    		 }
    	 }
		
    	/* public static void main(String[] args)
    	 {
    		 Test7 t=new Test7();
    	 }*/
     }
}



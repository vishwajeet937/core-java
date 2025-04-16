package com.app.exceptionalHandeling;
import java.util.Scanner;
public class Check13
{
	Check13(int i)
	{
		this(2,"s");
		System.out.println("constructor-One parrem");
	}
	Check13(int i,String s)
	{
		System.out.println("constructor-Two parrem");
	}
	static
	{
		System.out.println("************Avliable-Book*************");
	}
   public static void name()
   {
	 String bookName="core-java";
	 String bookName1="jdbc";
	// String bookName2="servlet";
	// String bookName3="jsp";
	 try
	 {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the Number");
		 String name=scan.nextLine();
		 
		/* if(name.equals("bookName"))
		 {
			 System.out.println("bookName:"+bookName);
		 }
		 else if(name.equals("bookName1"))
		 {
			 System.out.println("bookName1:"+bookName1);
		 }
		 else
		 {
			 System.out.println("Else");
		 }*/
		 for(int i=0;i<name.length();i++)
		 {
			 if(name.equals(bookName))
			 {
			 System.out.println("name:"+bookName);
			 //System.out.println("name:"+bookName1);
			 }
			 else
			 {
				 System.out.println("else-1");
			 }
		 }
	 }
   
	 catch(Exception e1)
	 {
		 e1.printStackTrace();
	 }
   }
	 public static void forLoop1()
	 {
		 System.out.println("ForLoopMethod-Print");
		 String str = "vishwajeet, Sonu!";
		 for (int i = 0; i < str.length(); i++) {
		     char c = str.charAt(i);
		     System.out.println(c);
		 } 
	 }
	 public static void oddNumber()
	 {
		
		 for(int i=0;i<=12;i++)
		 {
			 if(i%2==1)
			 System.out.println("OddNumber:"+i);
		 }
	 }
	 public static int evenNumber(int j)
	 {
		 for(int i=0;i<=13;i++)
		 {
			 if(i%2==0)
			 {
				 System.out.println("EvenNumber:"+i);
			 }
		 }
		 return 1;
	 }
   
	public static void main(String[] args)
	{
		Check13 c13=new Check13(12);
		c13.name();
		c13.forLoop1();
		c13.oddNumber();
		c13.evenNumber(50);
         try
         {
        	 int a=12;
        	 int b=0;
        	 int c=a%b;
        	 System.out.println("c:"+c);
         }
         catch(Exception e)
         {
        	 e.printStackTrace();
        	// System.out.println("ArithmeticException");
         }
         finally
         {
        	 System.out.println("finaly-Block");
         }
	}

}

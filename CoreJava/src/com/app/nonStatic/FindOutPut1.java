package com.app.nonStatic;
import java.util.Scanner;
public class FindOutPut1
{
   static 
   {
	   System.out.println("Welcome to static method");
	   int i=12;
	   int j=13;
	   int k=0;
	   try
	   {
	    System.out.println("devide:"+(i/k));
	   }
	   catch(Exception e)
	   {
		   System.out.println("add:"+(i+j));
		   try 
		   {
			Thread.sleep(10000);
		   } 
		   catch (InterruptedException e1)
		   {
			e1.printStackTrace();
		}
	   }
	   finally
	   {
		   int i1=25;
		   int j1=26;
		   System.out.println("sub:"+(j1-j));
	   }
   }
//non static block
   {
	   try 
	   {
		Thread.sleep(10000);
	} 
	   catch (InterruptedException e)
	   {
		e.printStackTrace();
	}
	   System.out.println("Welcome to non static method");
	  String name="vishwajeet kumar";
	  String result="";
	  String[] name1=name.split(" ");
	  for(int i=0;i<name1()-1;i++)
	  {
		  result+=name1;
		  System.out.println(name1);
	  }
   }
// method
   public String method()throws Exception
   {
	   System.out.println("welcome to Normal method");
     String name="RAM aam khata hai";
      boolean result=name.startsWith("R");
      Thread.sleep(10000);
      System.out.println(result);
   
      return "";
   }
//constructor
  FindOutPut1() throws Exception
   {
	   this(11);
	   //odd number logic
	   System.out.println("Zero parem constructor");
	   Scanner scan=new Scanner(System.in);
	   System.out.println("enter the number");
	   int i1=scan.nextInt();
	   int[] arr=new int[i1];
	   for(int i=0;i<=arr.length-1;i++)
	   {
		   if(i%2==0)
		    {
			   Thread.sleep(10000);
			   System.out.println("odd Number:"+i);
		    }  
	   }
   }
   FindOutPut1(int i1)throws Exception
   {
	   this("reverse name");
	   System.out.println("one parem constructor");
	   int[] arr={1,2,3,4,5,6,7,8,9};
	   for(int i=0;i<=arr.length-1;i++)
	   {
		   if(i%2==1)
		   {
			   Thread.sleep(10000);
		  System.out.println("Even:"+ i); 
		   }
	   }
   }
   FindOutPut1(String name)throws Exception
   {
	   Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String str=scan.nextLine();
		//String name="How are you";
		String[] stringWords=str.split(" ");
		String resultString="";
		for(int i=stringWords.length-1;i>=0;i--)
		{
			resultString+=stringWords[i]+" ";
			//resultString=resultString+stringWords[i]+" ";
		}
		Thread.sleep(10000);
           System.out.println(resultString);	   
	   
   }
   public FindOutPut1 duplicateElements()throws Exception
   {
	   int[] arr={1,2,3,4,4,3,5,6,7};
	   for(int i=0;i<arr.length-1;i++)
	   {
		   for(int j=i+1;j<arr.length-1;j++)
		   {
			   System.out.println(j);
		   }
	   }
	  return new FindOutPut1();
   }
   public static float logical()
   {
	   String val="aaaabbbbcccdd";
	   char[] ch=val.toCharArray();
	   int valOccurencea=0;
	   int valOccrencec=0;
	   for(int i=0;i<ch.length;i++)
	   {
	    if(ch[i]=='a')
	    {
	    	valOccurencea++;
	    }
	    else if(ch[i]=='c')
	    {
	    	valOccrencec++;
	    }
	    System.out.println(valOccurencea);
	    System.out.println(valOccurencea);
	   }
	   return 3.0f;
	
   }
	public static void main(String[] args)throws Exception
	{
	FindOutPut1 f=new FindOutPut1();
      f.method();
      logical();
	}
	private int name1() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}

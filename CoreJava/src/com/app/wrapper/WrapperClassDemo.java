package com.app.wrapper;

public class WrapperClassDemo
{

	public static void main(String[] args) 
	{
		//PST to WCO conversion
	  int i=10;
	  Integer i1=new Integer(i);
	  Integer i2= Integer.valueOf(i);
	  System.out.println("i is:"+i);
      System.out.println("i1 is:"+i1);
      System.out.println("i2 is:"+i2);
      
     // byte b1=20;
      //Byte b=new Byte(50);        //CE
      
      Byte b1=new Byte((byte)50);
      System.out.println("b1 is:"+b1);
      
      Character ch=new Character('a');
      System.out.println("ch is:"+ch);
      
      //Character ch1= new Character(1);    //CE
      
      Character ch2=new Character((char)97);
      System.out.println("ch2 is:"+ch2);
      
      Character ch3=new Character((char)9723);
      System.out.println("ch3 is:"+ch3);
      
      Boolean bo=new Boolean(true);
      System.out.println("bo is:"+bo);
      
      Boolean bo1=new Boolean((boolean)false);
      System.out.println("bo1 is:"+bo1);
      
      Float f=new Float(23);
      System.out.println("f is:"+f);
      
      Float f1=new Float(12.22f);
      System.out.println("f1 is:"+f1);
      
      Float f2=new Float(12.32);
      System.out.println("f2 is:"+f2);
      
      Double d=new Double(12);
      System.out.println("d is:"+d);
      
      Double d1=new Double(98);
      System.out.println("d1 is:"+d1);
      
      Double d2=new Double('a');
      System.out.println("d2 is:"+d2);
      
      
    //WCO to String object conversion  
      Integer io=new Integer(299);
      System.out.println(io);
      System.out.println(io.toString());
	}

}

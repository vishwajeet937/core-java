package com.app.java8NewFeatures;

interface Check
{
public static void m1()
 {
	System.out.println("m1");
 }
public static void m3()
{
  String name="my name is sonu kr";
  //String[] name1=name.split(" ");
  char[] name1=name.toCharArray();
  String rev="";
  for(int i=name1.length-1;i>=0;i--)
  {
	  rev+=name1[i]+" ";
	  
  }
  System.out.println("reverse:"+rev);
}
public default void m2()
  {
	System.out.println("m2");
  }
	
}

class Check1 implements Check
{
	public static void main(String[] args)
	{
		Check.m1();
		Check1 c=new Check1();
		c.m2();
		Check.m3();

	}

}

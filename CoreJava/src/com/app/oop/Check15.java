package com.app.oop;

public class Check15 
{
	String fName="vishwajeet";
	String lName="kumar";
	long mobNo=9570381226l;
	
	public void addresh()
	{
		
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(mobNo);
	}
	public void addresh1()
	{
		String fName="pagela";
		System.out.println("ByDefault Name is:"+this.fName);
		System.out.println("ByDefault Name is:"+fName);
	}
	public static void m1()
	{
		System.out.println("static method");
	}
	static 
	{
		System.out.println("static block");
	}
	{
		System.out.println("non staic-1");
	}
	Check15()
	{
		System.out.println("Zero parem constructor");
	}
	{
		System.out.println("non static -2");
	}
}
class Check16 extends Check15
 {
   public void duplicateAddresh()
   {
	   String fName="sonu kumar";
	   System.out.println("fName is:"+fName);
	   System.out.println("my name is:"+super.fName+" "+super.lName);
   }
   static
   {
	   System.out.println("static-1");
   }
   Check16(String s)
   {
	   System.out.println("Sting type constructor");
   }
   {
	   System.out.println("non static block");
   }
   Check16(int i)
   {
	   System.out.println("one parrem constructor");
   }
	public static void main(String[] args)
	{
		Check16 c=new Check16(1);
        c.addresh();
        c.duplicateAddresh();
        c.addresh1();
        m1();
	}

}

package com.app.nonStatic;

public class Check4
{
   String name="vishwajeet kumar";
   public String m1()
   {
	   String name="sonu kumar";
	   System.out.println(name);
	   System.out.println(this.name);
	   return "String";
   }
}
 class Check5 extends Check4
 {
	 String name="ram";
	 public void m2()
	 {
		 System.err.println(super.name);
	 }
 
	public static void main(String[] args) 
	{
       Check5 c=new Check5();
       c.m1();
       c.m2();
    }

}

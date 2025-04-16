package com.app.oop;

public class Check extends Object
{
	String name="vishwajeet";
   public void check()
     {
	   System.out.println(name);
     }
   public void check(String s)
   {
	   String name="sonu";
	   System.out.println(name);
   }
}
 class Check1 extends Check
 {
	 String name="monu";
	 long mobNo=9570381226l;
	 public void check1()
	 { 
		 System.out.println(super.name);
		 System.out.println(name);
	 }
	 public void check1(int i)
	 {
		 long mobNo=9117348133l;
		 System.out.println(mobNo);
	 }
  public static void main(String[] args)
  {
	  Check1 c=new Check1();
	  c.check1();
	  c.check();
  }
 }
 

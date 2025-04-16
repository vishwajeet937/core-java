package Oop;



public class Inheritancre 
{
	
	   static String name="Ram";
	   static int num=123;
	   static long phnNo=7842676287l;
	   public static void m1()
	   {
		   System.out.println(name);
	   }
	}
	    class Test extends Inheritancre
	   {
		   public static void m2()
		   {
			  System.out.println(num); 
		   }
	   
	   
		public static void main(String[] args) 
		{
			Test t=new Test();
			t.m2();
					
		}
}

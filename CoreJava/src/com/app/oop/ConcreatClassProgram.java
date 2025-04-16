package com.app.oop;
//..................concreatClassProgram....................................
public class ConcreatClassProgram 
{
	String name="ram";
	int no=164122;
	double d=3.4d;
	     public void check3()
	     {
	    	 System.out.println(name);
	     }
	     public void check3(int i)
	     {
	    	 System.out.println(no);
	     }
	     public void check3(String s)
	     {
	    	 System.out.println(no);
	     }
	  }
	class ConcreatClassProgram1 extends ConcreatClassProgram
	 {
		 String name="jam";
		/*public Check4 check4()
		{
			System.out.println();
			return new Check4();
		}*/
		public ConcreatClassProgram1 ConcreatClassProgram1(ConcreatClassProgram1 c)
		{
			System.out.println(super.name);
			return new ConcreatClassProgram1();
		}
	public static void main(String[] args)
	    {
		ConcreatClassProgram1 c=new ConcreatClassProgram1();
		//c.check3();
		c.ConcreatClassProgram1(c);
	    }
	 }



package com.app.staticProgram;

public class Bb1
{
	static String name="sonu";
	String name1="kr";
	/*Bb1()
	{
		System.out.println("Zero-parrem");
	}*/
    static
    {
    	System.out.println("static block");
    	Bb1 b=new Bb1(1);
    	
    	System.out.println("static:"+b.name1);
    	System.out.println("static1:"+Bc1.name2);
    }
    {
    	System.out.println("non-static:"+name1);
    }
    Bb1(int i)
    {
    	this(11,"sonu");
    	System.out.println("constructor");
    }
    Bb1(int i,String s)
    {
    	System.out.println("Two parrem");
    }
    public void m1(int i)
    {
    	System.out.println("Super class m1");
    }

	public static void main(String[] args)
	{
		System.out.println("main method");
		Bb1 b=new Bc1();
		b.m1(12);

	}

}
class Bc1 extends Bb1
{
	public Bc1()
	{
		super(1);
		System.out.println("Bc1");
	}
	static String name2="kumar";
	@Override
	public void m1(int i)
    {
    	System.out.println("Sub class m1");
    }
	
	
}

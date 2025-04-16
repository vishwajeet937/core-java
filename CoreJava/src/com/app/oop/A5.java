package com.app.oop;

public class A5 
{
    static int a=10;
    int x=20;
    
    static void m1()
     {
    	System.out.println("A class m1");
     }
    void m2()
     {
    	System.out.println("A class m2");
     }
    void m3()
     {
    	System.out.println("A class m3");
     }
}
class B5 extends A5
{ 
	static int a=50;
	int x=60;
	
	static void m1()
	 {
		System.out.println("B class m1");
	 }
	void m2()
	 {
		System.out.println("B class m2");
	 }
	public static void main(String[] args)
	{
		System.out.println("a:"+a);
		m1();
		
		B5 b=new B5();
		System.out.println("X:"+b.x);
        b.m2();b.m3();
        
	}

}

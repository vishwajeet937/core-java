package com.app.oop;

public class Student01
{                                    //student has a name is called has a relationship.
    String name="vishwajeet";
    	public String m1()
    	{
    	System.out.println(name);
    	return name;
    	}
}
class Student02 extends Student01
{
	String name="sonu";
	public String  m2()
	{
		System.out.println(name);
		return name;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student02 h=new Student02();
		h.m2();
		h.m1();
	}

}

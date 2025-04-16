package com.app.oop;

public class College extends Object
{
    static String cllgName="Oec";
    static  String state="Orissa";
    static String dist="Bhubaneshwar";
    public static void college()
    {
    	System.out.println(cllgName);
    	System.out.println(state);
    	System.out.println(dist);
    }
    public void college(String s)
    {
    	System.out.println(cllgName);
    	System.out.println(state);
    	System.out.println(dist);
    }
}
    class Student extends College
    {
    	int totalStudent=560;
    	
    	public void student()
    	{
    		System.out.println(totalStudent);
    	}
    	public void student(int i)
    	{
    		int cseTotalStudent=120;
    		System.out.println(cseTotalStudent);

    	}
    	public static void main (String args[])
    	{
    		Student s1=new Student();
    		s1.college();
    		s1.student();
    		s1.student(9);
    		
    	}
    }


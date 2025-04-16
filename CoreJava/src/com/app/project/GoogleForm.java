package com.app.project;

import java.util.Scanner;

public class GoogleForm
{
	static 
	  {
		  System.out.println("*****************Welcom to nareshIt********************");
		  System.out.println("Offline SCREENING TEST on AWS | UI | Python | .NET");
	  }
	Scanner scan=new Scanner(System.in);
	
	
	public void firstName()
	{
		System.out.println("Enter FirstName");
		String name=scan.nextLine();
		System.out.println("FirstName is:"+name);
	}
	
    public Object lastName()
    {
    	System.out.println("Enter last Number");
    	String name=scan.next();
    	System.out.println("LastName is:"+name);
    	return "returnkeyword";
    }
    public int[] contactNumber()
    {
    	System.out.println("Enter the Contact Number");
    	long contactNumber=scan.nextLong();
    	System.out.println("ContectNumber is:"+contactNumber);
    	return new int[] {};
    }
    public Object mailID()
    {
    	System.out.println("Enter the Mail-id");
    	String mailID=scan.next();
    	System.out.println("Mail-Id is:"+mailID);
    	return new GoogleForm();
    }
    public String technology()
    {
    	System.out.println("Enter the Technology");
    	String technology=scan.nextLine();
    	if(technology=="java")
    	{
    		System.out.println("java:"+technology);
    	}
    	else if(technology=="advJava")
    	{
    		System.out.println("Adv-java:"+technology);
    	}
    	
    	else
    	{
    		System.out.println("else");
    	}
    	return "java";
    }
    public void completedCourses()
    {
    	System.out.println("Enter the CompletedCourses");
    	String completedCourses=scan.next();
    	System.out.println("CompletedCourses is:"+completedCourses);
    }
     public void additionalSkills()
      {
      System.out.println("Enter the Additional Skills");
      String additionalSkills=scan.next();
      System.out.println("Additional-Skills is:"+additionalSkills);
      }


	public static void main(String[] args) 
	{
	GoogleForm gf=new GoogleForm();
	gf.firstName();
	gf.lastName();
	gf.contactNumber();
	gf.mailID();
	gf.technology();
    gf.completedCourses();
    gf.additionalSkills();
	}

}

package com.app.stringHandeling;
import com.app.stringHandeling.Check;
public class Check1 
{
	final String email1="sonukumar937@gmail.com";
	final String name1="monu";
public static void main(String[] args)
{
	String name="vishwajeet kumar";
	String email="vishwajeetkumar937@gmail.com1";
	System.out.println(name.hashCode());
	System.out.println(email.hashCode());
	Check c=new Check();
	System.out.println(c.name);
	System.out.println(name);
	System.out.println(email);
	System.out.println(c.emailId);
}
}

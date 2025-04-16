package com.app.nonStatic;


public class ReferenceVariable 
{
    String emailId="vishwajeetkumar937@gmail.com";
    public void check(ReferenceVariable c)
    {
    	System.out.println(emailId);
    }
   /* Check(Check c)
    {
    	System.out.println("constructor");
    }*/
public static void main(String[] args)
   {
	ReferenceVariable c=new ReferenceVariable();
	c.check(c);
   }
}

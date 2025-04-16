package com.app.exceptionalHandeling;
public class Check8 
{
	
	    String fName="Sonu";
	    String lName="kumar";
	    public void m1()
	    {
	    	try
	    	  {
	    		throw new Exception();
	        	//System.out.println(fName);
	    	  }
	    	catch(RuntimeException e)
	    	{
	    		throw new RuntimeException();
	    		//System.out.println(lName);
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(fName);
	    	}
	    	finally
	    	{
	    		System.out.println(fName+" "+lName);
	    	}
	    }
	    public static void main(String[] args)
	    {
	    	Check8 c=new Check8();
	    	c.m1();
	    }
	}


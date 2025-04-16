package com.app.stringHandeling;

public class New 
{
  public static New m1(String fName,String lName)
  {
	  System.out.println("welcome");
	  System.out.println(fName);
	  System.out.println(lName);
	  return new New();
  }
	public static void main(String[] args) 
	{
		//New n= new New();
		m1("sonu","kumar");
	}

}

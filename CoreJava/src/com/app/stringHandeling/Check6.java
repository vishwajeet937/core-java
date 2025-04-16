package com.app.stringHandeling;

public class Check6 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      String fName="Vishwajeet";
      System.out.println(fName);
      
      String lName="kum ar";
      System.out.println(lName);
      
      String fullName=fName.concat(lName);
      System.out.println("concate method:"+fullName);
      
      String f1=fName.toLowerCase();
      System.out.println(f1);
      
      boolean Result=fName.equals(lName);
      System.out.println(Result);
      
      int length=fName.length();
      System.out.println(length);
      
      int indexOf=fName.indexOf("a");
      System.out.println(indexOf);
      
      boolean empty=lName.isEmpty();
      System.out.println(empty);
      
      boolean end=fName.endsWith("t");
      System.out.println(end);
	}

}

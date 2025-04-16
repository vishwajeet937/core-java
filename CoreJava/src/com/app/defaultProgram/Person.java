package com.app.defaultProgram;

public class Person 
{
     static final int eyes=2;
     static final int ears=2;
     static final int hands=2;
     static final int legs=2;
     
     String name;
     double height;
     double waight;
     
     Person(String name,double height,double waight)
      {
    	 this.name=name;
    	 this.height=height;
    	 this.waight=waight;
    	 System.out.println("name :"+name);
    	 System.out.println("height :"+height);
    	 System.out.println("waight :"+waight);
      }
	public static void main(String[] args) 
	{
		Person p=new Person("vishwajeet kumar",5.3,60);
		
	}

}

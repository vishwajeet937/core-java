package com.app.oop;

public class Concreat extends Object 
{
     String collegeName="Orissa engineering college";
     String state="Orisha";
}
class Check2 extends Concreat
    {
	String studentName="vishwajeet kumar";
	int rollNo=164122;
	long redgNo=1601211198l;
	public void check2()
	  {
		System.out.println("collegeName:"+super.collegeName+"\n"+"State:"+super.state);
		System.out.println("studentName:"+studentName+"\n"+"rollNo:"+rollNo+"\n"+"redgNo:"+redgNo);
	  }
    
   public static void main(String[] args)
    {
	  Check2 c=new Check2();
	  c.check2();
    }
 }

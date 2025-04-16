package com.app.defaultProgram;

 class Check2 extends Object
 {
	 Check2()
	 {
		 System.out.println("Zero parrem");
	 }
	 Check2(int i)
	 {
		 System.out.println("one parrem");
	 }
 }
 class Check3 extends Check2
 {
	 public void m1()
	 {
		 System.out.println("m1");
	 }
 //class Check4 extends Check3
 
	 public static void main(String[] args)
	 {
		 Check3 c=new Check3();
		 c.m1();
	 }
 }



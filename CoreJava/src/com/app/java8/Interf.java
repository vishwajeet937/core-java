package com.app.java8;

interface Interf
{
	public void m1();




	public static void main(String[] args) 
	{
		Interf i=()-> System.out.println("welcome to Lambda Expression");
         i.m1();
	}
}


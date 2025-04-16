package com.app.interview;

public class InfoSun {

	private InfoSun()
	{
		int no1,no2;
		int no3,no4=0;
		int no5=0,no6=0;
		//double no7,int no8=0; wrong statement
		double d=1.1_1_1;
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		InfoSun is=new InfoSun();
	}

}

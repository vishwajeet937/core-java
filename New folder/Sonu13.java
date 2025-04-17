//package com.int;
import java.util.Scanner;
class Sonu13 
{
	public static void main(String[] args) 
	{
		int add=(int)add(1,2);
		System.out.println(add);
		int add1=(int)add(2,3);
        System.out.println(add1);
		float add2=(float)add(3,4);
		System.out.println(add2);
		double add3=add(30.0,20.0);
		System.out.println(add3);
	}
		public static double add(double value1,double value2)
		{
			double val=value1+value2;
			return val;
		}
}

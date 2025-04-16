package com.app.arrays;

import java.util.Arrays;

public class PrintEmployeeDataInArray 
{ 
    private String empName;
    private int id;
    public String toString()
    {
    	return "empName:"+empName+"\n"+"id:"+id;
    }
	public static void main(String[] args)
	{
		
		PrintEmployeeDataInArray  p=new PrintEmployeeDataInArray();
		
		p.empName="Ram";
		p.id=123;
		PrintEmployeeDataInArray  p1=new PrintEmployeeDataInArray();
		p1.empName="AAm";
		p1.id=1234;
		PrintEmployeeDataInArray  p2=new PrintEmployeeDataInArray();
		p2.empName="Kam";
		p2.id=1235;
		PrintEmployeeDataInArray[] arr=new PrintEmployeeDataInArray[] {p,p1,p2};
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}

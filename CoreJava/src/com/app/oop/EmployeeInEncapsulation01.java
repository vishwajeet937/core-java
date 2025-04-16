package com.app.oop;

public class EmployeeInEncapsulation01 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		EmployeeInEncapsulation1 e=new EmployeeInEncapsulation1();
		e.setEmpName("vishwajeet kumar");
		e.setEmpId(164122);
		e.setEmpSallery(123.23f);
		e.setEmpAddresh("Hyderabad");
		System.out.println(e.getEmpName()+"\n"+e.getEmpId()+"\n"+e.getEmpSallery()+"\n"+e.getEmpAddresh());
	}

}

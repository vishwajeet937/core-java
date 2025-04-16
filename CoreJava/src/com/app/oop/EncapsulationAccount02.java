package com.app.oop;

public class EncapsulationAccount02 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EncapsulationAccount2 ea=new EncapsulationAccount2();
		ea.setAccNo(635467534l);
		ea.setName("vishwajeet kumar");
		ea.setEmail("vishwajeetkumar937@gmail.com");
		ea.setAmount(452474.324f);
	System.out.println(ea.getAccNo()+"\n"+ea.getName()+"\n"+ea.getEmail()+"\n"+ea.getAmount());
	}

}

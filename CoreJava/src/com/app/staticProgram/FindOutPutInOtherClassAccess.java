package com.app.staticProgram;

public class FindOutPutInOtherClassAccess 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(".........print BankProject............");
//Bank Project Program
		BankAccount ba=new BankAccount();
		ba.display();
		
//AddAndSubProgram
		System.out.println("...........AddAndSubProgram.............");
		AddAndSubProgram.add(2,5);
		AddAndSubProgram.sub(017,34);
	
//FindOutPut program
		System.out.println("..........FindOutPut............");
		FindOutPut.m1();
		
//VariableShadowingProgram
		System.out.println("...............VariableShadowingProgram.....................");
		VariableShadowingProgram.main(new String[]{"passValuebyStringType"});
		VariableShadowingProgram.m1(new int[]{});
		VariableShadowingProgram vs=new VariableShadowingProgram();
		VariableShadowingProgram.m2(vs);
		BankAccount ba3=new BankAccount();
		VariableShadowingProgram.m3(ba3);
		
//StaticKeyWordProgram
		System.out.println("...................StaticKeyWordProgram.....................");
		StaticKeyWordProgram.main(null);
	}
}

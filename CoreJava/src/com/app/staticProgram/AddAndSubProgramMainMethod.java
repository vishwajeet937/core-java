package com.app.staticProgram;

import com.app.staticProgram.StaticKeyWordProgram;/*same package access in not*/
         /*nessary in import package but differend package fage in compasury in import method*/

public class AddAndSubProgramMainMethod
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AddAndSubProgram.add(56,76);
		AddAndSubProgram.sub(34,65);
//FindOutPut class program calling
		FindOutPut.m1();
//StaticKeyWordProgram inner class calling
		//Check.m1(); //private inner class i can't access in other class.
		            //and main class can't write private class.
		
	}

}

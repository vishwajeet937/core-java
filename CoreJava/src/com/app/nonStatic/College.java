package com.app.nonStatic;

public class College extends Object
{
    String name="Oec";
    String state="Bhubaneshwar";
}
    class CseBranch extends College
    {
    	int sit=120;
    	int subj=5;
    	public void cse()
    	{
    		int sit=90;
    		System.out.println(this.sit);
    	}
    }
    class ItBranch extends CseBranch
    {
    	//int sit=60;
    	public void it()
    	{
    		System.out.println(this.sit);
    	}
    
    
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      ItBranch ib=new ItBranch();
       ib.it();
       ib.cse();
	}
	}


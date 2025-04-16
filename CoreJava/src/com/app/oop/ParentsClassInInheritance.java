package com.app.oop;

public class ParentsClassInInheritance
{
    String pName="Sunil singh";
	String add="Mahadeopur,Masaurhi(Patna)";
    public ParentsClassInInheritance pMethod()
    {
        long mobNo=62056l;

    	System.out.println(pName);
    	System.out.println(mobNo);
    	System.out.println(add);
    	return new ParentsClassInInheritance();
    }
}
class ChildClass extends ParentsClassInInheritance
{
	    String cName="vishwajeet kumar";
	    long mobNo=9570381226l;
	    public int[] childMethod()
	    {
	    	int[] arr= {342,324,32};
	    	System.out.println(cName);
	    	System.out.println(mobNo);
	    	System.out.println(super.add);
	    	//return new int[] {};
	    	return arr;
	    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChildClass cc=new ChildClass();
		System.out.println("...........Parents adderesh..........");
		cc.pMethod();
		System.out.println("............child adderesh...............");
		cc.childMethod();
	}
}


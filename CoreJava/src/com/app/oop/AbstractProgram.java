package com.app.oop;

abstract class AbstractProgram 
{
	String ownerName="gandu";
    abstract void owner();
    AbstractProgram()  //constructor i can write in under abstract class.
    {
    	System.out.println("constructor");
    	
    }
}
 class Customer extends AbstractProgram
  {
	public static void customer()
	{
		String customerName="pandu";
		System.out.println(customerName);
	}
	@Override
	void owner()
	{
		System.out.println(ownerName);
	}
  
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c.owner();
		c.customer();
	}

}

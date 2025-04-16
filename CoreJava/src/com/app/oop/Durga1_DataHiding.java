package com.app.oop;

public class Durga1_DataHiding 
{
	private double balance=21;
    
    
    public double getbalance()
    {
         // double balance=22;

    	System.out.println("Balance:"+balance);
    	System.out.println("Data-Hiding");
       return balance;	
    }
	public static void main(String[] args)
	{
		Durga1_DataHiding d1=new Durga1_DataHiding();
		d1.getbalance();

	}

}

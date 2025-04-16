package com.app.oop;

public class ApplicationDevelopingBankAccountObject
 {
//BankAccount Prooerties (values required perform operations)
    private long accNo;
    private double balance;
    private String userName;
    private String password;
    
//Paramerized constructor to initialize instance
    public ApplicationDevelopingBankAccountObject(long accNo,double balance,String userName,String password)
      {
    	this.accNo=accNo;
    	this.balance=balance;
    	this.userName=userName;
    	this.password=password;
    	System.out.println(userName);
    	System.out.println(password);
    	System.out.println(accNo);
    	System.out.println(balance);
      }
    
//BankAccount Behaviours(an options to complete a transaction)
    public void deposit(double amt)throws Exception
      {
    	if(amt<=0)
    	  {
    		throw new Exception();
    	  }
    	balance=balance+amt;
      }
    
public double withdraw(double amt)throws Exception
  {
	if(balance<amt)
	 {
		throw new Exception();
	 }
	balance=balance-amt;
	return amt;
  }
	public static void main(String[] args) throws Exception 
	{
		ApplicationDevelopingBankAccountObject a=new ApplicationDevelopingBankAccountObject(233333l,63.34d,"sonu","Password........");
		a.deposit(11);
		a.withdraw(22.2d);
	}

}

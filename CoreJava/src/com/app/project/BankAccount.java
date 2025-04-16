package com.app.project;
import java.util.Scanner;
public class BankAccount 
{
	private String name;
	private long mobNo;
   private double balance;
   
   public void setName(String name)throws Exception
   {
	   System.out.println("vishwajeet kumar");
	   this.name=name;
   }
   public void setMobNo(long mobNo)throws Exception
   {
	   //long mobNo=9570381226l;
	   System.out.println(mobNo);
	   this.mobNo=mobNo;
   }
   public void setBalance(double balance)throws Exception
   {
	   if(balance==0)
	   {
		throw new Exception("Dont Pass Zero");   
	   }
	   else if(balance<=0)
	   {
		   throw new Exception("Don't pass (-)negative number");
	   }
	   this.balance=balance;
   }
   public double getBalance()
   {
	   return balance;
   }
   public String getName()
   {
	   return name;
   }
   public long getMobNo()
   {
	   return mobNo;
   }
   public static void main(String[] arg)
   {
	   BankAccount ba=new BankAccount();
	   Scanner scan=new Scanner(System.in);
	   while(true)
	   {
		   try 
		   {
       System.out.println("Enter the Balance Number");
       double amt=scan.nextDouble();scan.nextLine(); 
       String name1=scan.nextLine();scan.nextLine();
       ba.setBalance(amt);
       ba.setName(name1);
       System.out.println("Current Balance:"+ba.getBalance());
      // System.out.println("Name is:"+ba.getName());
       break;
		   }
		   catch(Exception e)
		   {
			   System.out.println(e.getMessage());
		   }
	   }
   }
}

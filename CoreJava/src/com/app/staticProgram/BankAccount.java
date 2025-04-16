package com.app.staticProgram;

import java.util.Scanner;

public class BankAccount
{
     private static String bankName;
     private static String branch;
     private static String ifsc;
     
     private long accNumber;
     private String accName;
     private double balance;
     
     static
     {
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("Enter bankName");
    	 bankName=scan.nextLine();
    	 
    	 System.out.println("Enter branch");
    	 branch=scan.nextLine();
    	 
    	 System.out.println("Enter balance");
    	 ifsc=scan.nextLine();
     }
 //BankName    
     public static void setBankName(String bankName)
     {
    	 BankAccount.bankName=bankName;
     }
     public static String getBankName()
     {
    	 return "bankName";
     }
//Branch    
     public static void setBranch(String branch)
     {
    	 BankAccount.branch=branch;
     }
     public static String getBranch()
     {
    	 return "branch";
     }
//ifsc
     public static void setIFSC(String ifsc)
     {
    	 BankAccount.ifsc=ifsc;
     }
     public static String getIFSC()
     {
    	 return "ifsc";
     }
     
 public static void bankName()
 {
	 System.out.println("BankName is:"+bankName);
 }
 public static void branch() 
 {
	 System.out.println("Branch is:"+branch);
 }
 public static void ifsc()
 {
	 System.out.println("IFSC number is:"+ifsc);
 }
 
 public void display()
 {
	 System.out.println("BankName:"+bankName);
	 System.out.println("BranchName:"+branch);
	 System.out.println("Branch IFSC:"+ifsc);
	 System.out.println("AccountName:"+accName);
	 System.out.println("AccountNumber:"+accNumber);
	 System.out.println("Account Balance:"+balance);
 }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*BankAccount.bankName();
		BankAccount.branch();
		BankAccount.ifsc();*/
      BankAccount ba=new BankAccount();
      ba.display();


	}

}

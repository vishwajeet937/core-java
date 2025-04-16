package com.app.project;

import java.util.Scanner;

interface FarmHouse 
  {
	  public void farmHouse();
  }
  interface Seed  
  {
	  public void seed();
  }
  interface Food
  {
	  public void abeis();
  }
  interface Medicine
  {
	  public String tutiya();
  }
  interface FishPrice
  {
	  public float jasherPrice();
	  public int rehuPrice();
  }
  interface Payment
  {
	  public void phnPay();
	  public void paytm();
  }
  abstract class Seed1 implements Seed
  {
	  public void seed1()
	  {
		  System.out.println("seed");
	  }
  }
  class Seed3 extends Seed1
   {
	  public void seed()
	  {
		  System.out.println("seed1");
	  }
   }
  class Seed2
  {
	  public void assignSeed(Seed sd)
	  {
		  sd.seed();
	  }
  }
 class FishFarm implements FarmHouse
 {
	 public void farmHouse()
	 {
		 System.out.println("**************Welcome to FarmHouse****************");
	 }
 }
 class FoodType implements Food
 {
	 int foodPackatAvailable=10;
	 public void abeis()
	 {
		 while(foodPackatAvailable<8)
		 {
		 System.out.println("Food is: Available");
		 }
		 System.out.println("Food is: Not Available");
	 }
 }
 class MedicineType implements Medicine
 {
	 public String tutiya()
	 {
		 System.out.println("tutiya medicine is out of stock");
		 return "tutiya";
	 }
 }
  class Jasher implements FishPrice
  {
	public float jasherPrice()
	{
		int jasherQuentity=150 ;
		if(jasherQuentity<50)
		{
		System.out.println("JasherPrice:"+ 120);
		
		}
		else if(jasherQuentity<99)
		{
			System.out.println("jasherPrice is:"+125);
		}
		else if(jasherQuentity<=150)
		{
			System.out.println("jasherPrice is:"+130);
		}
		else {
			System.out.println("out of stock");
		}
		return 12.2f;
	}
	public int rehuPrice()
	{
		int rehuQuantity=734;
		//for(int i=0;i<rehuQuantity;i++)
		{
			if(rehuQuantity<25)
			{
		      System.out.println("rehuPrice:"+240);
		    }
			else
			{
				System.out.println("rehuPrice:"+280);
			}
		}
		return 32;
	}
  }
 class PaymentType implements Payment
  {
	 public void phnPay()
	 {
		 System.out.println("Now PhnPay is Available");
	 }
	 public void paytm()
	 {
		 System.out.println("Now Paytm is not working");
	 }
 
          // mainMethod
  public static void main(String[] args)
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the number");
	  
	  int jasherQuentity=scan.nextInt();
	  int rehuQuantity=scan.nextInt();
	  
	  
	  FishFarm fh=new FishFarm();
	  fh.farmHouse();
	  
	  FoodType ft=new FoodType();
	  ft.abeis();
	  
	  Jasher j=new Jasher();
	  j.jasherPrice();
	  j.rehuPrice();
	  
	  MedicineType mt=new MedicineType();
	  mt.tutiya();
	  
	  PaymentType pt=new PaymentType();
	  pt.phnPay();
	  pt.paytm();
	  
	  Seed2 s2=new Seed2(); 
	  s2.assignSeed(new Seed3());
  }
		
 }

package com.app.oop;
import java.util.Scanner;
public class Oyo
{
   static
   {
	   System.out.println("Welcome to Oyo");
   }
   public static void totalAvailableRoom()
   {
	  String available="patna";
	  String available1="masaurhi";
	  String available2="mahadeopur";
	  System.out.println();
	  
	  
   }
}
class Hotel extends Oyo
{
	static
	{
		System.out.println("Welcome to Hotel");
	}
   public static void patnaBranch()
   {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Eneter the number");
	   int numOfRoom=scan.nextInt();
	//  int numOfRoom1=101;
	   if(numOfRoom>51)
	  {
		System.out.println("Available Room");  
	  }
	   else
	   {
		   System.out.println("Not-Available Room");
	   }
	   
   }

    public static void main(String[] args)
	{
	Hotel h=new Hotel();
	h.patnaBranch();
	h.totalAvailableRoom();

	}

}

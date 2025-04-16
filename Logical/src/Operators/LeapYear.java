package Operators;
import java.util.Scanner;
public class LeapYear
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Eneter the Year");
		int year=scan.nextInt();
		
		boolean x=((year%4)==0);
		boolean y=((year%100)!=0);
		boolean z=((year%100)==0 && (year%400)==0);
		
		if(x && (y||z))  
		{
		  System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}

	} 

}

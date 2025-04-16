package Operators;
import java.util.Scanner;
public class WeekCalender
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the DayName");
		char name=scan.next().charAt(0);
		switch(name)
		{
		   case 'S':
			     System.out.println("sunday");
			      break;
		   case 'M':
			     System.out.println("Monday");
			      break;
		   case 'T':
			     System.out.println("Tuesday");
			      break;
		   case 'W':
			     System.out.println("Wednesday");
			      break;
		   case 't':
			     System.out.println("Thrusday");
			      break;
		   case 'F':
			     System.out.println("Friday");
			      break;
		   case 's':
			     System.out.println("Saturday");
			      break;
	      default :
	    	     System.out.println("Invalid input !Please enter weekcharacter between S to s");
			   
		}

	}

}

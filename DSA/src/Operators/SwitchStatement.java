package Operators;
import java.util.Scanner;
public class SwitchStatement 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		//int num=scan.nextInt();
		int num=3;
		switch(num)
		{
		case 1:System.out.println("Home");
		 break;
		case 2:System.out.println("Job");
		 break;
		case 3:System.out.println("Money");
		 break;
		default :System.out.println("AnyThing");
		}
	}

}

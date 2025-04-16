package Functions$Methods;

import java.util.Scanner;

public class B 
{
	public static boolean isEven(int number1)
	{
		if(number1%2==0)
		{
			System.out.println("oddNumbar");
			return true;
		}
		else
		{
			System.out.println("EvenNumber");
			return true;
		}
	}
	public static void main(String[] args) 
	{
		isEven(3);
		Scanner scan=new Scanner(System.in);
         System.out.println("Enter the Number");
         int num;
         num=scan.nextInt();
         if(num%2==0)
        // if(isEven(number%2==0))
         {
        	 System.out.println("even");
         }
         else
         {
        	 System.out.println("odd");
         }
		
		
	}

}

package com.test;
import java.util.Scanner;
public class InveliedAgeException1
{
	
	@org.testng.annotations.Test
		public  void main() 
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number");
			int age=scan.nextInt();
			try
			{
				if (age<18)
				{
					System.out.println("Applicable");
				}
				else 
				{
					throw new InveliedAgeException("not-Applicable");
				}
			}
			catch (InveliedAgeException i)
			{
				System.out.println("catch");
			}
		}
	}



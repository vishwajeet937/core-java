package Sonu21;

import java.util.Scanner;

public class Sonu21 {
	public static void main(String[] args) 
		{
	//public final static Scanner STDIN_SCANNER = new Scanner(System.in);
		int s, p, c; //s= selling price, p= profit, c= cost price

		System.out.print("Enter the selling price of 15 items: ");
		s = STDIN_SCANNER.nextint();
		System.out.print("Enter the profit on 15 items: ");
		p = STDIN_SCANNER.nextint();

		//code to calculate cost of an item 'cost price = (selling price - profit)/15'
		c = (s - p) / 15;

		System.out.println("The cost price of an item is c");
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
/*class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}*/

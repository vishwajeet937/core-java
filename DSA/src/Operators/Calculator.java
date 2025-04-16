package Operators;
import java.util.Scanner;
public class Calculator
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=scan.nextInt();
		System.out.println("Enter the value of b");
		int b=scan.nextInt();
		System.out.println("Enter the Operator");
		char operator=scan.next().charAt(0);
		switch(operator)
		{
		case '+':
			   System.out.println(a+b);
			    break;
		case '-':
			   System.out.println(a-b);
			    break;
		case '*':
			   System.out.println(a*b);
			    break;
		case '/':
			   System.out.println(a/b);
			    break;
		case '%':
			   System.out.println(a%b);
			    break;
	    default :
	    	   System.out.println(" check the operator ");
		}

	}

}

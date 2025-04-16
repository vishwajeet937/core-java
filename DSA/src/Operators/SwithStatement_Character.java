package Operators;
import java.util.Scanner;
public class SwithStatement_Character
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=scan.next().charAt(0);
		switch(ch) 
		{
		case 's':System.out.println("sonu");
		 break;
		case 'v':System.out.println("vishwajeet");
		 break;
		case 'k':System.out.println("kumar");
		 break;
		default :System.out.println("Other");
		}

	}

}

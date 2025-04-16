package ConditionalStatement;
import java.util.Scanner;
public class PostiveOrNegative
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		if(num>0)
		{
			System.out.println("Postive Number is:"+num);
		}
		else
		{
		  System.out.println("Negative Number is:"+num);	
		}

	}

}

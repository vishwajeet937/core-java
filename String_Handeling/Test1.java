import java.util.*;
class Test1 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int num=0;
		int num02=0;
		int temp=0;
		//int val=0;
		while(true)
		{
		try
		{
			
		System.out.println("Enter the firstnum");
		if(temp!=0)
		scan.nextLine();
		num=scan.nextInt();
		
		//break;
		}
		catch (InputMismatchException i)
		{
			temp++;
			System.out.println("Enter number only");
			continue;
		}
		try
		{
			
		System.out.println("Enter the secondnum");
		if(temp!=0)
		scan.nextLine();
		num=scan.nextInt();
		
		break;
		}
		catch (InputMismatchException i)
		{
			temp++;
			System.out.println("Enter number only1");
			
		}
		
		}
	}
}

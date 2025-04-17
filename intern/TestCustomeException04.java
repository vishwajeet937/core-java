import java.util.Scanner;
class TestCustomeException04 
{
	public static void main(String[] args) throws TestCustomeException4 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int val=scan.nextInt();
		if (val<=11)
		{
			System.out.println("stack Available");
		}
		else if(val>=21)
		{
			System.out.println("Available");
		}
		else
		{
			
		   throw new TestCustomeException4("out of staock");
		}
	}
}

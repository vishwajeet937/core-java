import java.util.Scanner;
class TestCustomeException06 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		try
		{
			if (num<=10)
			{
				System.out.println("Available");
			}
			else 
			{
				throw new TestCustomeException6();
			}
		}
		catch(RuntimeException r)
		{
			System.out.println("out of stock");
		}
	}
}

import java.util.Scanner;
class Demo1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=scan.nextInt();
		for (int i=1;i<=a-1;i++)
		{
			if(i%2==0)
			{
			System.out.println(i);
			}
		}
	}
}

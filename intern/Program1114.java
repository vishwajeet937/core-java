import java.util.Scanner;
class Program1114 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=scan.nextInt();
		for (int i=1 ;i<=num ;i++ )
		{
			for (int j=1 ;j<=i ;j++ )
			{
				System.out.print(i*j+" ");
			}
			System.out.println();
		}

	}
}

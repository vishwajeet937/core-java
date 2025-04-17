import java.util.Scanner;
class PatternProgram9
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		for (int i=num ;i>=1 ;i-- )
		{
			for (int j=i ;j>=1 ;j-- )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i=1 ;i<=num ;i++ )
		{
			for (int j=i ;j>=1 ;j-- )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

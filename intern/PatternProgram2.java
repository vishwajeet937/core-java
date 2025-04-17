import java.util.Scanner;
class PatternProgram2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		{
			for (int i=1 ;i<=num ;i++ )
			{
				for (int j=1 ;j<=i ;j++ )
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
	}
}

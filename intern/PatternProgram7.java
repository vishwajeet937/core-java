import java.util.Scanner;
class PatternProgram7
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		for (int i=num ;i>=1 ;i--)
		{
			for (int j=num ;j>=i ;j-- )
			{
		
			System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

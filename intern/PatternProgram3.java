import java.util.Scanner;
class PatternProgram3 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		for (int i=1 ;i<=5 ;i++ )
		{
			for (int j=5 ;j>=i ;j-- )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

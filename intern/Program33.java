import java.util.Scanner;
class Program33 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int size=scan.nextInt();
		//int size=5;
		for (int i=0 ;i<size+1 ;i++ )
		{
			for (int j=size ;j>i ;j-- )
			{
				System.out.print(" ");
			}
			for (int k=0 ;k<(2*i-1) ;k++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


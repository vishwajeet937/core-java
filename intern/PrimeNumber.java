import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int primeNumber=scan.nextInt();
		for (int i=1 ;i<=primeNumber ;i++ )
		{
			if (i%2==1)
			{
				System.out.println(i);
			}
			else if(i<=1)
			{
				System.out.println(i);
			}
			else
			{}
			
		}
	}
}

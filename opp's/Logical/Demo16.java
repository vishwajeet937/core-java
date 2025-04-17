import java.util.Scanner;
class Demo16 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		int i=scan.nextInt();
		for (int j=1;j<=i;j++)
		{
			System.out.println(" ");
			for (int k=1;k<=j;k++)
			{
				System.out.print(k+" ");
			}
			
		}
		System.out.println();
	}
	
	}

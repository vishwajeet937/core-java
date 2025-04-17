import java.util.Scanner;
class Pattern6 
{
	public static void m1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Number");
		int i=scan.nextInt();
		for (int j=0;j<=i;j++)
		{
			//System.out.println(" ");
			for(int k=1;k<=j;k++)
				{
				//if(k%2==1)
					System.out.print(k);
				}
				System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Pattern6 p=new Pattern6();
		p.m1();
	}
}

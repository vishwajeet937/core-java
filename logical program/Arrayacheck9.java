import java.util.Scanner;
class ArrayCheck9 
{
	public static void m1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Number");
		int i=scan.nextInt();
		int[] j=new int[i];
		for(int k=0;k<=i;k++)
		{
			System.out.print(k);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		ArrayCheck9 a=new ArrayCheck9();
		a.m1();
	}
}

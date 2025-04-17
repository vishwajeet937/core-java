import java.util.Scanner;
class Check27 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		int[] b=new int[a];
		for (int i=0;i<a.length-1;i++)
		{
           System.out.print(i);
		}
		System.out.println();
	}
}

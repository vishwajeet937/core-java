import java.util.Scanner;
class ArrayCheck7 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The number");
		int i=scan.nextInt();
		//int[] j=new int[i];
		for(int k=1;k<=i;k++)
		{
			for(int l=4;l>=k;l--)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}

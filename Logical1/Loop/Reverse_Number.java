import java.util.Scanner;
class Reverse_Number 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		for(int i=0;i>=num;i++)
		{
			int reverse=num%10;
			System.out.print(reverse);
		}
		System.out.println();
	}
}

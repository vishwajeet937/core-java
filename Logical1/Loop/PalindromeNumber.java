import java.util.Scanner;
class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int r; sum=0;temp;
		//int temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum+10)*r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome_Number");
		}
		else
		{
			System.out.println("Not-Palindrome_Number");
		}
	}
}

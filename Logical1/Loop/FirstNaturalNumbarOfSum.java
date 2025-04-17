import java.util.Scanner;
class FirstNaturalNumbarOfSum 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		int count=1;
		int sum=0;
		while(count<=num)
		{
            sum=sum+count;
			count++;
		}
		System.out.println("NaturalNumber is:"+sum);
	}
}

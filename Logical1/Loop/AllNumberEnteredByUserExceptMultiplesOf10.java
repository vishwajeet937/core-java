import java.util.Scanner;
class  AllNumberEnteredByUserExceptMultiplesOf10
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
         do
		{
			System.out.println("Enter the Number");
			int n=scan.nextInt();
			if(n%10==0)
			{
				continue;
			}
			System.out.println("Number was:"+n);
		}
		while(true);
	}
}

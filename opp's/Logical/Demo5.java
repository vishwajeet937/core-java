import java.util.Scanner;
class Demo5 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=scan.nextInt();
		int b=0;
		  for (int i=1;i<=a;i++)
		  {
			  if(a%i==0)
			  {
				b++;
			  }
		  }
		  if(b==2)
		{
			System.out.println("prime Number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}
}

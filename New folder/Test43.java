import java.util.Scanner;
class Test43 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
         System.out.println("Enter first value");
		 int first=scan.nextInt();
		 System.out.println("Enter second value");
		 int second=scan.nextInt();
		if (first>0 && second>0)
		{
			System.out.println("area is"+(first*second));
		}
		else
		{
			throw new IllegalArgumentException("you have to enter only possative number");
		}
	}
}

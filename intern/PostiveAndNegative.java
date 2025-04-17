import java.util.Scanner;
class PostiveAndNegative 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		if (number>0)
		{
			System.out.println("Postive number:"+number);
		}
		else if (number<0)
		{
			System.out.println("Negative number:"+number);
		}
		else
		{
			System.out.println("Zero Number:"+number);
		}
	}
}

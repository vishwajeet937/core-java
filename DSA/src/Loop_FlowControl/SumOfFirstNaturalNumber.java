package Loop_FlowControl;
import java.util.Scanner;
public class SumOfFirstNaturalNumber 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int val=scan.nextInt();
		int sum=0;
		int i=1;
		while(i<=val)
		{
			sum =sum+i;
			i++;
		}
		System.out.println("Sum is:"+sum);
	}

}

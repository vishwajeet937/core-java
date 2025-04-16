
package Loop_FlowControl;
import java.util.Scanner;
public class SumOfPrintEvenOrOdd
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int val=scan.nextInt();
		int evenSum=0;
		int oddSum=0;
		for(int i=1;i<val;i++)
		{
			if(val%2==0)
			{
				evenSum+=val;
		
			}
			else if(val%2==1)
			{
			    oddSum+=val;	
			}
			
			
		}
		System.out.println("Even Number of sum is:"+evenSum);
		System.out.println("odd number of sum is:"+oddSum);
		
	}

}

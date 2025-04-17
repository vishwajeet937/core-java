import java.util.Scanner;
import java.util.Arrays;
class SumNoProgram 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int val=scan.nextInt();
		int[] arr=new int[val];
		int sum=0;
		for (int i=0 ;i<=arr ;i++)
		{
            sum=sum+arr[i];
			System.out.println(sum);
		}
		
	}
}

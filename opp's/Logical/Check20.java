import java.util.Arrays;
import java.util.Scanner;
class Check20 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int[] evenArr=new int[num];
		int evenIndex=0;
		int evenSum=0;
		int[] oddArr=new int[num];
		int oddIndex=0;
		int oddSum=0;
		for (int i=1 ;i<=num ;i++ )
		{
			if (i%2==0)
			{
				evenArr[evenIndex]=i;
				evenIndex++;
				evenSum=evenSum+i;
			}
			else if (i%2==1)
			{
				oddArr[oddIndex]=i;
				oddIndex++;
				oddSum=oddSum+i;
			}
		}
		System.out.println(Arrays.toString(evenArr));
		System.out.println(Arrays.toString(oddArr));
		System.out.println(evenSum);
		System.out.println(oddSum);
	}
}

import java.util.Arrays;
import java.util.Scanner;
class Demo19 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=scan.nextInt();
		int[] evenArr=new int[range];
		int evenIndex=0;
		int[] oddArr=new int[range];
		int oddIndex=0;
		for (int i=1 ;i<=range ;i++ )
		{
			if(i%2==0)
			{
				evenArr[evenIndex]=i;
				evenIndex++;
			}
			else if(i%2!=0)
			{
				oddArr[oddIndex]=i;
					oddIndex++;
			}
		}
		System.out.println(Arrays.toString(evenArr));
		System.out.println(Arrays.toString(oddArr));
	}
}

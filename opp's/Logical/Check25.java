import java.util.Scanner;
import java.util.Arrays;
class Check25 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		int val=scan.nextInt();
		int[] oddArr=new int[val];
		int oddIndex=0;
		int[] evenArr=new int[val];
		int evenIndex=0;
		for (int i=1 ;i<=oddArr.length-1 ;i++ )
		{
			if(i%2==0)
			{
			  evenArr[evenIndex]=i;
			  evenIndex++;
			}
			else if (i%2!=0)
			{
				oddArr[oddIndex]=i;
				oddIndex++;
			}
		}
		System.out.println(Arrays.toString(evenArr));
		System.out.println(Arrays.toString(oddArr));
	}
}

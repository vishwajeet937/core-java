import java.util.Arrays;
import java.util.Scanner;
class Check23 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int val=scan.nextInt();
		int[] arr=new int[val];
		for (int i=arr.length-1 ;i>=0 ;i-- )
		{
             arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
}

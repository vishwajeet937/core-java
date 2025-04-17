import java.util.Scanner;
import java.util.Arrays;
class Demo14 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=scan.nextInt();
		int[] a=new int[num];
		int count=0;
		for (int i=1 ;i<=num ;i++)
		{
           if(num%i==0)
			{
				count++;
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}
}

import java.util.Scanner;
import java.util.Arrays;
class OddNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int val=scan.nextInt();
		int[] a=new int[val];
		for (int i=0 ;i<=val ;i++ )
		{
              if (i%2==1)
              {
				  System.out.println(i);
              }
		}
	}
}


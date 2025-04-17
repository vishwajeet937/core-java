import java.util.Scanner;
//import java.util.Arrays;
class TestCustomeException03 
{
	public static void main(String[] args)throws TestCustomeException3 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int val=scan.nextInt();
		//int[] arr=new int[val];
		if (val>=51)
		{
			System.out.println("Stock-Available");
		}
		else if(val<=21)
		{
			System.out.println("Available");
		}
		else
		{
			throw new TestCustomeException3("out of stock");
		}
        
		
	}
}

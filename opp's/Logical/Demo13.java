import java.util.Scanner;
class Demo13 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=scan.nextInt();
		int sum=0;
		for (int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				//System.out.println(i);
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
	}
}

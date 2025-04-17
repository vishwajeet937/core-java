import java.util.Scanner;
class Check1 
{
	int totalItemQuentity=30;
	public void orderItem(int quentity)throws Exception
	{
		if (quentity<=totalItemQuentity)
		{
			System.out.println("order succesfilly placed");
		}
		else
		{
		  throw new OutOfStock("item is out of stock now");	
		}
	}
	public static void main(String[] args)throws Exception 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How many item");
		int i=scan.nextInt();
		Check1 c=new Check1();
		c.orderItem(i);
	}
}

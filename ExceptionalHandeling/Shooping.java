import java.util.Scanner;
class Shooping
{
 public static void main(String[] args)throws OutOfStockPen
	{
	 Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number");
	int val=scan.nextInt();
		
		
			if(val<=10)
			{
				System.out.println("Available");
			}
			else 
			{
				throw new OutOfStockPen("Not-Available");
			}
		
	}
}

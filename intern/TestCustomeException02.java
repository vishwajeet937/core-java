import java.util.Scanner;
class TestCustomeException02 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the nubmer");
        int val=scan.nextInt();
		  try
		   {
		   if (val<101)
		   {
			   System.out.println("Stock-Available");
		   }
		  else 
		   {
			  throw new TestCustomeException2("out of stock");
		   }
		  }
		catch(Exception e)
		{
			//System.out.println("catch");
			e.printStackTrace();
		}
	}
}

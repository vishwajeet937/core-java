package Loop_FlowControl;
import java.util.Scanner;
public class FactorialNumber
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Numebr");
		int num =scan.nextInt();
		int fact=1;
		for(int i=1;i<num;i++)
		{
			fact*=i;
		}
          System.out.println("factorial is:"+fact);
	}

}

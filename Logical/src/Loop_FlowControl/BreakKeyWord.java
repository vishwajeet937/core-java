package Loop_FlowControl;
import java.util.Scanner;
public class BreakKeyWord
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		do
		{
			System.out.println("Enter the Number");
		    int num=scan.nextInt();
		    if(num%10==0)
		    {
		    	break;
		    }
		    System.out.println(num);
		}
		while(true);
	}

}

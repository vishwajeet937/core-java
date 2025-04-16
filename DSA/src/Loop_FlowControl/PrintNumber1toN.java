package Loop_FlowControl;
import java.util.Scanner;
public class PrintNumber1toN 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
	    int range=scan.nextInt();
	    int counter=1;
		while(counter<=range)
		{
			System.out.println(counter);
			counter++;
		}
	}

}

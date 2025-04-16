package Loop_FlowControl;
import java.util.Scanner;
public class MultiplicationTable
{
    public static int multiplication()
    {
    	Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the Number");
		int num=scan.nextInt();
		
		for (int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" ="+num*i);	
		}
		
    	return 1;
    }
	public static void main(String[] args)
	{
		MultiplicationTable.multiplication();
	}

}

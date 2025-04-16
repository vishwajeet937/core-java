package Loop_FlowControl;
import java.util.Scanner;
public class PrimeNumberCheck
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
        int num=scan.nextInt();
        if(num==2)
        {
        	System.out.println("num is prime");
        }
        else
        {
        	boolean isPrime=true;
        	for(int i=2;i<num-1;i++)
        	{
        		if(num%i==0)
        		{
        			isPrime=false;
        		}
        	}
        	if(isPrime==true)
        	{
        		System.out.println("num is prime");
        	}
        	else 
        	{
        		System.out.println("num is not prime");
        	}
        }
	}

}

package Functions$Methods;
import java.util.Scanner;
public class SwapProgram 
{
   public int swap(int a,int b)
   {
	//  int a;
	  //int b;
	  int temp=a;
	   
		a=b;
		b=temp;
		
		

	   return 11;
   }
	public static void main(String[] args)
	{
		SwapProgram sp=new SwapProgram();
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		int b=scan.nextInt();*/
		sp.swap(1,2);
		int a=5;
		int b=6;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
	}

}

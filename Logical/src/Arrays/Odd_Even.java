package Arrays;
import java.util.Scanner;
public class Odd_Even
{
     public int odd(int num)
     {
    	 for(int i=0;i<num;i++)
    	 {
    		 if(num%2==1)
    		 {
    			 System.out.println(num);
    		 }
    	 }
    	 return 11;
     }
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the number");
		int num=scan.nextInt();
		Odd_Even oe=new Odd_Even();
		oe.odd(num);
	}

}

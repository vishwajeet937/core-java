package Variables$Data;
import java.util.Scanner;
public class Assessment1
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
        int a=scan.nextInt();
        System.out.println("Enter the second number");
        int b=scan.nextInt();
        System.out.println("Enter the third number");
        int c=scan.nextInt();
        int average=(a+b+c)/3;
        System.out.println("Average number of:"+average);
	}

}

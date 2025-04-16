package Pattern_Parts1;
import java.util.Scanner;
public class StarPattern 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		for(int line=1;line<=num;line++)
		{
			for(int star=1;star<=line;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

package Variables$Data;
import java.util.Scanner;
public class Assessment2 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
        int side=scan.nextInt();
        int area=side*side;
        System.out.println("Area of the square is:"+area);
	}

}

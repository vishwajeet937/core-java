package Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;
public class Array2 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int marks[]=new int[100];
		
		System.out.println("Array of length:"+marks.length);
		
		int phy=scan.nextInt();
		int che=scan.nextInt();
		int math=scan.nextInt();
		
		System.out.println("phy:"+phy+"\n"+"che:"+che+"\n"+"math:"+math);
		
		int totalMarks=phy+che+math;
		System.out.println("totalMarks:"+totalMarks);
		
		int marksOfPersent=(phy+che+math)/3;
		System.out.println("marksOfPersent:"+marksOfPersent+"%");

	}

}

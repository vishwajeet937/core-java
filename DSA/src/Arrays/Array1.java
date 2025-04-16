package Arrays;
import java.util.Scanner;
public class Array1 
{

	public static void main(String args[])
	{
		int marks[]=new int[100];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the phyMarks");
	    marks[0]=scan.nextInt();//phy
	    System.out.println("Enter the cheMarks");
		marks[1]=scan.nextInt();//che
		System.out.println("Enter the mathMarks");
		marks[2]=scan.nextInt();//math
		
		System.out.println("phy:"+marks[0]);
		System.out.println("che:"+marks[1]);
		System.out.println("math:"+marks[2]);
		
		int persentage=(marks[0]+marks[1]+marks[2])/3;
		System.out.println("persentage="+persentage+"%");
		
		
	}

}

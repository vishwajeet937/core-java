import java.util.Scanner;
class ArrayCheck 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=scan.nextInt();
         //int[] j={3,54,5,54,54,54};
		 int[] j=new int[i];//Third Syntex
		System.out.println(java.util.Arrays.toString(j));
	}
}

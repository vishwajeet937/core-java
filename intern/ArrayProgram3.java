import java.util.Scanner;
class ArrayProgram3 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int[] arr=new int[10];
		
		for (int i=0 ;i<=arr.length ;i++ )
		{
			System.out.println(i);
			arr[i]=scan.nextInt();
		}
		for (int i=0 ;i<=arr.length ;i++ )
		{
			System.out.println(i+arr[i]);
		}
	}
}

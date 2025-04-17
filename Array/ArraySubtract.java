import java.util.Scanner;
class ArraySubtract 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=scan.nextInt();
		int[] j=new int[i];
		for(int k=0;k<i;k++)
		{
			int b=scan.nextInt();
			j[k]=b;
		}
		System.out.println(java.util.Arrays.toString(j));
		ArraySubtract a=new ArraySubtract();
		int val=a.sub(j);
		System.out.println(val);
	}
			public int sub(int[] i)
		{
			int sub=0;
			for(int j=0;j<i.length;j++)
			{
				sub=sub-i[j];
			}
			System.out.println();
			return sub;
		}
} 

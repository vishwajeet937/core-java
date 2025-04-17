import java.util.Scanner;
class Demo17 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the vallue");
		int i=scan.nextInt();
		for (int j=1;j<=i ;j++)
		{
			System.out.println(" ");
			for (int k=i;k>=j;k--)
			{
				System.out.print(k+" ");
			}
		}
		System.out.println();
	}
}
int[] i=new int[]{2,3,4,5};
int i[]={4,5,6};
i[1]=6;
int[] a=new int[i];
a[7]=23;

System.out.println();
import java.util.Scanner;
class Calculator 
{
		public static int m1(int i,int j)
		{
			int sum=i+j;
			return sum;
		}
		public static int m2(int i,int j)
		{
			int sub=i-j;
			return sub;
		}
		public static int m3(int i,int j)
	{
			int mult=i*j;
		    return mult;
	}
		public static int m4(int i,int j)
	{
			int div=i/j;
		    return div;
	}
		public static int m5(int i, int j)
	{
			int mod=i%j;
		    return mod;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=scan.nextInt();
		int j=scan.nextInt();
		System.out.println();
		Calculator.m1(i,j);
		Calculator.m2(i,j);
		Calculator.m3(i,j);
		Calculator.m4(i,j);
		Calculator.m5(i,j);
		System.out.println(Calculator.m1(i,j));
		System.out.println(Calculator.m2(i,j));
		System.out.println(Calculator.m3(i,j));
		System.out.println(Calculator.m4(i,j));
		System.out.println(Calculator.m5(i,j));
	}
}

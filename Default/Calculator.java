import java.util.Scanner;
class Calculator extends Object 
{
	/*int fishSeed1;
	int fishSeed2;
	int fishSeed3;
	int fishSeed4;
	int fishSeed5;
	int fishSeed6;
	int fishSeed7;
	int fishSeed8;
	int fishSeed9;
	int fishSeed10;*/
	/*int a;
	public int a()
	{
		System.out.println("a:"+a);
		//System.out.println("b:"+b);
		return a;
	}*/
}
	class Pond10 extends Calculator
	{
		int fishSeed10=15000;
		public int fishSeed10()
		{
			System.out.println("fishSeed10:"+fishSeed10);
			return fishSeed10;
		}
	}
	class Pond9 extends Pond10
	{
		int fishSeed9=10000;
		public int fishSeed9()
		{
			System.out.println("fishSeed9:"+fishSeed9);
			return fishSeed9;
		}
	}
	class Pond8 extends Pond9
	{
		int fishSeed8=9000;
		public int fishSeed8()
		{
			System.out.println("fishSeed8:"+fishSeed8);
			return fishSeed8;
		}
	}
	class Pond7 extends Pond8
	{
		int fishSeed7=25000;
		public int fishSeed7()
		{
			System.out.println("fishSeed7:"+fishSeed7);
			return fishSeed7;
		}
	}
	class Pond6 extends Pond7
	{
		int fishSeed6=15000;
		public int fishSeed6()
		{
			System.out.println("fishSeed6:"+fishSeed6);
			return fishSeed6;
		}
	}
	class Pond5 extends Pond6
	{
		int fishSeed5=25000;
		public int fishSeed5()
		{
			System.out.println("fishSeed5:"+fishSeed5);
			return fishSeed5;
		}
	}
	class Pond4 extends Pond5
	{
		int fishSeed4=5000;
		public int fishSeed4()
		{
			System.out.println("fishSeed4:"+fishSeed4);
			return fishSeed4;
		}
	}
	class Pond3 extends Pond4
	{
		int fishSeed3=20000;
		public int fishSeed3()
		{
			System.out.println("fishSeed3:"+fishSeed3);
			return fishSeed3;
		}
	}
	class Pond2 extends Pond3
	{
		int fishSeed2=35000;
		public int fishSeed2()
		{
			System.out.println("fishSeed2:"+fishSeed2);
			return fishSeed2;
		}
	}
	class Pond1 extends Pond2
	{
		int fishSeed1=25000;
		public int fishSeed1()
		{
			System.out.println("fishSeed1:"+fishSeed1);
			return fishSeed1;
		}
	public static void main(String[] args) 
	{
		Pond1 p=new Pond1();
		int sum=0;
		sum=p.fishSeed1()+p.fishSeed2()+p.fishSeed3()+p.fishSeed4()+p.fishSeed5()+p.fishSeed6()+p.fishSeed7()+p.fishSeed8()+p.fishSeed9()+p.fishSeed10();
		/*p.fishSeed1();
		p.fishSeed2();
		p.fishSeed3();
		p.fishSeed4();
		p.fishSeed5();
		p.fishSeed6();
		p.fishSeed7();
		p.fishSeed8();
		p.fishSeed9();
		p.fishSeed10();*/
		System.out.println(".............Total Seeds.............");
		System.out.println(sum);
	}
	/*class Calculate
		{
			public static void main(String[] args)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the Number");
				int i=scan.nextInt();
				int[] j=new int[i];
				for(int k=fishSeed1;k<=fishSeed10;k++)
				{
					int b=scan.nextInt();
					j[k]=b;
				}
				sum=0;
				sum=sum+
			}
		}*/
}

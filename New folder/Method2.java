class Method2 
{
	void m1()
	{
		System.out.println("hi");
	}
	void m2()
	{
		int p=10;
		System.out.println("p");
	}
	void m3(int p)
	{
		System.out.println("p");
	}
		static int a=10;
		void m4()
	{
		System.out.println("a");
	}
}
class Test
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Method2.m1();
		Method2.m2();
		Method2.m3();
		Method2.m4();
	}
}

class Test46 
{
	static int a=12;
	static void m1()
	{
		//System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
	}
}
class Test47
{
	static void m2()
	{
		System.out.println("Test47.a");
	}
	public static void main(String[] args)
	{
		Test47.m2();
	}
}
class Method1 
{
	public static void m1()
	{
		System.out.println("Zero parrem method");
		m2(false);
	}
	public static void m2(boolean b)
	{
		System.out.println("one parrem method:"+b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		m1();
		m2(true);
		//m3(8);
	}
	static
	{
		//public static void m3(int i)
		//{
			System.out.println("m3");
		//}
	}
}

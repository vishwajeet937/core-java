class StaticCall 
{
    static void m1()
	{
		System.out.println("m1");	
	}
	static void m2()
	{
		System.out.println("m2");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		m1();
		m2();
	}
}

class MethodOverLoaded 
{
	public static void m1()
	{
		System.out.println("m1");
         m2(2);
	}
	public static void m2(int i)
	{
		System.out.println("m2");
		m3(23,"sonu");
	}
	public static void m3(int i,String s)
	{
		System.out.println("m3");
		m4(24,32.3f);
	}
	public static void m4(int i,float f)
	{
		System.out.println("m4");
		m5(6);
	}
	public static void main(String[] args) 
	{
		MethodOverLoaded m=new MethodOverLoaded();
		System.out.println("Hello World!");
		m.m1();
	}
	public static void m5(int i)
	{
		System.out.println("m5");
	}
}

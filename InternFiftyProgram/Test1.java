class Test1 
{
	private   static int m2()
	{
		System.out.println("m2 method");
		return 2;
	}
    Test1()
	{
		System.out.println("Zero parrem constructor");
	}
	static
	{
		System.out.println("static");
	}
	public void m1()
	{
		System.out.println("non static method m1");
	}
	{
		System.out.println("non static block");
	}
	public static void main(String[] args) 
	{
		Test1 t=new Test1();
		System.out.println("Hello World!");
		t.m1();
		t.m2();
	}
}

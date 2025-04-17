class A extends Object 
{
	public void a()
	{
		System.out.println("a");
	}
}
class B extends A
{
	public void b()
	{
	System.out.println("b");
	}
}
class C extends B
{
	public void c()
	{
		System.out.println("c");
	}
}
class D extends C
{
	public void d()
	{
		System.out.println("d");
	}
	public static void main(String[] args) 
	{
		D d1=new D();
	}
}

class A
{
	A()
	{
		System.out.println("constructor of A");
	}
	{
		System.out.println("NSB of class A");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Constructor of B");
	}
}
class C extends B
{
	C()
	{
		super();
		System.out.println("Constructor of C");
	}
	{
		System.out.println("NSB in class c");
	}
}
class D extends C
{
	D()
	{
		super();
		System.out.println("Constructor or D");
	}
	public static void main(String[] args) 
	{
		D d1=new D();
	}
}

class Test extends Object 
{
	public void m1()
	{
		System.out.println("m1");
	}
}
Class Test1 extends Test
{
	publi void m2()
	{
		System.out.println("m2");
	}
	public static void main(String[] args) 
	{
		Test t=new Test1();
		t.m1();
	}
}

abstract class Test2 
{
	public void m1()
	{
		System.out.println("abstract");
	}
}
abstract class Test3 extends Test2
{
	abstract public void m1();
	
}
class Test4 extends Test3
{
	public void m1()
	{
		int i=2;
		int j=4;
		System.out.println(i+j);
	}

	public static void main(String[] args) 
	{
		Test2 t=new Test4();
		t.m1();
		System.out.println("Hello World!");
	}
}

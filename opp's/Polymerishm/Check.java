class Check extends Object 
{
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m22");
	}
}
class Check1 extends Check
{
	public void m2()
	{
		System.out.println("m2");
	}
	public void m1()
	{
		System.out.println("m11");
	}
	public static void main(String[] args) 
	{
		Check c=new Check1();
		c.m2();
		c.m1();
	}
}

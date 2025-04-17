class Check extends Object 
{
	public void m1()
	{
		System.out.println("m1");
	}
}
class Check1 extends Check
{
	public void m2()
	{
		System.out.println("m2");
	}
	public static void main(String[] args) 
	{
		Check c=new Check();
		c.m2();
	}
}

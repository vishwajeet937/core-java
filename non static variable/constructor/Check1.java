class Check1 
{
	int i;
	static 
	{
		System.out.println("Static 1");
	}
	public void m1()
	{
		System.out.println("m1 1");
	}
	{
		System.out.println("non static block 1");
	}
	Check1()
	{
		System.out.println("Constructor");
	}
	public int m2()
	{
		System.out.println("m2 2");
		return i;
	}
	/*public static void main(String[] args) 
	{
		System.out.println("main method");
		Check1 c=new Check1();
		c.m1();
		c.m2();
	}*/
}

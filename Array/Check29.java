class Check29 
{
	public int m1()
	{
		System.out.println("m1");
		return 22;
	}
	public Check29 m2()
	{
		System.out.println("m2");
		return new Check29();
	}
	public Check29 m3(Check29 c)
	{
		System.out.println("m3");
		return new Check29();
	}
	public static void main(String[] args) 
	{
		Check29 c=new Check29();
		c.m1();
		c.m2();
		c.m3(c);
	}
}

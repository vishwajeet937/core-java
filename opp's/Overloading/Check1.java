class Check1 extends Object
{
	public Integer main()
	{
		System.out.println("first");
		return 1;
	}
	public Integer main(int i)
	{
		System.out.println("second");
		return 2;
	}
}
class Check2 extends Check1
{
	public void main2()
	{
		System.out.println("main1");
	}
	public void main2(String s)
	{
		System.out.println("main2");
	}
	public static void main(String[] args) 
	{
		Check2 c=new Check2();
		c.main(2);
		c.main2();
	}
}

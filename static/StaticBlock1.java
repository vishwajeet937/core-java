class StaticBlock1
{
	static int i=23;
	static 
	{
		int i=45;
		System.out.println("static block 1");
		System.out.println("i:"+i);
	}
	static
	{
		System.out.println("static block 2:"+i);
	}
	{
		System.out.println("non static block:"+i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main method start");
		StaticBlock1 s=new StaticBlock1();
	}
}

class Example002 
{
	int x=20;
	int y=30;
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	Example002()
	{
		System.out.println("NPC");
	}
	Example002(int p)
	{
		System.out.println("IPC");
	}
	void m1()
	{
		System.out.println("NSM1");
	}
	void m2()
	{
		System.out.println("NSM2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main start");
		Example002 e1=new Example002();
		System.out.println("main end");
	}
}

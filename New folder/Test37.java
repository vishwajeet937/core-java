class Test37 
{
	void m1()
	{
		int x=2;
		int y=3;
		System.out.println(x+y);
	}
	 static void m2()
	{
		int x=4;
		int y=5;
		System.out.println(x+y);
	}
	public static void main(String[] args) 
	{
		Test37.m2();
		Test37 t1=new Test37();
		t1.m1();
		//t1.m2();
		//Test37.m2();
		System.out.print("Hello World!");
		//Test37.m2();
	}
}

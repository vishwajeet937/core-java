class NonStaticMethod 
{
	void m1()
	{
		System.out.println("m1");
		m2();
	}
	void m2()
	{
		System.out.println("m2")
			//m1();
	}
	public static void main(String[] args) 
	{
		NonStaticMethod n1=new nonStaticMethod();
		n1.m1();

		System.out.println("Hello World!");
	}
}

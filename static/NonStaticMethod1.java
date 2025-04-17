class NonStaticMethod1 
{
	void m1()
	{
		System.out.println("m1");
		//m1();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		NonStaticMethod n1= new NonStaticMethoh();
		n1.m1();
	}
}

class NonStaticMethod 
{
	int i;
	void m1(int i)
	{
		i=25;//Replace value
		System.out.println("m1:"+i);
		//m1();
		i=30;
		this.i=i;
		NonStaticMethod n2=new NonStaticMethod();
		n2.m2(24);

	}
	void m2(int i)
	{
		i=13;
		System.out.println("m3:"+i);
			//m1();
	}
	public static void main(String[] args) 
	{
		NonStaticMethod n1=new NonStaticMethod();
		n1.m1(23);


		System.out.println("Hello World!");
	}
}

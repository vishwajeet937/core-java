class ExceptionProgram2 
{
	int i=23;
	int j=0;
	
	public void m1()
	{
		try
		{
			//throw new ArithmeticException("msg");
			int mul=(i*j);
			System.out.println(mul);
			int dev=(i/j);
			System.out.println(dev);
			int add=(i+j);
			System.out.println(add);
		}
		catch (RuntimeException r)
		{
			System.out.println("catch");
		}
	}
	public void m2()throws ArithmeticException 
	{
		int i=33;
		int j=34;
		int sub=(this.i/this.j);
		System.out.println(sub);
		int add=(i+j);
		System.out.println(add);
	}
	public static void main(String[] args)throws ArithmeticException 
	{
		ExceptionProgram2 e=new ExceptionProgram2();
		e.m1();
		e.m2();
		System.out.println("Hello World!");
	}
}

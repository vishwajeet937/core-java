class StaticProgram 
{
	//static block
	static
	{
		String name="vishwajeet kumar";
		int rollNo=904;
		System.out.println("Name:"+name+"\n"+"rollNo:"+rollNo);
	}
	//static method
	 static int method()
	{
		System.out.println("static method");
		return (5);
	}
	//static variable
	static void m1()
	{
		static int i=101;
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		StaticProgram s=new StaticProgram();
		s.method();
		s.m1();
		System.out.println("Hello World!");
	}
}

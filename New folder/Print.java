class Print 
{
	static 
	{
		System.out.println("static block 1");
	}
	{
		System.out.println("non static block 1");
	}
	Print()
	{
		System.out.println("constructor");
	}
	/*public static int m1()
	{
		System.out.println("int m1");
	}*/
	public static void main(String[] args) 
	{
		Print p=new Print();
      //  p.m1();
		System.out.println("Hello World!");
	}
	{
		System.out.println("non static block 2");
	}
}

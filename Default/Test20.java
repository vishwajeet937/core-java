class Test20
{
	static int a=m1();//1
	static int m1()
	{
	System.out.println("A:a");
	return 10;
	}
	static void m2()//2
	{
		System.out.println("A class is loaded");
	}
	public static void main(String[] args) //3
	{
		//Test20.m2();
		System.out.println("A main");
		Test20.m2();
	}
}
/*class Test21 extends Test20
{
	static int b=m2();
	static int m2()
	{
		System.out.println("B:b");
		return 20;
	}
	static
	{
	 System.out.println("B class is loaded");	
	}
	public static void main (String[] args)
	{
		System.out.println("B main");
		System.out.println("B main a:"+a);
		System.out.println("B main b:"+b);
	}
}*/

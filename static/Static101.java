class Static101 
{
	static
	{
			System.out.println("static 1");
	}
	static
	{
		System.out.println("static 2");
	}
	{
		System.out.println("non Static 1");
	}
	static
	{
		System.out.println("static 3");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method 1");
		Static101 s=new Static101();
        System.out.println("main method 2");
	}
	static
	{
		System.out.println("static 4");
	}
	{
		System.out.println("non static 2");
	}
}

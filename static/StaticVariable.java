class StaticVariable
{
	static int x=20;
	static int y=30;
	public static void main(String[] args) 
	{
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	public static void m1()
	{
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
}

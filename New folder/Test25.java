class Test25 
{
	static void add(int a,int b)
	{
		System.out.println("addition result:"+(a+b));
	}
	static void sub(int a,int b)
	{
		System.out.println("Subtraction result:"+(a-b));
	}
	static
	{
		System.out.println("result");
	}
	public static void main(String[] args) 
	{
		System.out.println("main start");
		add(5,6);
		sub(5,6);
		System.out.println("main end");
	}
}

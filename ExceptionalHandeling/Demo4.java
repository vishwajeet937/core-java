class Demo4 
{
	Demo4()
	{
		System.out.println("default constructor");
	}
	Demo4(int i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		Demo4 d=new Demo4(23);
		System.out.println("Hello World!");
	}
}

class Overloaded
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Overloaded a1=new Overloaded();
	}
	Overloaded()
	{
		System.out.println("Zero parrem");
	}
	Overloaded(int i)
	{
		System.out.println("one parrem");
	}
	Overloaded(int i,int j)
	{
		System.out.println("Two parrem");
	}
}

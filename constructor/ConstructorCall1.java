class ConstructorCall1 
{
	ConstructorCall1()
	{
		this(34);
		System.out.println("Constructo 1");
	}
	ConstructorCall1(int i)
	{
		this(24,56.0f);
		System.out.println("constructor 2");
	}
	ConstructorCall1(int i,float f)
	{
		this(12,23.4f,34.1d);
		System.out.println("constructor 3");
	}
	ConstructorCall1(int i,float f,double d)
	{
		this(23,23.4f,"sonu");
		System.out.println("Constructor 4");
	}
	ConstructorCall1(int i,float f,String s)
	{
		System.out.println("Constructor 5");
	}
	public static void main(String[] args) 
	{
		System.out.println("out put");
		ConstructorCall1 c=new ConstructorCall1();
	}
}

class Check12 
{
	Check12()
	{
		this(234);
		System.out.println("Zero parrem constructor");
	}
	Check12(int i)
	{
		this(98765,"sonu");
		System.out.println("one parrem constructor");
	}
	Check12(int i,String s)
	{
		this(24.3f,231.3d,'s');
		System.out.println("Two parrem constructor");
	}
	Check12(float f,double d,char ch)
	{
		System.out.println("Three parrem constructor");
	}
	public static void main(String[] args) 
	{
		Check12 c=new Check12();
		System.out.println("out put");
		Check12 c1=new Check12();
	}
}

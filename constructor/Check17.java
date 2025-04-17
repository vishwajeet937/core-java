class Check17
{
	Check17()
	{
		this(2,3.3f);
		System.out.println("Zero parrem");
	}
	Check17(int i,float f)
	{
		//this(3,43.3d,'s');
		System.out.println("Two parrem Constructor:"+i);
	}
	Check17(int i,double d,char ch)
	{
		this(23.32f,324.322d);
		System.out.println("Three parrem Constructor");
	}
	public static void main(String[] args) 
	{
		Check17 c=new Check17();
	}
	Check17(float f,double d)
	{
		System.out.println("2 parrem constructor");
	}
}

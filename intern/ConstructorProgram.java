class ConstructorProgram 
{
	ConstructorProgram()
	{
		this(1);
		System.out.println("Zero-parrem Constructor");
	}
	ConstructorProgram(int i)
	{
		this(2,"colling");
		int i1=34;
		System.out.println(i1);
		
	}
	ConstructorProgram(int j,String s)
	{
		this(4.4f,3.3d);
		int j1=54;
		String s1="Program";
		System.out.println("j1:"+j1);
		
	}
	ConstructorProgram(float f,double d)
	{
		float f1=32.2f;
		double d1=98.3d;
		System.out.println(f1);
		System.out.println(d1);
		
	}
	public static void main(String[] args) 
	{
		ConstructorProgram c=new ConstructorProgram();
		System.out.println("Hello World!");
	}
}

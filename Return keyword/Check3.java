class Check3 
{
	int i=12;
	String s="sonu";
	double d=3.2d;
	boolean b=true;
	public void m1()
	{
		System.out.println("m1");
	}
	public int m2()
	{
		System.out.println("m2");
        return 234;
	}
	public double m3()
	{
		System.out.println("m3");
		return 3.3d;
	}
	public String m4()
	{
		System.out.println("m4");
		return "jkb";
	}
	public static void main(String[] args) 
	{
		Check3 c=new Check3();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
	}
}

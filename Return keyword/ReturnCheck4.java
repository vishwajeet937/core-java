class ReturnCheck4 
{
	String name;
	long mobNo;
	ReturnCheck4()
	{
		System.out.println("Zero parrem constructor");
	}
	public String name()
	{
		System.out.println("name:"+name);
		return name;
	}
	public long mobNo()
	{
		System.out.println("mobNo:"+mobNo);
		return mobNo;
	}
	public static void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		ReturnCheck4 r=new ReturnCheck4();
		r.name();
		r.mobNo();
		r.m1();
		r.m2();
	}
}

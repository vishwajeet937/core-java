class A2 extends Object 
{
	public void college()
	{
		System.out.println("open form");
	}
}
class B2 extends A2
{
	String name="vishwajeet kumar";
	String college="oec";
	long mobNo=9570381226l;
	int rollNo=164122;
	long redgNo=1601211198l;
	public Object name()
	{
		System.out.println("name:"+name+"\n"+"college:"+college+"\n"+"mobNo:"+mobNo+"\n"+"rollNo:"+rollNo+"\n"+"redgNo:"+redgNo);
		return new B2();
	}
	public static void main(String[] args) 
	{
		B2 b=new B2();
		b.college();
		b.name();
	}
}

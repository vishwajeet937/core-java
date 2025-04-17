class A3 extends Object 
{
	String name="sachin";
	public void A3()
	{
		System.out.println("A3:"+name);
	}
}
class B3 extends A3
{
	//String name="vishwajeet kumar";
	long mobNo=9570381226l;
	public Object B3()
	{
		System.out.println("B3:"+super.name);
		return new B3();
	}
}
class C3 extends B3
{
	//String name="sonu kumar";
	public void C3()
	{
		System.out.println("C3:"+super.name);
	}
}
class D3 extends C3
{
	String name="monu Kumar";
	public void D3()
	{
		String name="janu";
		System.out.println("D3:"+super.name);
	}
	public static void main(String[] args) 
	{
		D3 b=new D3();
		b.B3();
		b.A3();
		b.C3();
		b.D3();
	}
}

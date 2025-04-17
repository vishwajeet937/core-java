class Test extends Object 
{
	String s="hbjb";
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m22");
	}
}
class Test1 extends Test
{
	public void m2(int i,int i1)
	{
		System.out.println(i+i1);
	}
	public void m2(String s,String s1)
	{
		System.out.println(s+s1);
	}
	public static void main(String[] args) 
	{
		//Test t=new Test1();
		//t.m2();
		/*Object o=new Test();
		Test1 t=(Test1)o;*/
		Test t=new Test();
		t.s="nvnn";
		Test t1=new Test();
		System.out.println(t1.s);
	}
}

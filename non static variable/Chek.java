class Chek 
{
	int i;
	String s;
	public void m1(int i,String s)
	{
		this.i=i;
		this.s=s;
		System.out.println("i:"+i);
		System.out.println("s:"+s);
		//this.i=i;
		//this.s=s;
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		Chek c=new Chek();
		c.m1(23,"ewrwe");
		//c.m1();
		//c.m2();
	}
	/*public void m2(int j,String o)
	{
		j=23;
		o="dw";
		System.out.println(j);
		System.out.println(o);
	}*/
}

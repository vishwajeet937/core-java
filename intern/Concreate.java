class Concreate extends Object
{
	public void concreate()
	{
		System.out.println("concreate");
	}
}
class Concreate1 extends Concreate
{
	public void concreate1()
	{
		System.out.println("concreate1");
	}
}
abstract class Oec extends Concreate1
{
     public void oec()
	{
		System.out.println("oec");
	}
}
/*abstract class Gec extends Oec
{
	public abstract void gec();
}*/
class Concreate2 extends Oec
{
	public void concreate2()
	{
		System.out.println("concreate2");
	}

	public static void main(String[] args) 
	{
		Concreate2 c=new Concreate2();
		c.concreate1();
		c.concreate();
		c.concreate2();
		c.oec();
		//c.gec();
		System.out.println("Hello World!");
	}
}

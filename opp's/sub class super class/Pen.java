class Refil extends Object
{
	public void school()
	{
		System.out.println("Refil-School");
	}
	static
	{
		System.out.println("static");
	}
}
class Pen extends Refil 
{
	public void pen()
	{
	System.out.println("pen");
	//return null;
	}
}
class Coppy extends Pen
{
	int i=89;
	
	public void coppy()
	{
		//this.i=23;
		//Coppy c=new Bookk();
		System.out.println("coppy");
		System.out.println(this.i);
	}
}
class Bookk extends Coppy
{
	int i=30;
	//@Override
	public void pen()
	{
	System.out.println("pen1");
	//return null;
	}
	public void pen(int i)
	{
		System.out.println("over loaded");
	}
	public void book()
	{
		System.out.println("Book");
	}
}
class School extends Bookk
{
	/*public void school()
	{
		System.out.println("School");
	}*/
	public static void main(String[] args)
	{
		School s=new School();//Tight coupling
		double d=5;
		//School b=new Bookk();//Wrong Syntex
		Pen b=new School();//Wright Syntex louse coupling
		Coppy c=new Bookk();
		System.out.println(c.i);
		Bookk b1=new Bookk();
		b1.coppy();
		//Pen p=null;
		b.pen();
		//b.bookk();
		//s.coppy();
		//s.pen();
		//b.school();
		//p.pen();
	}
}
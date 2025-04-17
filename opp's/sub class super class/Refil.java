class Refil extends Object
{
	int rollNo=301;
	public static void refil()
	{
		System.out.println("Refil");
	}
	static
	{
		System.out.println("static");
	}
	{
		System.out.println("non static");
	}
}
class Pen extends Refil
{
	//int rollNo1=201;
	int i=501;
	public static void pen()
	{
	System.out.println("pen");	
	}
	String name="nauraten";
	public String name()
	{
		System.out.println("name:"+name);
		return name;
	}
	int rollNo=121;
	public void rollNo()
	{
		System.out.println("rollNo:"+rollNo);
		//return rollNo;
	}
	{
		System.out.println("pen class non static");
	}
	Pen(int i)
	{
		System.out.println("pen class default constructor:"+i);
	}
}
class Coppy extends Pen
{
	static
	{
		System.out.println("coppy class static");
	}
	public static void coppy()
	{
		System.out.println("coppy");
	}
}
class Bookk extends Coppy
{
	/*Bookk()
	{
		System.out.println("Bookk class constructor");
	}*/
	public static void book()
	{
		System.out.println("Book");
	}
	Bookk()
	{
		System.out.println("Book class constructor1");
	}
}
class School extends Bookk
{
	public static void school()
	{
		System.out.println("School");
	}
	public static void main(String[] args)
	{
		School s=new School();
		s.school();
		s.book();
		s.coppy();
		s.pen(2);
		s.refil();
		s.name();
		s.rollNo();
	}
}
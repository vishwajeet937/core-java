class Sonu extends Object 
{
	static String name1="sonu kumar";

	public static void name1()
	{
		System.out.println("name:"+name1);
	}
}
class Monu extends Sonu
{
	static String name2="monu kumar";
	public static void name2()
	{
		System.out.println("name:"+name2);
	}
}
class Bhanta extends Monu
{
	static String name3="Abhay";
	public static void name3()
	{
		System.out.println("name:"+name3);
	}
}
class Janu extends Bhanta
{
	static String name4="janu";
	public static void name4()
	{
		System.out.println("name:"+name4);
	}
}
class Aman extends Janu
{
	static String name5="Aman";
	public static void name5()
	{
		System.out.println("name:"+name5);
	}
	/*public static void main(String[] args)
	{
		System.out.println("out put Program");
		Aman j=new Aman();
		j.name1();
		j.name2();
		j.name3();
		j.name4();
		j.name5();
	}*/
}

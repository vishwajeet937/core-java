import java.util.Scanner;
class Static5 
{ 
	static int a;
	static String s;
    static
		{
		System.out.println("class test is loaded");
	Scanner scan=new Scanner(System.in);
	System.out.println("enter our integer");
	a=scan.nextInt();
	 int a1=9;
	System.out.println("enter any number");
    s=scan.next();
	System.out.println("sv atre initalized with given values");
}
	public static void main(String[] args) 
	{
		Static5.add(2,4,6);
		System.out.println("From main");
		System.out.println("a:"+a);
		System.out.println("s:"+s);
		//System.out.println("a1:"+Static5.a1);
	}
	public static void add(int x,double y,float z)
	{
		System.out.println(x);
		//Static5.main(null);
	}
}

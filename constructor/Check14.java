import java.util.Scanner;
class Check14 
{
	String name="janu";
	long mobNo=9570381226l;
	String vill;
	int i2=40;
	Check14(int i ,String name,float f,boolean b)
	{
		this(2,3);
		int i2=30;
		System.out.println(this.i2);
		System.out.println(name);
	}
	Check14(int i,int j)
	{
		this(98);
		int k=34;
		System.out.println(i);
	}
	Check14(int i2)
	{
		this("Mahadeopur");
		System.out.println(i2);
	}
	Check14(String vill)
	{
		System.out.println(vill);
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		//Check14 c1=new Check14();
		//Check14.m1();
		Check14 c=new Check14(2,"vishwajeet",2.2f,true);
		c.m1(c);
	}
	public static void m1(Check14 c)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Tha value");
		System.out.println("name:"+c.name+"\n"+"mobNo:"+c.mobNo);
		int i=scan.nextInt();
		int[] k=new int[i];
		for(int j=0;j<i;j++)
		{
			System.out.println(j);
		}
	}
}

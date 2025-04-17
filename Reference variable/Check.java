import java.util.Arrays;
class Check 
{
	Check w;
	int no=101;
	String name="Sonu";
	{
		int no=102;
		System.out.println(this.no);
		System.out.println(no);
		System.out.println(this.name);
	}
	public static void m1(Check c)
	{
		System.out.println("m1:"+c.no);
	}
	public static void m2(int[] i)
	{
		System.out.println("m2:"+Arrays.toString(i));
	}
	public static void m3(int i)
	{
		System.out.println("m3:"+i);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Check c=new Check();
		c.m1(c);
		int[] arr=new int[4];
		c.m2(arr);
		c.m3(arr[2]);
		c.w=new Check();
		c.no=102;
	}
}

class Check21 
{
	float f=95.3f;
	public static void m1(Check21 c)
	{
		System.out.println("m1:"+c.f);
		//m2(23.3f);
	}
	public static void m2()
	{
		System.out.println("m2:"+java.util.Arrays.toString(arr[3]));
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		int[] arr=new int[]{3,45,6,7,8,9};
		Check21 c=new Check21();
		c.m1(c);
		c.m2(arr);
	}
}

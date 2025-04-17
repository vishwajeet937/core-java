class ArrayCheck15
{
	public static void m1()
	{
		//m2();
	   int[] i={2,3,4,5,6,7,8};
	   System.out.println(java.util.Arrays.toString(i));
	  m2();
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		ArrayCheck15 a=new ArrayCheck15();
		a.m1();
		a.m2();
	}
	public static void m2()
	{
		int[] j={1,2,3,4};
		System.out.println(j[3]);
	}
}

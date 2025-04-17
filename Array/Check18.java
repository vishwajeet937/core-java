class Check18 
{
	int i=201;
	long mobNo=9570381226l;
	String s="vishwajeet";
	{
		int no=103;
		System.out.println(this.i);
		System.out.println(no);
		System.out.println(this.s);
	}
    public static void m1(Check18 c)
	{
		System.out.println("m1:"+c.i);
		System.out.println("m1:"+c.s);
	}
	public static void m2(int[] i)
	{
		System.out.println("m2:"+java.util.Arrays.toString(i));
		System.out.println(i[4]);
	}
	public static void m3(int[] j)
	{
		System.out.println("m3:"+java.util.Arrays.toString(j));
		System.out.println("m3:"+j[3]);
	}
	public static void m4(int[] k)
	{
		System.out.println("m4:"+java.util.Arrays.toString(k));
		System.out.println("m4:"+k[4]);
	}
	public static void m5(int j)
	{
		System.out.println("m5:"+j);
	}
	public static void m6(int[] k)
	{
		System.out.println("m6:"+k[5]);
	}
	public long m7()
	{
		System.out.println(this.mobNo);
		return mobNo;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Check18 c=new Check18();
		c.m1(c);
        int[] i=new int[9];
		c.m2(i);
		int[] j=new int[]{1,2,3,4,5,6,7,8,9};
		c.m3(j);
		int[] k={9,8,7,6,5,4,3,2,1};
		c.m4(k);
		c.m5(j[5]);
		c.m6(k);
		c.m7();
	}
}

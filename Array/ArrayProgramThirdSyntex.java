class ArrayProgramThirdSyntex 
{
	public static void m1(int[] i,String[] s)
	{
		i[1]=5;
		System.out.println(i[1]);
		System.out.println(java.util.Arrays.toString(i));
		m2(s);
	}
	public static void m2(String[] s)
	{
		s[2]="34";
		System.out.println(s[2]);
	}
	public static void m3(int j)
	{
		System.out.println("m3");
	}
	public static void main(String[] args) 
	{
		int[] arr=new int[4];//we can pass as a argument of an method and also we not required to knows the value of array index.
		String[] s=new String[3];
		System.out.println(java.util.Arrays.toString(arr));
		m1(new int[2],s);
		//m2(s);
		m3(arr[0]);//aar[0] is pointing to the Array arr with element of index zero. 
	}
}

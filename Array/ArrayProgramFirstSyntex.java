class ArrayProgramFirstSyntex 
{
	//public static void main(String[] args)
	public static void m1()
	{
		int[] i={1,2,3,4,5};//only we can assine variable but we can not as argument.
         System.out.println(i[3]);
		 System.out.println(i[4]);
		//System.out.println(java.util.Arrays.toString(i));
	}
	public static void main(String[] args)
	{
		System.out.println("main method");
      ArrayProgramFirstSyntex a=new ArrayProgramFirstSyntex();
	  a.m1();
	}
}

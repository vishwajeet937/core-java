package app.test;
class ArrayProgram
{
	public static void m1(int[] i)
	{
		System.out.println("vbn");
	}
	public static void main(String[] args) 
	{
		//int i=2;
		//int[] i={1,2,3,4,5,6,7};//syntex first
		int[] i=new int[]{2,2,2,2};//syntex Second
         //int[] arr=new int[5];//syntex third
		  // arr[3]=25;
		 //  i[5]=67;
		  // System.out.println(i[1]);
		  // System.out.println(i[3]);
		System.out.println(java.util.Arrays.toString(i));
		//main({"sonu"});//wrong statement
		m1(new int[]{2});
	}
}

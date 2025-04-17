class Method5
{
	/*static int add(int a,int b)
		{
			return a+b;
		}*/
		static int a=3;
		 static int b=4;
	public static void main(String[] args) 
	{
		//Method5.add(3,4);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	public static void add(int a,int b)
	{
		Method5.add(3,4);
	}
}

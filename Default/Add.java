class Add 
{
	int num=20;
	public int num()
	{
		System.out.println("Num:"+num);
		return num;
	}

	Add()
	{
		System.out.println("constructor");
	}
	static long mobNo=9570381226l;
	public static void mobNo()
	{
		System.out.println("mobNo:"+mobNo);
	}
}
	class Bad extends Add
	{
		int i=89;
		public int i()
		{
			System.out.println("i:"+i);
			return i;
		}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Bad a=new Bad();
		a.num();
		a.mobNo();
		a.i();
	}
	/*class Cad extends Bad
	{
		String name="vishwajeet kumar";
		public String name()
		{
			System.out.println("name:"+name);
			return name;
		}*/
}

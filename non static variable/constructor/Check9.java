class Check9 
{
	int i=34;
	String s="janu";
	Check9()
	{
		this(1);//calling constructor
		//i=i;
		this.i=i;
		System.out.println("Zreo parrem:");
	}
		Check9(int i)
	{
			this(2,"m");//calling constructor
		this.i=i;
		this.s=s;
		System.out.println("i:"+i);
	}
	Check9(int i,String s)
	{
		System.out.println("i:"+i+" "+"s:"+s);
		//System.out.println("s:"+s);
	}
	public static void main(String[] args) 
	{
		System.out.println("out put Start");
		Check9 c=new Check9();
	}
}

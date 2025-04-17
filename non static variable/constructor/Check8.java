class Check8 
{
	int no;
	String name;
	Check8()
	{
		this(34);
		System.out.println("Zero parrem constructor:");
	}
	Check8(int no)
	{
		this(54,"sonu");
		this.no=no;
		this.name="monu";
		System.out.println("one parrem constructor:"+no);
	}
	Check8(int no,String name)
	{
		System.out.println("Two parrem constructor:"+no+" "+name);
	}
	public static void main(String[] args) 
	{
		System.out.println("out put Start");
		Check8 c=new Check8();
		//System.out.println("no:"+c.no);
	}
}

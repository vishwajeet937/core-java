class Check8 
{
	int no;
	String name;
	Check8()
	{
		//this(34);
		this(new int[]{2});
		System.out.println("Zero parrem constructor:");
	}
	Check8(int[] i)
	{
		this(54,"sonu");
		//this.no=no;
		this.name="monu";
		System.out.println("one parrem constructor:");
	}
	Check8(int no,String name)
	{
		System.out.println("Two parrem constructor:"+no+" "+name);
	}
	public static void main(String[] args) 
	{
		System.out.println("out put Start");
		Check8 c=new Check8();
		c.hashCode();
		c.toString();
		//System.out.println("no:"+c.no);
	}
}

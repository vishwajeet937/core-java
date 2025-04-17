class Thischeck 
{
	String s="gf";
	{
	System.out.println(this.s);	
	}
	public static void main(String[] args) 
	{
		ThisKeyWord t1=new ThisKeyWord();
		t1.s="fsd";
		System.out.println(t1.s);
        ThisKeyWord t2=new ThisKeyWord();
		t2.s="bvc";
		System.out.println(t2.s);
		//System.out.println("Hello World!");
	}
}

class Check22 
{
	static Check22 c9;//new point
    static int k=40;
	String s="bhanta";
	float f=34.4f;
	public static void m1(Check22 c)
	{
		int s3;
		int i=20; int j=30; String s="sonu";
        s3=(i+j);
		System.out.println("m1:"+i);
		System.out.println("m1:"+s);
		System.out.println("m1:"+c.k);
		System.out.println(s3);
		System.out.println(c9.f);
		//System.out.println(this.s); not use in static keyword in static method
	}
	{
		String s2;
		String s="janu";
		String s1="monu";
		s2=(s+s1);
		System.out.println(s2);
		System.out.println(s1);
		System.out.println(this.s);
	}
	Check22()
	{
		this(2,"egd",4.5f);
		int i;
		String n;
		String name="Sachin";
		String name1="oec";
		n=(name+"+"+name1);
		int no=101;
		int no1=201;
		i=(no+no1);
		System.out.println(name);
		System.out.println(name1);
		System.out.println(n);
		System.out.println(no);
		System.out.println(no1);
		System.out.println(i);
	}
	static
	{
		int add;
		//add=(i+j+k);//wrong place
		int i=34;
		int j=43;
		int k=35;
		add=(i+j+k);
		System.out.println(add);
	}
	static
	{
		String s;
		int k;
		String name="vishwajeet";
		String vill="mahadeopur";
		long mobNo=9570381226l;
		int i=923;
		int j=345;
		s=(name+" "+vill+" "+mobNo);
		k=(i+j);
		System.out.println(s);
		System.out.println(k);
		System.out.println(c9.k);
	}
	Check22(int i,String s,float f)
	{
		this(false);
		int k;
		int i1=34;
		int j=3345;
        k=(i1+j);
		System.out.println(k);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Check22 c=new Check22();
		//Check22.c=c;//new point
		c9=c;//new point
		c.m1(c);
	}
	Check22(boolean b)
	{
		 int[] name ={2,4,5,6,8,10,12,14};
		for(int i=0;i<name.length;i++)
		{
			if(name[i]%2==1)
			{
				System.out.println(name[i]);
			}
	
		}
		//int i=10;
		/*if(i==1)
		{
		System.out.println("odd number");
		}
		else if(i==0)
		{
			System.out.println("even number");
		}
		else
			{
				System.out.println("Zero number");
			}*/
	}
}

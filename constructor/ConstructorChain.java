class ConstructorChain 
{
	ConstructorChain()
	{
		this(2);
		//int i=23;
		System.out.println("chain 1:"+i);
	}
		ConstructorChain(int i)
	{
			this(54,54.7f);
		     //i=i;
		System.out.println("chain 2:"+i);
		int i=34;
		float f=45.0f;
	}
	ConstructorChain(int i,float f)
	{
		//int i=34;
		//float f=34.0f;
		System.out.println("chain 3:"+i+" "+f);
	}
	public static void main(String[] args) 
	{
		System.out.println("out put");
		ConstructorChain c=new ConstructorChain();
	}
}

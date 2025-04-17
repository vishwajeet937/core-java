class Check10
{
	int i=45;
	//double d;
	Check10(int i)
	{
		i=34;//local variable
		//this(90);
		this.i=i;
		System.out.println("i:"+i);
	}
	public static void main(String[] args) 
	{
		System.out.println("out put Start");
		Check10 c=new Check10(2);
	}
}

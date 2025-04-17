class SuperOfConstructorr
{
	SuperOfConstructorr(int i)
	{
		System.out.println("Super class of parrem Constructor");
	}
}
	class SubOfConstructor extends SuperOfConstructor
	{
      SubOfConstructor()
		{
		  super();
			System.out.println("Sub class of constructor");
		}
	  SubOfConstructor(float)
		{
			System.out.println("Sub class of parrem Constructor");
		}
	public static void main(String[] args) 
	{
		SubOfConstructor s=new SubOfConstructor();

	}
}

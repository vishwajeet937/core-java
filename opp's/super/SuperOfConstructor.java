class SuperOfConstructor
{
	SuperOfConstructor(SuperOfConstructor s)
	{
		System.out.println("Super class of parrem Constructor");
	}
}
	class SubOfConstructor extends SuperOfConstructor
	{
		SubOfConstructor s;
         SubOfConstructor()
		{SubOfConstructor s;
			 super(m1());
			 this.s=s;
			System.out.println("Sub of Zero parrem constructor");
		}
      SubOfConstructor(SubOfConstructor s)
		{
		  super(s);
			System.out.println("Sub class of constructor:");
		}
		public SubOfConstructor m1()
		{
			return this.s;
		}
	  SubOfConstructor(float f)
		{
		  super(s);
			System.out.println("Sub class of parrem Constructor");
		}
		{
		  this.s=this;
		}
	public static void main(String[] args) 
	{
		SubOfConstructor s=new SubOfConstructor();
		SubOfConstructor s1=new SubOfConstructor(s);
	}
}

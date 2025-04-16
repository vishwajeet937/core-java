package com.app.dataType;

 class Parents 
{
	public void add(Object obj)
	{
		System.out.println("hi");
		if(obj instanceof Child)//SuperClas of subClass or both are same
		{
			Child p=(Child)obj;//subClass of SuperClas 
			p.sub();
		}
	}
}
class Child extends Parents
   {
	public void sub()
	{
		
	}
//	public void add()
//	{
//		
//	}
   
	public static void main(String[] args) 
	{
		//Child c=new Child();
		//c.add(c);
		Parents p=new Parents();
		p.add(p);

	}

}

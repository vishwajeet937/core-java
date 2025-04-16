package com.app.oop;

interface  InterfacePrint
{
  public void print();
  
}
class Print1 implements InterfacePrint
{
	public void print()
	{
		System.out.println("Print");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Print1 p=new Print1();
        p.print();
	}

}

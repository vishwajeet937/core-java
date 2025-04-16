package com.app.oop;

public class Z 
{
	int a2=505;
	int b2=607;
	int c2=b2-a2;
    public static void add(int i,int j)
    {
    	int a=101;
    	int b=202;
    	int c=a+b;
    	System.out.println(c);
    }
}
class Y extends Z
{
	public int sub(int i,int j) 
	{
		int a2=303;
		int b2=404;
		int c2=b2-a2;
		System.out.println(c2);
		System.out.println(super.c2);
		return 11;
	}

	public static void main(String[] args)
	{
		Z.add(1, 2);
		Y y1=new Y();
		y1.sub(12,14);
	}

}

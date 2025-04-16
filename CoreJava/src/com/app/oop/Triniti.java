package com.app.oop;

public class Triniti 
{
	static 
	{
		System.out.println(".............Welcome to Triniti...............");
	}
	public static void caffeArea()
	{
		int noOfChair =51;
		boolean coffie=true;
		for(int i=11;i<=21;i++)
		{
			if(i%12==0)
			{
				System.out.println("no of Chair is:"+i);
			}
		}
	}
}
class Hostel extends Triniti
{ 
	int noOfRoom=101;
	public Hostel Room()
	{
		int noOfBed=303;
		System.out.println("no of Room is:"+noOfRoom);
		System.out.println("no of bed is:"+noOfBed);
		return new Hostel();
	}
	public static void main(String[] args)
	{
		Hostel h=new Hostel();
		h.Room();
		caffeArea();
	}
}

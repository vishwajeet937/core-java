package com.app.oop;

interface Vehiclee 
 {
    public void engine();
    public void breaks();
 }
  abstract class Bus implements Vehiclee
   {
	  public void breaks()
	  {
		  System.out.println("Bus has two Breaks");
	  }
   }
  abstract class Bus1 implements Vehiclee
  {
	  public void breaks()
	  {
		  System.out.println("Bus has two Breaks");
	  }
  }
  class RedBus extends Bus
   {
	  public void engine()
	  {
		  System.out.println("RedBus engine capacity is 40 Kmph");
	  }
   }
  class Volvo extends Bus
  {
	  public void engine()
	  {
		  System.out.println("Volvo engine capcity is 110 kmph");
	  }
  }
  class Driver
  {
	  public void assignVehicle(Vehiclee v)
	  {
		  v.engine();
		  v.breaks();
	  }
  
	public static void main(String[] args)
	{
		Driver d=new Driver();
		d.assignVehicle(new Volvo());
		
		Driver d1=new Driver();
		d1.assignVehicle(new RedBus());
	}

}

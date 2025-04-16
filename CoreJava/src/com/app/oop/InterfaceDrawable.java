package com.app.oop;

interface InterfaceDrawable 
{
  // void draw();
   default void draw()
   {}
}
class Rectange implements InterfaceDrawable
{
	public void draw()
	{
		System.out.println("rectangle");
	}
}
class Circle implements InterfaceDrawable
{
	public void draw()
	{
		System.out.println("circle");
	}
}

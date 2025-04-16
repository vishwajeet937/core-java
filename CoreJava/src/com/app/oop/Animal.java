package com.app.oop;

interface Animal 
{
    public void  animalSound();
    public void animalSleep();
}
interface Vehicle
 {
	public void speed();
 }
interface Mobile
 {
	public void sim();
 }
class Cow implements Animal
 {
	public void animalSound()
	{
		System.out.println("Animal Sound: waa waa");
	} 
	public void animalSleep()
	{
		System.out.println("Animal Sleep: Zzz");
	}
 }
class BuyCycle implements Vehicle
{
	public void speed()
	{
		System.out.println("speed is:"+112+"Km/hour");
	}
}
class JioSim implements Mobile
 {
	public void sim()
	{
		System.out.println("colling in jio sim");
	}
 
public static void main(String[] args)
 {
	Cow c=new Cow();
	c.animalSound();
	c.animalSleep();
	
	JioSim js=new JioSim();
	js.sim();
	
	BuyCycle bc=new BuyCycle();
	bc.speed();
 }
}
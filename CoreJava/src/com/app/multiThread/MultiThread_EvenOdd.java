package com.app.multiThread;

public class MultiThread_EvenOdd 
{
	
	public synchronized void printEven(int range)
	{
		for(int i=1;i<=range;i++)
		{
			if(i%2==0)
				System.out.println("Even No Print: "+i+"\nThreadName: "+Thread.currentThread().getName());
		}
		
	}
	
public synchronized void printOdd(int range) 
{
	for(int i=1;i<=range;i++)
	{
		if(i%2!=0)
			System.out.println("Odd No Print: "+i+"\nThreadName: "+Thread.currentThread().getName());
	}
}
	
public static void main(String[] args) 
{
	MultiThread_EvenOdd me=new MultiThread_EvenOdd();
	Thread th01=new Thread() 
	{//class Teast extends Thread{
		//public void run() {
		public void run()
		{
			me.printEven(5);
		}
	};
	Thread th02=new Thread()
	{
		public void run()
		{
			me.printOdd(5);
		}
	};
	th01.start();
	th02.start();
}
}

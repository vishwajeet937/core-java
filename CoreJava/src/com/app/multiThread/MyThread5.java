package com.app.multiThread;

public class MyThread5 extends Thread 
{
	public void run()
	 {
		System.out.println("Child Thread");
		System.out.println(Thread.currentThread().getName());
	 }


	public static void main(String[] args) 
	{
		MyThread5 mt=new MyThread5();
		Thread t=new Thread(mt);
		mt.start();
		System.out.println("main Thread");
		System.out.println(Thread.currentThread().getName());
	}

}

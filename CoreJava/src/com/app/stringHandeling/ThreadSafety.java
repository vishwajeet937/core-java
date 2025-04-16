package com.app.stringHandeling;

public class ThreadSafety {

	public synchronized void  test() {
		for(int i=0;i<10;i++) {
			System.out.println(i+"\t"+Thread.currentThread());
		}
	}
	public static void main(String[] args) {
		//1st thread
		ThreadSafety ts=new ThreadSafety();
		Runnable ranable=()->{
			ts.test();
		};
		//2nd thread
       Runnable ranable01=()->{
    	   ts.test();
		};
		Thread th=new Thread(ranable);
		Thread th01=new Thread(ranable);
		th.start();
		th01.start();
	}
	
	
}

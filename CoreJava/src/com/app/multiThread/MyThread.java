package com.app.multiThread;

 class MyThread extends Thread
{
	 @Override
    public void run()
    {
    	System.out.println("run execute");
    }

	public static void main(String[] args)
	{
		
		MyThread mt=new MyThread();
		mt.start();
		System.out.println("main execute");

	}

}

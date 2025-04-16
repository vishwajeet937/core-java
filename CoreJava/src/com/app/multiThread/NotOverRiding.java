package com.app.multiThread;

public class NotOverRiding extends Thread 
{

	public static void main(String[] args)
	{
		NotOverRiding nor=new NotOverRiding();
		nor.start();
	}

}


// no out-put
package com.app.multiThread;
import java.util.Scanner;
public class MyThread15 extends Thread
{
     public int run(int num) throws InterruptedException
     {
    	 for(int i=0;i<=num;i++)
    	 {
    		 Thread.sleep(1000);
    		 System.out.println(i);
    	 }
    	 return 11;
     }
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the number");
        int num=scan.nextInt();
        MyThread15 mt=new MyThread15();
        mt.run(6);
        
        for(int i=0;i<=11;i++)
        {
        	System.out.println("Main method");
        }
	}

}

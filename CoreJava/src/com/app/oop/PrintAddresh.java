package com.app.oop;

public class PrintAddresh 
{
     String fName="Sonu";
     String lName="kumar";
     long mobNo=9570381226l;
     String vill="Mahadeopur";
     public void m1()
      {
    	 System.out.println("fName:"+fName+"\n"+"lName:"+lName+"\n"+"mobNo:"+mobNo+"\n"+"vill:"+vill);
      }
     public void m2()
       {
    	 String fName="Monu";
         String lName="kumar";
         long mobNo=9117348133l;
         String vill="Mahadeopur"; 
         {
        	 System.out.println("..............Next Line..............");
        	 System.out.println("fName:"+fName+"\n"+"lName:"+lName+"\n"+"mobNo:"+mobNo+"\n"+"vill:"+vill);
        	 System.out.println("...........next Line..............");
        	 System.out.println("fName:"+this.fName+"\n"+"lName:"+this.lName+"\n"+"mobNo:"+this.mobNo+"\n"+"vill:"+this.vill);
         }
       }
     public static void main(String[] args)
      {
    	 PrintAddresh c=new PrintAddresh();
    	 c.m1();
    	 c.m2();
      }
}

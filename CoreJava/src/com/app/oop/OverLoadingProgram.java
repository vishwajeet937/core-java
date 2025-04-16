package com.app.oop;

public class OverLoadingProgram 
 {
     public void overLoad()
     {
    	 System.out.println("void");
     }
     public int overLoad(int i,int j)
     {
    	 System.out.println(i+j);
    	 return i;
     }
     public String overLoad(String s)
     {
    	 System.out.println("string");
    	 return "asd";
     }
     public OverLoadingProgram overLoad(OverLoadingProgram olp)
     {
    	 System.out.println("OverLoadingProgram");
    	 return olp;
     }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		OverLoadingProgram o=new OverLoadingProgram();
		o.overLoad();
		o.overLoad(12,13);
		o.overLoad("string");
		o.overLoad(o);
		
	}

}

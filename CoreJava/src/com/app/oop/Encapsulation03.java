package com.app.oop;

public class Encapsulation03
{
     private String name;
     private long number;
     private int rollNo;
     public void setName(String name)
     {
    	 this.name=name;
     }
     public String getName()
     {
    	 return name;
     }
     public void setNumber(long number)
     {
    	 this.number=number;
     }
     public long getNumber()
     {
    	 return number;
     }
     public void setRollNo(int rollNo)
     {
    	 this.rollNo=rollNo;
     }
     public int getRollNo()
     {
    	 return rollNo;
     }
	public static void main(String[] args) 
	{
		Encapsulation03 e3=new Encapsulation03();
		e3.setName("Sonu kumar");
		e3.setNumber(9570381226l);
		e3.setRollNo(164122);
		System.out.println(e3.getName()+"\n"+e3.getNumber()+"\n"+e3.getRollNo());

	}

}

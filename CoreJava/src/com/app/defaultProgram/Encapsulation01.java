package com.app.defaultProgram;

public class Encapsulation01
{

	public static void main(String[] args)
	{
		Encapsulation1 e=new Encapsulation1();
	   e.setInstuteName("NareshIt");
	   e.setStudentName("Vishwajeet Kumar");
	   e.setCourseDuration(6);
	   e.setcourseDuratinMonth("-Month");
	   e.setStudentMobNo(9570381226l);
	   System.out.println(e.getInstuteName()+"\n"+e.getStudentName()+
			   "\n"+e.getCourseDuration()+e.getCourseDuratinMonth()+"\n"+e.getStudentMobNo());
		

	}

}

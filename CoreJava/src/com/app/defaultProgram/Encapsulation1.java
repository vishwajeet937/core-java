package com.app.defaultProgram;

public class Encapsulation1
{
     private String instuteName;
     private String studentName;
     private int courseDuration;
     private String courseDuratinMonth;
     private long studentMobNo;
	
     public String getInstuteName()
     {
    	 return instuteName;
     }
     public void setInstuteName(String instuteName)
     {
    	 this.instuteName=instuteName;
     }
     public String getStudentName()
     {
    	 return studentName;
     }
     public void setStudentName(String studentName)
     {
    	 this.studentName=studentName;
     }
     public int getCourseDuration()
     {
    	 return courseDuration;
     }
     public void setCourseDuration(int courseDuration)
     {
    	this.courseDuration=courseDuration; 
     }
     public String getCourseDuratinMonth()
     {
    	 return courseDuratinMonth;
     }
     public void setcourseDuratinMonth(String courseDuratinMonth)
     {
    	 this.courseDuratinMonth=courseDuratinMonth;
     }
     public long getStudentMobNo()
     {
       return studentMobNo;	 
     }
     public void setStudentMobNo(long studentMobNo)
     {
    	 this.studentMobNo=studentMobNo;
     }
}

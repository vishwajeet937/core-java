package college;
import college.CollegeDetail;
import college.Cse;
import college.Entc;
public class MainMethod 
{
   public static void main(String[] args)
     {
	   System.out.println("............College...........");
	   CollegeDetail c=new CollegeDetail();
	   c.collegeDetails();
	   System.out.println("............Branch CSE...........");
	   Cse c1=new Cse();
	   c1.cse();
	   System.out.println("............Branch it...........");
	   It i=new It();
	   i.it();
	   System.out.println("............Branch ENTC...........");
	   Entc e=new Entc();
	   e.entc();
	 }
}
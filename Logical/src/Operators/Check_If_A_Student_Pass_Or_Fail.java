package Operators;
import java.util.Scanner;
public class Check_If_A_Student_Pass_Or_Fail 
{

	public static void main(String[] args) 
	{
		//int marks=67;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=scan.nextInt();
		String reportCard=(marks>=33)?"Pass":"Fail";
		System.out.println(reportCard);
	}

}

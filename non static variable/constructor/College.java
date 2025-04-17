import java.util.Scanner; 
class College 
{
	String universityName;
	String collageName;
	Student classStudent;
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number the student");
        int noOfStudent=scan.nextInt();
		for(int i=1;i<=noOfStudent;i++)
		{
			System.out.println("Enter name");
			String name=scan.nextLine();
			System.out.println("Enter rollNo");
			int rollNo=scan.nextInt();
			System.out.println("Enter sessaion");
			scan.nextLine();
			String sessaion =scan.nextLine();
			System.out.println("Enter branch");
			String branch=scan.nextLine();
			System.out.println("Enter redgNo");
			int redgNo=scan.nextInt();
			System.out.println("Enter totalMarks");
			int totalMarks=scan.nextInt();
			System.out.println("Enter statious");
			scan.nextLine();
			String statious=scan.nextLine();
			System.out.println("Enter phyMarks");
			int phyMarks=scan.nextInt();
			System.out.println("Enter cheMarks");
			int  cheMarks=scan.nextInt();
			System.out.println("Enter mathMarks");
			int mathMarks=scan.nextInt();
			Student s=new student();
			s.setName(name);
			s.setRollNo(rollNo);
			s.setSession(session);
			s.setBranch(branch);
			s.setRedgNo(redgNo);
			s.setTotalMarks(totalMarks);
			s.setStatious(statious);
			s.setPhyMarks(phymarks);
			s.setCheMarks(cheMarks);
			s.setMathMarks(mathMarks);
		}
	}
}

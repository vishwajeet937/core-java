class NareshItGoogleForm 
{
	String fName="Vishwajeet";
	String lName="kumar";
	String emailId="vishwajeetkumar937@gmail.com";
	long phoneNo=9570381226l;
	String modeOfTraning="online";
	String state="Bihar";
	String course="DS";
	String submit="Submit";
	public String fName()
	{
		System.out.println("fName:"+fName);
		return fName;
	}
	public String lName()
	{
		System.out.println("lName:"+lName);
		return lName;
	}
	public String emailId()
	{
		System.out.println("emailId:"+emailId);
		return emailId;
	}
	public long phoneNo()
	{
		System.out.println("phoneNo:"+phoneNo);
		return phoneNo;
	}
	public String modeOfTraning()
	{
		System.out.println("modeOfTraning:"+modeOfTraning);
		return modeOfTraning;
	}
	public String state()
	{
		System.out.println("State:"+state);
			return state;
	}
	public String course()
	{
		System.out.println("Course:"+course);
		return course;
	}
	public String submit()
	{
		System.out.println(submit);
			return submit;
	}
	public static void thankYou()
	{
		System.out.println(".............Thank You............");
	}
	public static void main(String[] args) 
	{
		System.out.println("..........Google Form.............");
		NareshItGoogleForm n1=new NareshItGoogleForm();
		n1.fName();
		n1.lName();
		n1.emailId();
		n1.phoneNo();
		n1.modeOfTraning();
		n1.state();
		n1.course();
		n1.submit();
		n1.thankYou();
	}
}

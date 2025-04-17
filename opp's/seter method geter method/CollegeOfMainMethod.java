import java.util.Arrays;
class CollegeOfMainMethod 
{
	public static void main(String[] args) 
	{
		College c=new College();
         c.setCollegeName("oec");
		 String val=c.getCollegeName();
		 System.out.println(val);
		 System.out.println(Arrays.toString(args));
	}
}

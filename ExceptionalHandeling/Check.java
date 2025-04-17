import java.io.File;
import java.io.FileWriter;
class Check 
{
	public void m1() throws Exception
	{
		File f=new File("filename.txt");
		FileWriter f1=new FileWriter(f);
		f1.write("fffdd");
		f1.close();
		//int[] arr=new int[12];
		//try
		//{
		//System.out.println(arr[12]);	
		//}
		//catch (Exception e)
		//{
			//
		//}	
	}
	public static void main(String[] args) //throws Exception 
	{
		Check c=new Check();
		try
		{
			c.m1();
		}
		catch (Exception e)
		{
			System.out.println("Exception rise");
		}
	}
}

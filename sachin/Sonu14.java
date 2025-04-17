import com.app.First;
import java.util.Arrays;
class Sonu14 
{
	public static void main(String[] args) 
	{
		Sonu14 emp=new Sonu14();
		String[] arr=new String[]{"sonu","monu"};
		emp.add(arr);
		emp.add1(2,3);
		int val=emp.add2(4,5);
	}
	Sonu14()
	{
		System.out.println("zero parrem");
	}
	Sonu14(int i)
	{
		System.out.println("one parrem");
	}
	Sonu14(int i,String s)//overloaded constructor
	{
		System.out.println("two parrem");
	}
		    public void add(String[] second)
	     {
	     	System.out.println(Arrays.toString(second));
	     }
	            public static void add1(int first,int second)
	        {
	            System.out.println(first+second);
	        }
		           public static int add2(int val,int val1)
	             {
					System.out.println(val+val1);
					return val+val1;
	             }
} 

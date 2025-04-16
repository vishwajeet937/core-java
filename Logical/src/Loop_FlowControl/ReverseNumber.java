package Loop_FlowControl;

public class ReverseNumber
{
	public static void main(String[] args)
	{
		 int num=10061998;
		 while(num>0)
		 {
			 int lastDegit=num%10;
			 System.out.println("Reverse Number is:"+lastDegit);
			 num=num/10;
		 }
	}
}

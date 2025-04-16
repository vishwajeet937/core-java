import java.util.Scanner;

public class Test3 
{
	public static void main(String[] args)
	{
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter the number");
   int a=scan.nextInt();
   for(int i=0;i<=a;i++)
   {
	   for(int j=i;j<1;j--)
	   {
	   System.out.print(j);
       }
	   System.out.println(i);
   }
 }
}

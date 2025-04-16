package Variables$Data;
import java.util.Scanner;
public class Assessment3
{
   public static void main(String args[])
   {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the pencile price");
	   float pencile=scan.nextFloat();
	   System.out.println("Enter the pen price");
	   float pen=scan.nextFloat();
	   System.out.println("Enter the eraser price");
	   float eraser=scan.nextFloat();
	   float totalCost=pencile+pen+eraser;
	   System.out.println("Bill is:"+totalCost);
	   
	   //Add on - with 18% tax
	   float newTotal=totalCost+(0.18f*totalCost);
	   System.out.println("Bill with 18% Tax:"+newTotal);
   }
}

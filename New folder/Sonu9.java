import java.util.Scanner;
class Sonu9 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		java.io.File file=new java.io.File("hellog");
		try{
		file.createNewFile();
		System.out.println(file.isDirectory());
		}catch(Exception e){
		}
}
}

package in.sp.test;
import java.sql.DriverManager;
public class InsertDemo
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql:localhost:3306jdbc_db","root","root");
		System.out.println("Sucees");
	}
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Check1
{
	static String q=" select * from student"; 
public static void main(String[] args)
{
	try
	{
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		PreparedStatement p=c.prepareStatement(q);
		ResultSet rs=p.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));

			
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
}


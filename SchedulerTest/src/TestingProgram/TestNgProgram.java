package TestingProgram;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNgProgram 
{
	
	@Parameters({"url"})
	@Test
   public static void isSchedulerServletWorking(@Optional("s")String urlLiteral)
   {
		//boolean rev="";
		//String urlLiteral="https://testtri2.triniti.com/scheduler/SchedulerServlet?IsItWorking";
		boolean res;
		try 
		{
			res = JavaProgram.isSchedulerServletWorking(urlLiteral);
			assertEquals(true,res);
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
   }
	
}

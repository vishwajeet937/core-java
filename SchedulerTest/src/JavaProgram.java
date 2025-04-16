import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;

public class JavaProgram
{ 
	//logic will return boolean value
    public static boolean isSchedulerServletWorking( String urlLiteral) throws IOException, ClassNotFoundException, SQLException
    {
        boolean isSchedulerServletWorking=false;
        System.out.println("urlLiteral: "+urlLiteral);
        String res = "";
        //new URL("https://testtri2.triniti.com/scheduler/SchedulerServlet?IsItWorking");
       // String urlLiteral="https://testtri2.triniti.com/scheduler/SchedulerServlet?IsItWorking";
        URL url = new URL(urlLiteral);
        URLConnection conn;
        conn = url.openConnection();
        conn.setDoOutput(true);
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        String message=null;
        while ((line = rd.readLine()) != null)
        {
            System.out.println("Res --- "+res);
            System.out.println("line --- "+line);
            res = res + "\n" + line;
        }
        
        System.out.println(" line ::: "+line);
        System.out.println("res ::: "+res);
        if(res !=null && !res.isEmpty() && res.contains("Scheduler Application is working fine!")) 
        {
            message="Scheduler Application is working fine!";
            isSchedulerServletWorking = true;
        }
        else
        {
            message="Scheduler Application is not working !";
            isSchedulerServletWorking = false;
        }
        System.out.println(" Done === "+message);
        rd.close();
        return isSchedulerServletWorking;
    }
 }

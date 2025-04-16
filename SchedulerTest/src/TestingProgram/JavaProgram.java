package TestingProgram;
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
    package com.nt.sarvlet;
    import java.io.IOException;
    import java.io.PrintWriter;

    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    public class MarrageServlet extends HttpServlet
     {
        public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    	 {
    	     PrintWriter pw=null;
             String name=null,gender=null;
             int age=0;

    		 pw=res.getWriter();

    		 res.setContentType("Text/Html");
             name=req.getParameter("pname");
    		 age=Integer.parseInt(req.getParameter("page"));
    		 gender=req.getParameter("gender");
    		 if(gender.equalsIgnoreCase("M"))
    		  {
    		    if(age>=21)
    			 {
    			 pw.println("<h1 style='colour:green;text-align:center'>Mr."+name+"u r egiable for Marrage</h1>");
    			 }
    			 else
    			  {
    			    pw.println("<h1 style='colour:red;text-align:center'>Mr."+name+"u r notegiable for Marrage</h1>");
    			  } 
    		  }
    			  else if(gender.equalsIgnoreCase("F"))
    			   {
    			     if(age>=18)
    				   {
    				     pw.println("<h1 style='colour:green;text-align:center'>Miss."+name+"u r egiable for Marrage</h1>");
    				   }
    				   else
    				     {
                           pw.println("<h1 style='colour:red;text-align:center'>unknown Gender</h1>");
    					 }
    					 pw.println("<br><a herf='http://localhost:2030/MarriageApp/inputHtml><img src='home.jpg'width='50'hight='50'/></a>");
    					 pw.close();
    			   }
    		  }    	 
     }
 
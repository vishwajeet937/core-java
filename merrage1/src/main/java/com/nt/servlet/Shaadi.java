package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Shaadi extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		System.out.println("Shaadi.doGet()");
		System.out.println(Thread.currentThread().getName());
          
		 PrintWriter pw=null;
         String name=null,gender=null;
         int age=0;

		 pw=resp.getWriter();
                                                                              
		 resp.setContentType("Text/Html");
         name=req.getParameter("pname");
		 age=Integer.parseInt(req.getParameter("page"));
		 gender=req.getParameter("gender");
		  if(gender.equalsIgnoreCase("Male"))
		  {
		    if(age>=21)
			 {
			 pw.println("<h1 style='colour:green;text-align:center'>Mr."+name+"u r egiable for Marrage</h1>");
			 }
			 else
			  {
			    pw.println("<h1 style='colour:red;text-align:center'>Mr."+name+"u r not-egiable for Marrage</h1>");
			  } 
		    pw.println("<br><a href='http://localhost:2021/merrage1/index.html'>gotohomepage</a>");
		    pw.close();
		   }
			  else if(gender.equalsIgnoreCase("Female"))
			   {
			     if(age>=18)
				   {
				     pw.println("<h1 style='colour:green;text-align:center'>Miss."+name+"u r eligible for Marrage</h1>");
				    
				   }
				   else
				     {
                       pw.println("<h1 style='colour:red;text-align:center'>not-eligible Gender</h1>");
					 }
					 pw.println("<br><a href='http://localhost:2021/merrage1/index.html'>gotohomepage</a>");
					 pw.close();
			   }
			  else
			  {
				  pw.println("<h1 style='colour:green;text-align:center'>Miss."+name+"you are not eligible for Marrage</h1>");
				  pw.println("<br><a href='http://localhost:2021/merrage1/index.html'>gotohomepage</a>");
				  pw.close();
			  }
		  }	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
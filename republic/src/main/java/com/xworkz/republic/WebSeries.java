package com.xworkz.republic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=2,urlPatterns="web")
public class WebSeries extends HttpServlet{
	
	public WebSeries() {
		System.out.println("creating webseries");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in WebSeries");
		String name=req.getParameter("name");
		String language=req.getParameter("language");
		
		System.out.println(name);
		System.out.println(language);
		
		
         PrintWriter writer=resp.getWriter();
          
         System.out.println("sending "+name+"successfully");
         resp.setContentType("text/plain");
		
	}
	
}

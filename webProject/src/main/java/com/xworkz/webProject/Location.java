package com.xworkz.webProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=2,urlPatterns="/loc")
public class Location extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init in Location");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in Location ");
		String name=req.getParameter("locationName");
		String email=req.getParameter("email");
		String startPoint=req.getParameter("startPoint");
		String destinationPoint=req.getParameter("destinationPoint");
		String gender=req.getParameter("gender");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(startPoint);
		System.out.println(destinationPoint);
		System.out.println(gender);
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		
		if(name.length()>3) {
		writer.print("<span style='color:green;'>");
		writer.print("succefull login with  "+name);
		
		
		
		}
		
		else {
		writer.print("<span style='color:red;'>");
		writer.print("failure sendback ");
		
			
		}
		writer.print("<pre>");
		writer.print("<a href='index.html'>home</a>");
		writer.print("</pre>");
		writer.print("<pre>");
		writer.print("<a href='location.html'>Location</a>");
		writer.print("</pre>");
		writer.print("</h1>");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		
		resp.setContentType("text/html");
		
			}

}

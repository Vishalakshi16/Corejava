package com.xworkz.servletMethods;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns="/built")
public class BuildingServlet extends HttpServlet{
	
	
	public BuildingServlet() {
	System.out.println("creating"+this.getClass().getSimpleName());
	}
	@Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		System.out.println("date display as doGet");
		String data="date display as doGet ......";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("date display as doGet");
		String data="date display as doPost......";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");

	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("date display as doPut");
		String data="date display as doPut......";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");

	}
	
	

	private void doDestoy() {
		System.out.println("date display as doDestoy");
		
		

	}
	
	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("date display as doTrace");
		String data="date display as doTrace......";
		PrintWriter writer=arg1.getWriter();
		writer.print(data);
		arg1.setContentType("text/plain");
	}
	
	@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("date display as doOptions");
		String data="date display as doOptions......";
		PrintWriter writer=arg1.getWriter();
		writer.print(data);
		arg1.setContentType("text/plain");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("display date in init");
	}

}

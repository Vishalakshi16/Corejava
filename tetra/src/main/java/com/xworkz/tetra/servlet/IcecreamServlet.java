package com.xworkz.tetra.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=4,urlPatterns="/carnetto")
public class IcecreamServlet extends HttpServlet{
	public IcecreamServlet() {
		System.out.println("creating"+this.getClass().getSimpleName());
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		System.out.println("running doGet in IcecreamServlet");
	}


}

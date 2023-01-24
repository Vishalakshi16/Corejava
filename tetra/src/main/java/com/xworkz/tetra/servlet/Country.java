package com.xworkz.tetra.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=3,urlPatterns="/india")
public class Country extends HttpServlet{
	public Country() {
		System.out.println("creating country....");
	}
	
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws ServletException,IOException{
		System.out.println("running doGet in Country....");
	}

}

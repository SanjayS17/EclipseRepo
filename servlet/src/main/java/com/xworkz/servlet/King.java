package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns = "/type")
public class King extends HttpServlet {

	public King() {
    System.out.println("create:"+getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get method is running");
		String name=req.getParameter("name");
		String region=req.getParameter("region");
		String noofqueens=req.getParameter("noofqueens");
		String dateofbirth=req.getParameter("dateofbirth");
		String dateofdeath=req.getParameter("dateofdeath");
		
		System.out.println(name);
		System.out.println(region);
		System.out.println(noofqueens);
		System.out.println(dateofbirth);
		System.out.println(dateofdeath);
		
		 PrintWriter writer=resp.getWriter();
		 writer.print("webseries name"+name+"is sent succes");
		 writer.print("/span>");
		 writer.print("/h1");
		 writer.print("/body");
		 writer.print("/html");
		 resp.setContentType("text/html");
		 
	
	}
	@Override
	public void destroy() {
		System.err.println(" running destroy in king ");
	}

}

 package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns ="/text")
public class WebSeries extends HttpServlet{
	
	public WebSeries() {
		System.out.println("create:"+ getClass().getSimpleName());
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("get method is runniong ");
	String name=req.getParameter("webseries name");
	String lang=req.getParameter("web series language");
	String episodes=req.getParameter("no of episodes");
	String ott=req.getParameter("ott");
	String budget=req.getParameter("budget");
	
	System.out.println(name);
	System.out.println(lang);
	System.out.println(episodes);
	System.out.println(ott);
	System.out.println(budget);

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
		System.out.println("running destroy in web series....");
	}
}

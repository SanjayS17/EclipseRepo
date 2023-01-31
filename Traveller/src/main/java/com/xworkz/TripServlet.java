package com.xworkz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(loadOnStartup = 1,urlPatterns = "/party")
public class TripServlet extends HttpServlet {
	
	public TripServlet() {
		System.out.println("Creat:"+getClass().getSimpleName());
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running shashi");
	String data="pg";
	PrintWriter write=resp.getWriter();
	write.print(data);
	resp.setContentType("text/plain");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running shashi2");
	String data="pg1";
	PrintWriter write=resp.getWriter();
	write.print(data);
	resp.setContentType("text/plain");
		
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running shashi3");
		String data="natraj";
		PrintWriter Write=resp.getWriter();
		Write.print(data);
		resp.setContentType("text/plain");
		
		
	}
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running shashi4");
	String data="arun";
	PrintWriter write=resp.getWriter();
	write.print(data);
	resp.setContentType("text/plain");
	
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running shashi5");
	String data="gani";
	PrintWriter write=resp.getWriter();
	write.print(data);
	resp.setContentType("text/plain");
	
	}
	
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running shashi6");
	String data="shashi";
	PrintWriter write=resp.getWriter();
	write.print(data);
	resp.setContentType("text/plain");
	
	
	}
	
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("running shashi7");
    String data="sharath";
    PrintWriter write=resp.getWriter();
    write.print(data);
    resp.setContentType("text/plain");
    

	}

}

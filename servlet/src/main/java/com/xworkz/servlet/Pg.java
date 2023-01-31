package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/style")
public class Pg  extends HttpServlet{
	public Pg() {
   System.out.println("create:"+getClass().getSimpleName());

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("get method is running ");
    
    String name=req.getParameter("pgname");
    String color=req.getParameter("pgcolor");
    String pgownername=req.getParameter("pgownername");
    String noofgirlspg=req.getParameter("noofgirlspg");
    String noofboyspg=req.getParameter("noofboyspg");
    String location=req.getParameter("location");
    String noofboysinpg=req.getParameter("noofboysinpg");
    String noofgirlsinpg=req.getParameter("noofgirlsinpg");
    String pgownername1=req.getParameter("pgownername1");
    String pgownerage=req.getParameter("pgownerage");
    String pgownerheight=req.getParameter("pgownerheight");
    String pgownerweight=req.getParameter("pgownerweight");
    String wifi=req.getParameter("wifi");
    String hotwater=req.getParameter("hotwater");
    String cleanness=req.getParameter("cleanness");
    String washingmachine=req.getParameter("washingmachine");
    String pgownercarcolor=req.getParameter("pgownercarcolor");
    String pgownerphoneno=req.getParameter("pgownerphoneno");
    String pgownerbikename=req.getParameter("pgownerbikename");
    
    System.out.println("pgname");
    System.out.println("pgcolor");
    System.out.println("pgownername");
    System.out.println("noofgirlspg");
    System.out.println("noofboyspg");
    System.out.println("location");
    System.out.println("noofboysinpg");
    System.out.println("nooggirlsinpg");
    System.out.println("pgownername1");
    System.out.println("pgownerage");
    System.out.println("pgownerheight");
    System.out.println("pgownerweight");
    System.out.println("wifi");
    System.out.println("hotwater");
    System.out.println("cleanness");
    System.out.println("washingmachine");
    System.out.println("pgownercarcolor");
    System.out.println("pgownerphoneno");
    System.out.println("pgownerbikename");
    
	
	 PrintWriter writer=resp.getWriter();
	 writer.print("pgname"+name+"is sent succes");
	 writer.print("/span>");
	 writer.print("/h1");
	 writer.print("/body");
	 writer.print("/html");
	 resp.setContentType("text/html");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method is running in pg.....");
	}


}

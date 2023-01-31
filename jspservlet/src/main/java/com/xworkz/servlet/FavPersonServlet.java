package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/crazy")
public class FavPersonServlet extends HttpServlet {
	
	public FavPersonServlet() {
    System.out.println("create...."+ this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running do post in servlet");
	
	String fname=req.getParameter("fname");
	String lname=req.getParameter("lname");
	String reason=req.getParameter("reason");
	String gender=req.getParameter("gender");
	String address=req.getParameter("address");
	
	System.out.println("fname"+ fname);
	System.out.println("lname"+ lname);
	System.out.println("reason"+ reason);
	System.out.println("gender"+ gender);
	System.out.println("address"+ address);
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("show.jsp");
	req.setAttribute("fname", fname);
	req.setAttribute("lname", lname);
	req.setAttribute("reason", reason);
	req.setAttribute("address",address);
	req.setAttribute("gender", gender);
	
	dispatcher.forward(req, resp);
	
	
	}

}

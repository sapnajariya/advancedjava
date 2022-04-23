package com.rays.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCtl extends HttpServlet{
	public void doGet(HttpServletRequest rq,HttpServletResponse rs)throws IOException{
		rs.setContentType("text/html");
		PrintWriter pw=rs.getWriter();
		String e=rq.getParameter("email");
		String pass=rq.getParameter("pwd");
		if(e.equals("Admin@gmail.com")&& pass.equals("pass123"))
		{
			pw.print("<h1>Succesfully Login");
		}
		else{
			pw.print("Invalid User");
		}
	}

}

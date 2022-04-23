package com.rays.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServDemo extends HttpServlet{
	public void doGet(HttpServletRequest rq,HttpServletResponse rs)throws IOException{
		rs.setContentType("text/html");
		PrintWriter pw=rs.getWriter();
		pw.println("<h1>Hello i am sapna</h1>");
	}

}

package com.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.bean.UserBean;
import com.rays.models.UserModel;

public class UserCtl extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String e=request.getParameter("email");
		String pas=request.getParameter("pwd");
		UserBean b=new UserBean();
		b.setEmialId(e);
		b.setPas(pas);
		UserModel um=new UserModel();
		String name=null;
		try{
			name=um.authenticate(b);
		
		/*
		if(e.equals("sapna@gmail.com")&&pas.equals("admin"))
		{
			pw.println("<h1>Welcome Admin"+" "+name+"</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			request.setAttribute("Name", name);
			rd.forward(request, response);
			
		}*/
			if(name!=null)
			{
				pw.println("<h1>Welcome to Login servlet<h1>");
				RequestDispatcher rd= request.getRequestDispatcher("welcome.jsp");
				request.setAttribute("Name", name);
				rd.include(request, response);
				//rd.forward(request, response);
			}
		else
		{
			//pw.println("<h1>Invalid User</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			request.setAttribute("error", "invalid user");
			rd.forward(request, response);
			
		}
		}
		catch(ClassNotFoundException|SQLException e1)
		{
			e1.printStackTrace();
		}
	}

}

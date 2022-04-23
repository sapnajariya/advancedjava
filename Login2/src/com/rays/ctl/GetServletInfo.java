package com.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetServletInfo
 */
@WebServlet("/GetServletInfo")
public class GetServletInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetServletInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<h1>");
	out.println("Request Method:"+request.getMethod());
	out.println("Address"+request.getRemoteAddr());
	out.println("URL"+request.getRequestURI());
	out.println("ServletPath"+request.getServletPath());
	out.println("Servlet name"+request.getServerName());
	out.println("ServerPort"+request.getServerPort());
	out.println("contenttype"+request.getContentType());
	out.println("ServerPort"+request.getContentLength());
	out.println("Cookies"+request.getCookies());
	
	out.println("<h1>");
	Enumeration e=request.getHeaderNames();
	while(e.hasMoreElements())
	{
		String key=(String)e.nextElement();
		String value=request.getHeader(key);
		out.println(key+" "+value);
		
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

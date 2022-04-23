<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


</head>
<body>
<%String msg=(String)request.getAttribute("error");
if(msg!=null)
{
	out.println("<h1>Error:" +msg+"</h1>");
}
%>
<center><h1><b>Welcome To Admin Login </b></h1></h1></center>
<br>

  
  <center> <form action="userlogin" method="get" >
  <label for="email">Emailid:</label><br>
  <input type="text"  name="email" required=""><br>
  <label for="pswd">Password:</label><br>
  <input type="Password"  name="pwd" required=""><br><br>
  <input type="submit" value="Submit">
</form></center>
  
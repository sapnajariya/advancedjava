package com.rays.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.rays.bean.UserBean;

public class UserModel {
public Connection getConnection()throws ClassNotFoundException,SQLException{
	//ResourceBundle rb=ResourceBundle.getBundle("com.rays.resurce.dbconf");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancedjava","root","");
	//Class.forName(rb.getString("driver"));
	//Connection con=DriverManager.getConnection(rb.getString("url"),rb.getString("user"),rb.getString("password"));
return con;

}
public String authenticate(UserBean bean)throws ClassNotFoundException,SQLException{
	Connection con=getConnection();
	PreparedStatement ps=con.prepareStatement("select fname from user where email=?and pass=?");
	ps.setString(1, bean.getEmialId());
	ps.setString(2,bean.getPas());
	ResultSet rs=ps.executeQuery();
	String name=null;
	
	if(rs.next())
	{
		name=rs.getString(1);
		
	}
	
	return name;
}


	


}




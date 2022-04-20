package Practicejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepDemo {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancedjava","root","");
String qry="select*from marksheet";
PreparedStatement pst=con.prepareStatement(qry);
ResultSet r=pst.executeQuery();
System.out.print("roll_no"+" "+"name"+" "+"phy"+" "+"chem"+" "+"maths");
while(r.next())
{
	int roll=r.getInt("roll_no");
	String name=r.getString("name");
	int p=r.getInt("phy");
	int c=r.getInt("chem");
	int m=r.getInt("maths");
	 System.out.println(roll+" " + name+" "+p+" "+c+ " "+m);
	}
con.close();
pst.close();
	}
}

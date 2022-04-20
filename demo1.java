package Practicejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class demo1 {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancedjava","root","");
		 String query
         = "Select * from marksheet where roll_no> ? and name = ?";

     // Prepare Statement
     PreparedStatement myStmt
         = con.prepareStatement(query);

     // Set Parameters
     myStmt.setInt(1, 5);
     myStmt.setString(2, "titu");

     // Execute SQL query
     ResultSet rs = myStmt.executeQuery();

     System.out.println("roll_no" +" "    + "Name");

     // Display function to show the Resultset
     while (rs.next()) {
    	 int age = rs.getInt("roll_no");
         String Name = rs.getString("name");
        
         System.out.println(age + "     " + Name);
     }

     // Close the connection
     con.close();
 }
}

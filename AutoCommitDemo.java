package Practicejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AutoCommitDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		//load the driver
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancedjava","root","");
		Statement st=con.createStatement();
		try{
			con.setAutoCommit(false);
		
		String qry1="insert into marksheet values(9,'pihu',56,89,70)";
		String qry2="update marksheet set name='hari' where roll_no=2";
		String qry3="insert into marksheet values(10,'priyanka',96,89,40)";
		st.executeUpdate(qry1);
		st.executeUpdate(qry2);
		st.executeUpdate(qry3);
		con.commit();
		System.out.println("Transaction successfully done");
		
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			con.rollback();
			System.out.println("Rolled Back");
			st.close();
			con.close();
		}

	}

}

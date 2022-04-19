package Practicejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionDemo {

	public static void main(String[] args)throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancedjava","root","");
		PreparedStatement ps=con.prepareStatement("insert into marksheet values(?,?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your roll num");
		int roll_no=sc.nextInt();
	
		System.out.println("enter your name");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("enter your  phsics score");
		int phy=sc.nextInt();
		sc.nextLine();
		System.out.println("enter your chemistry score");
		int chem=sc.nextInt();
		sc.nextLine();
		System.out.println("enter your maths score");
		int maths=sc.nextInt();
		sc.nextLine();
		ps.executeUpdate("roll_no");
		ps.executeUpdate("name");
		ps.executeUpdate("phy");
		ps.executeUpdate("chem");
		ps.executeUpdate("maths");
		System.out.println("data saved ");
		ps.close();
		con.close();

	}
}

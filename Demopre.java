package Practicejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demopre {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancedjava","root","");
		PreparedStatement ps=con.prepareStatement("insert into marksheet values(?,?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your roll num");
		int roll=sc.nextInt();

		System.out.println("enter your name");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("enter your  phsics score");
		int p=sc.nextInt();
		sc.nextLine();
		System.out.println("enter your chemistry score");
		int c=sc.nextInt();
		sc.nextLine();
		System.out.println("enter your maths score");
		int m=sc.nextInt();
		sc.nextLine();
		ps.setInt(1, roll);
		ps.setString(2, "name");
		ps.setInt(3, p);
		ps.setInt(4, c);
		ps.setInt(5, m);
		ps.executeUpdate();
		//ps.executeUpdate();
		//int j=ps.executeUpdate();
		System.out.println("data saved ");
		ps.close();
		con.close();
		

	}
	}
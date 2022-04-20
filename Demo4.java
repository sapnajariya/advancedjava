package Practicejdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo4 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException,Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancedjava","root","");
PreparedStatement ps=con.prepareStatement("insert into marksheet values(?,?,?,?,?)");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
do{
System.out.println("enter id");
int roll_no=Integer.parseInt(br.readLine());
System.out.println("enter name");
String name=br.readLine();
System.out.println("enter phy");
int phy=Integer.parseInt(br.readLine());
System.out.println("enter chem");
int chem=Integer.parseInt(br.readLine());
System.out.println("enter maths");
int maths=Integer.parseInt(br.readLine());
ps.setInt(1, roll_no);
ps.setString(2, "name");
ps.setInt(3, phy);
ps.setInt(4, chem);
ps.setInt(5, maths);
int i1=ps.executeUpdate();
System.out.println("record inserted");
System.out.println("do you want to continue:yes/no");
String s=br.readLine();
if(s.startsWith("no"))
{
	break;
}
}
while(true);
con.close();


	
	}

}


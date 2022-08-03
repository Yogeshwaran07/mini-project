package Myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User{  
	
	public Connection getconn()
	{
	Connection con = null;
	try
	{
	String url= "jdbc:mysql://localhost:3306/prodapt";
	String username="root";
	String pass="root";
	con = DriverManager.getConnection(url,username,pass);
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	return con;
	}
		public void displayAcdetail() throws SQLException
		{
			Connection con=getconn();
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select * from Ac");  
			while(rs.next())  
				System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));  
		}
		public void  displaySleeperdetails() throws SQLException
		{
			Connection con=getconn();
			
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select * from Sleeper");  
			while(rs.next())  
				System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
		}
		public void displayUnreserveddetails() throws SQLException
		{
        Connection con=getconn();
			
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select * from Unreserved");  
			while(rs.next())  
				System.out.println(rs.getString(1)+"  "+rs.getInt(2));
		}
		public void displayluggagedetails() throws SQLException
		{
			 Connection con=getconn();
				
				Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery("select * from luggage");  
				while(rs.next())  
					System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getInt(3)); 
		}
		

	

}

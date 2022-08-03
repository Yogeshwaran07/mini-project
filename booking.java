package Myproject;
import java.util.Scanner;
import java.sql.*;

public class booking{
	public Connection getconn1()
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
	Scanner sc1 = new Scanner(System.in);



	public void Ac_Booking() throws SQLException {
			System.out.println("----Please Enter Booking  details----");
			 Connection con = getconn1();
			 String s1 = "insert into Ac values(?,?,?,?,?,?,?,?)";
			 PreparedStatement stmt = con.prepareStatement(s1);

			             System.out.println("Enter  Name:");
			             String name=sc1.next();
			             System.out.println("Enter user age:");
			             int age =sc1.nextInt();
			             System.out.println("Enter  Gender");
			             String Gender = sc1.next();
			             System.out.println("Enter BookingDate: in yyyy-mm-dd");
			             String bookingdatetime=sc1.next();
			             System.out.println("Enter TrainNo: ");
			             int train_num=sc1.nextInt();
			             System.out.println("Enter Type: ");
			             String type=sc1.next();
			             System.out.println("Enter Aadhar: ");
			             String Aadhar=sc1.next();
			             System.out.println("Enter user_id: ");
			             String user_id=sc1.next();
			             
			       stmt.setString(1,name);
			       stmt.setInt(2,age);
			       stmt.setString(3,Gender);
			       stmt.setString(4,bookingdatetime);
			       stmt.setInt(5,train_num);
			       stmt.setString(6,type);
			       stmt.setString(7,Aadhar);
			       stmt.setString(8,user_id);
			       int a = stmt.executeUpdate();
			       System.out.println("---Success Fully Entered---");
			       
		
	}

	public void Sleeper_Booking() throws SQLException {
		System.out.println("---Please enter Sleeper details---");
		 Connection con = getconn1();
		 String s1 = "insert into Sleeper(name,age,Gender,bookingdatetime,train_num,type,Aadhar,user_id) values(?,?,?,?,?,?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);

		  System.out.println("Enter  Name:");
          String name=sc1.next();
          System.out.println("Enter user age:");
          int age =sc1.nextInt();
          System.out.println("Enter  Gender");
          String Gender = sc1.next();
          System.out.println("Enter BookingTime: ");
          String bookingdatetime=sc1.next();
          System.out.println("Enter TrainNo: ");
          int train_num=sc1.nextInt();
          System.out.println("Enter Type: ");
          String type=sc1.next();
          System.out.println("Enter Aadhar: ");
          String Aadhar=sc1.next();
          System.out.println("Enter user_id: ");
          String user_id=sc1.next();
          
    stmt.setString(1,name);
    stmt.setInt(2,age);
    stmt.setString(3,Gender);
    stmt.setString(4,bookingdatetime);
    stmt.setInt(5,train_num);
    stmt.setString(6,type);
    stmt.setString(7,Aadhar);
    stmt.setString(8,user_id);
    int a = stmt.executeUpdate();
    System.out.println("---Success Fully Entered---");
    

	
	}

	public void Unreserved() throws SQLException {
			System.out.println("---Please enter Unreserved details---");
			 Connection con = getconn1();
			 String s1 = "insert into Unreserved (destination,cost) values(?,?)";
			 PreparedStatement stmt = con.prepareStatement(s1);

			             System.out.println("Enter Destination:");
			            String Destination =sc1.next();
			            System.out.println("Enter Cost:");
			            int cost =sc1.nextInt();
			        
			            
			       stmt.setString(1,Destination);
			       stmt.setInt(2,cost);
			       int a = stmt.executeUpdate();
			       System.out.println("---success Fully Entered---");
			
		}
	public void Luggage_Booking() throws SQLException{
		System.out.println("---Enter Luggage details---");
		 Connection con = getconn1();
		 String s1="insert into luggage(name,luggagetype,weight,train_num) values(?,?,?,?)";
		 PreparedStatement stmt=con.prepareStatement(s1);
		 
		 System.out.println("enter the Name:");
		 String name=sc1.next();
		 System.out.println("enter the Luggagetype:");
		 String luggagetype=sc1.next();
		 System.out.println("enter the Weight:");
		 int weight=sc1.nextInt();
		 System.out.println("enter the Train Number:");
		 int train_num=sc1.nextInt();
		 
		 stmt.setString(1, name);
		 stmt.setString(2, luggagetype);
		 stmt.setInt(3,weight);
		 stmt.setInt(4,train_num);
		 int a = stmt.executeUpdate();
		 System.out.println("---Succes Fully Entered---");
	}
		
	}




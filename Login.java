package Myproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) throws SQLException{
		
		String s="y";
		String p="y";
		outer:while (p.equals("y")) {
		Scanner sc=new Scanner(System.in);
		booking b=new booking();
		User d1=new User();
		System.out.println("Enter your login deatils user login or Admin login");
		String Role=sc.next();
		if(Role.equals("Admin"))
		{
			System.out.println(" Enter Admin login:");
			
			Connection con=b.getconn1();
			PreparedStatement st=con.prepareStatement("Select * from Login");
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				String loginuser=rs.getString("login_id");
				String Loginpass=rs.getString("pass");
				System.out.println("please enter user name");
				String username=sc.next();
				System.out.println("please enter Password");
				String password=sc.next();
				if(loginuser.equals(username)&&Loginpass.equals(password) )
				{
					System.out.println("welcome into Admin login");
					
					while (s.equals("y")) {
						System.out.println("SERVICES PROVIDED BY US");
						System.out.println("press 1 to choose Ac_Booking");
						System.out.println("press 2 to choose Sleeper_Booking");
						System.out.println("press 3 to choose Unreserved ");
						System.out.println("press 4 to choose Luggage");

						
						int i = sc.nextInt();

						booking bb = new booking();

						switch (i) {
						case 1: 
							bb.Ac_Booking();
						    break;
						case 2:
							bb.Sleeper_Booking();
						    break;
						case 3: 
							bb.Unreserved();
						    break;
						case 4:
							bb.Luggage_Booking();
							break;
						case 5:
							System.exit(0);
						default : 
							System.out.println("Wrong Choice");	
						    break;
						    
					}
					
					}
				
				}
				else
				{
					System.out.println("Invalid Username or Password");
				}
			}
			
		}
		else if(Role.equals("user"))
		{
			Connection con=d1.getconn();
			PreparedStatement st=con.prepareStatement("Select * from Login");
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				String loginuser=rs.getString("login_id");
				String Loginpass=rs.getString("pass");
				System.out.println("please enter user name");
				String username=sc.next();
				System.out.println("please enter Password");
				String password=sc.next();
				if(loginuser.equals(username)&&Loginpass.equals(password) )
				{
					System.out.println("welcome into user login");
					
					while (s.equals("y")) {
						System.out.println("SERVICES PROVIDED BY US");
						System.out.println("press 1 to choose Ac_Booking");
						System.out.println("press 2 to choose Sleeper_Booking");
						System.out.println("press 3 to choose Unreserved ");
						System.out.println("press 4 to choose Luggage");
						User d=new User();
						int i = sc.nextInt();
						
						switch (i) {
						case 1: 
							d1.displayAcdetail();
						    break;
						case 2:
							d1.displaySleeperdetails();
						    break;
						case 3: 
							d1.displayUnreserveddetails();
						    break;
						case 4:
							d1.displayluggagedetails();
							break;
						case 5:
							System.exit(0);
						default : 
							System.out.println("Wrong Choice");
						    break;
						    
					}
						
					}
					
					
				}
       
				else
				{
					System.out.println("Invalid Username or Password");
			
				}
				
				
		}
			
			
			
		}
		
		/*else
		{
			System.out.println("you entered wrong role");
			String p1=sc.next();
			
		}*/
		System.out.println("Do you want to continue then press y/n");
		
		String n =sc.next();
		if (n.equals("n"))
		{
		    
			System.out.println("--------Session closed--------");

		    break outer;
		}
	}
		{
			System.out.println("you entered wrong role");
			
			
		}
		
	}
}



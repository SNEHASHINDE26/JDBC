package producttest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

  public class LoginApplication {
    
	  public static void main(String[]args) {
    	 
		 Scanner sc1 = new Scanner(System.in);
    	 
		 System.out.println("Enter Username");
    	 String user = sc1.next();
    	
    	 System.out.println("Enter Password");
    	 String password = sc1.next();
    	 
    	 Connection con = null;
    	 Statement stmt = null;
    	  ResultSet rs  = null;
    	 
    	 String query="select username,password from login_info";
    	 
    	 try {
    		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
    		 stmt = con.createStatement();
    		 rs = stmt.executeQuery(query);
    		
    		 boolean status = false;
    		 
    		 while(rs.next()) {
    			 
    		   String dbuser = rs.getString(1);
    		   String dbpassword = rs.getString(2);
    			 
    			 if(dbuser.equals(user) && dbpassword.equals(password)) {
    				 System.out.println("LOGIN SUCCESSFUL");	 
    				 status = true;
    				 
    			 }
    		 }
    		 if(status==false) {
    			 System.out.println("INVALID LOGIN DETAILS");
    		 }
    		 
    	 }catch(SQLException e) {
    		 
    	 }
     }
}

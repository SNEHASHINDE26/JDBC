package producttest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

  public class ProductDemo1 {
	   
	 static Connection con = null;
	 static Statement stmt = null;
	 static ResultSet rs   = null;
	
	 static {
			try {
				  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
			    } catch (SQLException e) {
					e.printStackTrace();
				}
			}
  
   
	 public void maxprice() {
	  
	   //create query
	   String query="select * from product_info where product_price in(select max(product_price)from product_info)";
				
	   try {
		     stmt = con.createStatement();
			  rs  = stmt.executeQuery(query);
			  
			  System.out.println("ID\t\tNAME\tPRICE");
				 System.out.println("==============================");
			  
			 while (rs.next()) {
			    	   
			   int id     = rs.getInt(1);
			  String name = rs.getString(2);
			   double price    = rs.getDouble(3);
			    	   
			   System.out.println(id+"\t\t"+name+"\t\t"+price);
			 }
		   } catch (SQLException e) {	
				 e.printStackTrace();
	    }
	 } 

   
   public void minprice() {
		  
	   //create query
	   String query="select * from product_info where product_price in(select min(product_price)from product_info)";
					
	   try {
		     stmt = con.createStatement();
			 rs = stmt.executeQuery(query);
				   
			 System.out.println("ID\t\tNAME\tPRICE");
			 System.out.println("================================");
			 
			 while (rs.next()) {
				    	   
			    int id      = rs.getInt(1);
			   String name  = rs.getString(2);
			   double price = rs.getDouble(3);
				    	   
		     System.out.println(id+"\t\t"+name+"\t\t"+price);
		   }  
		} catch (SQLException e) {
		   e.printStackTrace();
	  }
	} 	   
  }


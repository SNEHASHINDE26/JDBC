package crudoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
	
   public class DeleteProduct{
		
	   public static void main(String[]args) {
			
		   Scanner scl = new Scanner(System.in);
			
		   System.out.println("Enter Product Id");
			int id = scl.nextInt();
			
			Connection con=null;
			Statement stmt=null;
			
			String query="DELETE FROM product_info WHERE product_id = "+id;
			
			try {
			    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
			    stmt = con.createStatement();
			    int count = stmt.executeUpdate(query);
			    
			    if (count > 0) {
	                System.out.println(count + " Product Deleted");
	            } else {
	                System.out.println("No product found with the given id.");
	            }
			
			} catch (SQLException e) {			
				e.printStackTrace();
			}			
		}
	}



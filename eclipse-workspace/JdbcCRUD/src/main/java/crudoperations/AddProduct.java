package crudoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//table
 public class AddProduct {
	
	 public static void main(String[]args) {
		
		Scanner scl = new Scanner(System.in);
		
		System.out.println("Enter Product Id");
		int id = scl.nextInt();
		
		System.out.println("Enter Product Name");
		String name = scl.next();
		
		System.out.println("Enter Product Price");
		double price = scl.nextDouble();

		
		Connection con = null;
		Statement stmt = null;
		
		String query ="insert into product_info values("+id+",'"+name+"',"+price+")";
		
		try {
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
		    stmt = con.createStatement();
		    int count = stmt.executeUpdate(query);
		   
		    System.out.println(count+"Product Inserted");
		    
		} catch (SQLException e) {		
			e.printStackTrace();
		}		
	}
}

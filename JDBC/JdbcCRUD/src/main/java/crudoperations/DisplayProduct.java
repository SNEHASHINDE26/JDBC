package crudoperations;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

 public class DisplayProduct {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs   = null; 
		
		String query ="select * from product_info";
		
		try {
			con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
			stmt = con.createStatement();
			rs   = stmt.executeQuery(query);

			System.out.println("product_id\t product_name\t product_price");
			System.out.println("==============================================");
			
			while(rs.next()) {
				
			  int id       = rs.getInt(1);
			  String name  = rs.getString(2);
			  double price = rs.getDouble(3);
				
			  System.out.println(id+"\t\t"+name+"\t\t"+price);
			}
			  System.out.println("==============================================");

		} catch (SQLException e){
			
	  }
   }
}

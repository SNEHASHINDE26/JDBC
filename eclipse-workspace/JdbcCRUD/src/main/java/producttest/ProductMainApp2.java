package producttest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


 public class ProductMainApp2 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter lower price");
		double lowerPrice = sc1.nextDouble();
		
		System.out.println("Enter the higher price");
		double higherPrice = sc1.nextDouble();
		
		System.out.println("============================");
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs   = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
			
			String query="select * from product_info where product_price between "+lowerPrice+" and "+higherPrice+"";
			
			stmt = con.createStatement();
			 rs  = stmt.executeQuery(query);
			
			while(rs.next()) {
				
			    int id     = rs.getInt(1);
			  String name  = rs.getString(2);
			  double price = rs.getDouble(3);
				
			 System.out.println(id+"\t\t"+name+"\t\t"+price);
		  }	
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	  }
	}



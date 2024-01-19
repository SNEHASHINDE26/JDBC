package producttest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductInfo {

	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs   = null;
	
	static
	{
	   try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
			stmt = con.createStatement();
			
		   } catch (SQLException e) {
			    e.printStackTrace();
		}
	}
	
	
	public void displayProduct() {
		
		String query="select * from product_info";
		
		try {
			  rs = stmt.executeQuery(query);
			  
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
	
	
	public void addProduct(int product_id, String product_name, double product_price) {
		
		String query="insert into product_info values("+product_id+",'"+product_name+"',"+product_price+")";
		
		try {
			  int count = stmt.executeUpdate(query);
			  System.out.println(count+" product inserted");
		
		    } catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}



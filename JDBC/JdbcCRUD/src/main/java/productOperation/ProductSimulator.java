package productOperation;

import java.sql.*;
import java.util.Scanner;

public class ProductSimulator {
	
	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs;
	
	static {
			try{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
			 }catch (SQLException e) {
				e.printStackTrace();
			 }
		   }
		

	public void addProduct(int product_id, String product_name, double product_price) {
		
	 String query="insert into product_info values("+product_id+",'"+product_name+"',"+product_price+")";	
		
	  try {
			stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
			
			System.out.println(count+" "+"Product inserted Successfully");
			
		  } catch (SQLException e) {
			e.printStackTrace();
		  }
	} 
	
    
	public void deleteProduct(int product_id) {
    		
    	String query="delete from product_info where product_id="+product_id+"";
    	
    	 try {
    		stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
			
			System.out.println(count+" "+"Product Deleted Successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
       
    public void displayProduct() {
    	
    	String query="select * from product_info";
    	
    	try {
    		stmt = con.createStatement();
    		rs = stmt.executeQuery(query);
		
    		System.out.println("product_id\t\tproduct_name\t\tproduct_price");
    		
    		 while(rs.next()) {
    			
    			 int dbid      = rs.getInt(1);
    			String dbname  = rs.getString(2);
    			double dbprice = rs.getDouble(3);
    			
    			System.out.println(dbid+"\t\t\t"+dbname+"\t\t\t"+dbprice);			
    		}
    		 
    	} catch (SQLException e) {
			e.printStackTrace();
		}   	
    }
}
    
	
	
	



	package crudoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

 public class JdbcDemo1 {

	public static void main(String[] args) {
	
		Connection con = null;
		Statement stmt = null;
		
		String query="insert into product_info values(5,'Speaker',45000.45)";
		
		try {
			// load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
			//System.out.println("Connection Established");
					
			//create statement platform
			stmt = con.createStatement();
					
			//execute sql query
			//executeUpdate()=dml execute()=dml,dql executeQuery()=dql
			int count = stmt.executeUpdate(query);
			
			System.out.println(count+" record inserted sucessfully");
		
		 } catch(ClassNotFoundException e) {
			e.printStackTrace();
		 } catch(SQLException e) {
			e.printStackTrace();
		 }
	}
}

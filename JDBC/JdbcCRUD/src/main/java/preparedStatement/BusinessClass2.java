package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

 public class BusinessClass2 {

	static Connection con = null;
	static PreparedStatement pstmt;
	static ResultSet rs;
	
	static
	       {
			try{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
			    } catch (SQLException e) {
				    e.printStackTrace();
			}
	  }
	
	 
	
	public void addBike(String model,String company, double price) {
		 
		String query="insert into bike_info(model,company,price)values(?,?,?)";	
		
			try {
				pstmt = con.prepareStatement(query);
						
				pstmt.setString(1,model);
				pstmt.setString(2,company);
				pstmt.setDouble(3, price);
				int count=pstmt.executeUpdate();
				
				System.out.println(count+"records inserted");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
	 
  
	
	 public void getBikeBymodel(String model) {
    	
    	String query="select * from bike_info where model=?";
    	
    	try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, model);
			rs = pstmt.executeQuery();

			System.out.println("id\t\tmodel\t\tcompany\t\tprice");
			
			if(rs.next()){
				
				  int  dbid      = rs.getInt(1);
				String dbmodel   = rs.getString(2);
				String dbcompany = rs.getString(3);
				double dbprice   = rs.getDouble(4);
				
				System.out.println(dbid+"\t\t"+dbmodel+"\t\t"+dbcompany+"\t\t"+dbprice);
				
			  }else{
	    		     System.out.println("Id Does not exist");
			       }	
			       
		} catch (SQLException e) {
			e.printStackTrace();
		}
     }
    
    
  
	 public void getBikeByCompany(String company) {
	
	 String query="select * from bike_info where company=?";
	
	 try {
		pstmt = con.prepareStatement(query);
		pstmt.setString(1, company);
		rs = pstmt.executeQuery();
		
		System.out.println("id\t\tmodel\t\tcompany\t\tprice");
		
		while(rs.next()) {
			
			int dbid         = rs.getInt(1);
			String dbmodel   = rs.getString(2);
			String dbcompany = rs.getString(3);
			double dbprice   = rs.getDouble(4);
			
		   System.out.println(dbid+"\t\t"+dbmodel+"\t\t"+dbcompany+"\t\t"+dbprice);
		      
		      }
	     }catch (SQLException e) {
		      e.printStackTrace();
	    }
     }

   
	
	 public void getBikeById(int id) {
	       String query = "SELECT * FROM bike_info WHERE bid=?";
	       
	       try {
	           pstmt = con.prepareStatement(query);
	           pstmt.setInt(1, id);
	           rs = pstmt.executeQuery();
	           
	           System.out.println("id\t\tmodel\t\tcompany\t\tprice");
	           
	           while(rs.next()) {
	               int dbid = rs.getInt(1);
	               String dbmodel = rs.getString(2);
	               String dbcompany = rs.getString(3);
	               double dbprice = rs.getDouble(4);
	               
	               System.out.println(dbid + "\t\t" + dbmodel + "\t\t" + dbcompany + "\t\t" + dbprice);
	           }
	       } catch (SQLException e) {
	           e.printStackTrace();
	       }
	   }

	
	
	 public void getAllBikes() {
		
		String query="select * from bike_info";
		
		try {
		     pstmt = con.prepareStatement(query);
		     rs = pstmt.executeQuery();
		
		System.out.println("id\t\tmodel\t\tcompany\t\tprice");
		
		while(rs.next()) {
			
			int dbid         = rs.getInt(1);
			String dbmodel   = rs.getString(2);
			String dbcompany = rs.getString(3);
			double dbprice   = rs.getDouble(4);
			
		System.out.println(dbid+"\t\t"+dbmodel+"\t\t"+dbcompany+"\t\t"+dbprice);
		
		}
	  }catch (SQLException e) {
		e.printStackTrace();
	 }
  }
}

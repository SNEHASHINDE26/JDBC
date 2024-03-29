package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


   public class Test1 {

	  static Connection con;
	
	    static {
		
		  try {
			    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
		      } catch (SQLException e) {
			     e.printStackTrace();
		    }
	    }
    
	    
	public int addRecord(String username, String password, int age, double cno, String city) {
    	 
		PreparedStatement pstmt = null;
    	 
		String query="insert into test_info(username,password,age,cno,city)values(?,?,?,?,?)";
    		
		int count = 0;	 
    	 try {
    		 pstmt = con.prepareStatement(query);
    		
			 
    		 pstmt.setString(1,username);
    		 pstmt.setString(2, password);
    		 pstmt.setInt   (3, age);
    		 pstmt.setDouble(4,cno);
    		 pstmt.setString(5, city);
    		 
    		 count = pstmt.executeUpdate();
    	
    	 }catch(SQLException e) {
    		 e.printStackTrace();
    	 }
    	 return count;
     }
	
	     public ArrayList<Demo>displayRecord(){
	    
	    	ArrayList<Demo> records = new ArrayList<>();
	        PreparedStatement pstmt = null;
	        ResultSet rs = null;

	        String query = "select username, password, age, cno, city from test_info";

	        try {
	            pstmt = con.prepareStatement(query);
	            rs = pstmt.executeQuery();

	            while (rs.next()) {
	                Demo demo = new Demo();
	                demo.setUserName(rs.getString("username"));
	                demo.setPassword(rs.getString("password"));
	                demo.setAge(rs.getInt("age"));
	                demo.setCno(rs.getDouble("cno"));
	                demo.setCity(rs.getString("city"));

	                records.add(demo);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
			return records; 
		
	}	
}

      

	



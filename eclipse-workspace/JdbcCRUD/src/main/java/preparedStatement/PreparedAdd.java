package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
  //Table predemo_info
  public class PreparedAdd {

	 public static void main(String[] args) {
		
		 Connection con = null;
		 PreparedStatement pstmt = null;
		
		 String query="insert into predemo_info values(?,?,?)";
		 
		 try {
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
			  pstmt = con.prepareStatement(query);
			 
			 pstmt.setInt(1,4);
			 pstmt.setString(2, "Airpods");
			 pstmt.setDouble(3, 9000.0);
			
			 int count1 = pstmt.executeUpdate();
			
			 pstmt.setInt(1,5);
			 pstmt.setString(2,"ipad");
			 pstmt.setDouble(3, 24000.0);
			
			 int count2 = pstmt.executeUpdate();
			
			 pstmt.setInt(1,6);
			 pstmt.setString(2, "iphone");
			 pstmt.setDouble(3, 15000.0);
			 
			 int count3 = pstmt.executeUpdate();
			 
			System.out.println(count1+count2+count3+"Records Inserted");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
	}
}
		






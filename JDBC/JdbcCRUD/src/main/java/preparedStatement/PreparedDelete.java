package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedDelete {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String query="delete from predemo_info where p_id in(?)";
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1,4);
			int count1 = pstmt.executeUpdate();
			
			pstmt.setInt(1,5);
			int count2 = pstmt.executeUpdate();
			
			System.out.println(count1+count2+"Record Deleted");

	       }catch (SQLException e) {
		         e.printStackTrace();
        }
	}
}

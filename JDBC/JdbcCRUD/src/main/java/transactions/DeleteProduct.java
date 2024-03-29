package transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

  public class DeleteProduct {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter Product Id");
		int id = sc1.nextInt();
		 		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String query="delete from product_info where product_id=?";
				
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
			 con.setAutoCommit(false);
					
			 pstmt = con.prepareStatement(query);
			 pstmt.setInt(1,id);
			 int count = pstmt.executeUpdate();
					
			 System.out.println("WANT TO UNDO?");
			 System.out.println("1:YES\t2:NO");
					
			 int choice = sc1.nextInt();
					
			 if(choice==1)
			 {
			    con.rollback();
				System.out.println("TRANSACTION ROLLBACK Successfully");
			 }
			 else if(choice==2) 
			 {
				con.commit();
				System.out.println(count+" PRODUCT DELETED");
			 }
		} catch (SQLException e) {
			 e.printStackTrace();
	  }
   }
}

//THIS PROGRAM (UNDO)IS ONLY APPLYCABLE ON DML

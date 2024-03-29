package callablestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;
//Functions
 public class CustomerType {

	public static void main(String[] args) {
    
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the credit card limit");
	    int limit = sc1.nextInt();
	
		Connection con = null;
		java.sql.CallableStatement cstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
			
			cstmt = con.prepareCall("{?=call customerType(?)}");
			
			//set input to second and third placeholder
			cstmt.setInt(2, limit);
			
			//store output into first placeholder
			cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.execute();
			
			//get output from first placeholder
			System.out.println("CUSTOMER TYPE IS "+cstmt.getString(1));
		
		} catch (SQLException e) {
		e.printStackTrace();
		}

	}
}

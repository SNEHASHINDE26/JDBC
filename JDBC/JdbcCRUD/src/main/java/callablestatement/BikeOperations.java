package callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
//tables
public class BikeOperations {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter bike id:");
		int id = sc1.nextInt();
		
		System.out.println("Enter bike model:");
		String model = sc1.next();
		
		System.out.println("Enter bike company:");
		String company = sc1.next();
		
		System.out.println("Enter bike price:");
		double price = sc1.nextDouble();
		
		Connection con = null;
		CallableStatement cstmt = null;
		
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
				cstmt = con.prepareCall("{call bikeoperations(?,?,?,?)}");
				cstmt.setInt(1, id);
				cstmt.setString(2, model);
				cstmt.setString(3, company);
				cstmt.setDouble(4, price);
				cstmt.execute();
				
				System.out.println("Procedure executed successfully");
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}

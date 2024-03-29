package callablestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import com.mysql.cj.jdbc.CallableStatement;
//functions
 public class CallableDemo {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter 1st Value");
		int no1 = sc1.nextInt();
		
		System.out.println("Enter 2nd Value");
		int no2 = sc1.nextInt();

	Connection con = null;
	java.sql.CallableStatement cstmt = null;

	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");		//create platform using callable statement
		
		cstmt = con.prepareCall("{?=call addnumbers(?,?)}");
		
		//set input to second and third placeholder
		cstmt.setInt(2, no1);
		cstmt.setInt(3, no2);
		
		//store output into first placeholder
		cstmt.registerOutParameter(1, Types.INTEGER);
		cstmt.execute();
		
		//get output from first placeholder
		System.out.println("ADDITION IS "+cstmt.getInt(1));
		
	} catch (SQLException e) {
		e.printStackTrace();
		}
				
	}
	
	
	}



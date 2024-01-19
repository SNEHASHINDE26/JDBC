package producttest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

  public class LoginDemo {
 
	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs   = null;
	
	static
	{
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","sql@123");
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void loginValidation(String user,String password) {
		
		String query="select username,password from login_info ";
		
		Scanner sc = new Scanner(System.in);
		ProductInfo pi = new ProductInfo();
		
		boolean status = false;
		
		try {
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				
			 String dbuser = rs.getString(1);
			 String dbpassword = rs.getString(2);
				
			 if(dbuser.equals(user) && dbpassword.equals(password)) {
			    	
			 System.out.println("Login Successful");
			   
			 status = true;
			    	
			 System.out.println("1:Display Product\n2:Add Product");
			 System.out.println("====================");

			  int ch = sc.nextInt();
			    	
			 if (ch==1) {
			              pi.displayProduct();
                        }
			 else if (ch==2) {		
			
			 System.out.println("Enter product id");
			  int product_id = sc.nextInt();
						
			 System.out.println("Enter product name");
			  String product_name = sc.next();
						
			 System.out.println("Enter product price");
			  double product_price = sc.nextDouble();
					    
			 System.out.println("====================");

			 pi.addProduct(product_id, product_name, product_price);
		   }
	     }
		
	      if(status==false)
	      {
		   System.out.println("Invalid Login Details");
		   }
		 }
	}catch (SQLException e) {
	     e.printStackTrace();
    }
 }
	
	
	public void signUp(int id, String username, String password) {
						
	    String query="insert into login_info  values ("+id+",'"+username+"','"+password+"')";
						
	    try {
			  int count = stmt.executeUpdate(query);
			  System.out.println("Sign Up Successfully..!");
			
	        } catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}						



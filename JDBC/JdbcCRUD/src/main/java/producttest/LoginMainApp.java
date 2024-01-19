package producttest;

import java.util.Scanner;

public class LoginMainApp {

	public static void main(String[] args) {

		Scanner sc1=new Scanner(System.in);

		System.out.println("1.Login\n2.Sign up");
		System.out.println("====================");
		int choice=sc1.nextInt();

		LoginDemo ld = new LoginDemo();

		if (choice==1) {
			
			System.out.println("Enter the Username");
			String user = sc1.next();
			
			System.out.println("Enter the Password");
			String password = sc1.next();

			System.out.println("====================");

			ld.loginValidation(user,password);
		}
		
		else if(choice==2) {

			System.out.println("Enter id");
			int id = sc1.nextInt();
			
			System.out.println("Enter username");
			String username = sc1.next();
			
			System.out.println("Enter password");
			String password = sc1.next();
			 
			System.out.println("====================");

			ld.signUp(id,username, password);
		}
	}
}

	

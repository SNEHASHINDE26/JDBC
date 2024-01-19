package package1;

import java.util.Scanner;

public class CompanyDriver {
	
	public static void main(String[]args) {
		Company c1 =new Company("Tcs");
		
		Scanner sc = new Scanner(System.in);
		boolean a= true;
		while(a)
		{
			System.out.println("Enter the choice:\n1.add student\n2.update\n3.Details");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
		    System.out.println("Enter the Employee name");
		    String name =sc.next();
		    System.out.println("Enter the Employee id");
		    int id = sc.nextInt();
		    System.out.println("Enter the Employee Contact");
		    int contact = sc.nextInt();
		    System.out.println("Enter the Employee city");
		    String city = sc.next();
		    c1.addEmployee(new Employee(name,id,contact,city));
			}
			break;
			case 2:
			{
				c1.removeEmployee();
			}
			case 3:
			{
				c1.updateDetails();
			}
			break;
			case 4:
			{
				c1.displayDetails();
			}
			break;
			default :
			{
				System.out.println("Invalid choice");
			}
			}
		}
	}

}


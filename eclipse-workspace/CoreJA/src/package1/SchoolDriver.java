package package1;

import java.util.Scanner;

public class SchoolDriver {
	
	public static void main(String[]args) {
		School s1 =new School("kendriya vidyalaya");
		
		Scanner sc = new Scanner(System.in);
		boolean a= true;
		while(a)
		{
			System.out.println("Enter the choice:\n1.add student\n2.cancle addmission\n3.update\n4.Details");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
		    System.out.println("Enter the student name");
		    String name =sc.next();
		    System.out.println("Enter the student id");
		    int id = sc.nextInt();
		    System.out.println("Enter the student std");
		    int std = sc.nextInt();
		    System.out.println("Enter the student city");
		    String city = sc.next();
		    s1.addstudent(new Student(name,id,std,city));
			}
			break;
			case 2:
			{
				s1.removeStudent();
			}
			case 3:
			{
				s1.updateDetails();
			}
			break;
			case 4:
			{
				s1.displayDetails();
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

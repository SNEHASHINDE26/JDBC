package jdbcTest;

import java.util.ArrayList;
import java.util.Scanner;


  public class MainTest {

	private static final String Username = null;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter Choice: \n1.Insert Record \n2.Display Record");	
		int choice = sc.nextInt();
		
		System.out.println("--------------------------");
		
		if(choice==1)
		{
			insertRecord();
		}
		else if(choice==2)
		{
			displayRecord();
		}	
		else
		{
			System.out.println("Invalid Choice");
		}
	 }
	
	 static void insertRecord() {
			
		System.out.println("Enter UserName");
		String username = sc.next();
		
		System.out.println("Enter Password");	
		String password = sc.next();
		
		System.out.println("Enter Age");
		int age = sc.nextInt();
		
		System.out.println("Enter Contact Number ");
		double cno = sc.nextDouble();
		
		System.out.println("Enter City ");
		String city = sc.next();
		
	     Test1 T1 = new Test1();
		
		
		int count = T1.addRecord(username, password, age, cno, city);
		System.out.println(count+"Record INSERTED SUCCESSFULLY");
	 }
	    
	private static void displayRecord() {
		
		Test1 T1 = new Test1();
		ArrayList<Demo>data = T1.displayRecord();
		
		for(Demo D1:data) {
			
		System.out.println(D1);
		System.out.println("Record DISPLAYED SUCCESSFULLY");
		}
	}
}

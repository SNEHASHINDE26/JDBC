package package1;
import java.util.Scanner;

public class Company {
	
	String name;
	
	Company(String name){
		
		this.name=name;
	}
	Employee e;
  public void addEmployee(Employee e)
  {
		if(this.e==null)
		{
		this.e = e;	
		System.out.println("Employee added successfully...");
		}
		else
	 {
		System.out.println("Employee is already added...");	
	 }
		
  }
	public void removeEmployee()
	{
		if(this.e==null)
		{
			System.out.println("Employee is not added yet");
		}
	}
	
	public void updateDetails()
	{
		if(this.e==null)
		{
		System.out.println("student is not added yet....");		
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the new ContactNo to update");
			int Contact =sc.nextInt();
			e.setContact(Contact);
			System.out.println("Enter the city to update");
			String city = sc.next();
			e.setCity(city);
			System.out.println("Details updated successfully");
		}
	}
	public void displayDetails()
	{
		if(this.e==null)
		{
			System.out.println("student is not added yet...");
		}
		else {
			System.out.println("......"+name+"....");
		    System.out.println("employee name : "+e.getName());
		    System.out.println("employee id : "+e.getId());	
		    System.out.println("emplyee Contact : "+e.getContact());
		    System.out.println("employee city : "+ e.getCity());
					
		}
	}

}


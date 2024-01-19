package package1;
import java.util.Scanner;

public class School {
	
	String name;
	
	School(String name){
		
		this.name=name;
	}
	Student s;
  public void addstudent(Student s)
  {
		if(this.s==null)
		{
		this.s = s;	
		System.out.println("Student added successfully...");
		}
		else
	 {
		System.out.println("Student is already added...");	
	 }
		
  }
	public void removeStudent()
	{
		if(this.s==null)
		{
			System.out.println("student is not added yet");
		}
		else 
		{
			this.s = null;
			System.out.println("Admission cancelled successfully....");
		}
	}
	
	public void updateDetails()
	{
		if(this.s==null)
		{
		System.out.println("student is not added yet....");		
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the new std to update");
			int std =sc.nextInt();
			s.setStd(std);
			System.out.println("Enter the city to update");
			String city = sc.next();
			s.setCity(city);
			System.out.println("Details updated successfully");
		}
	}
	public void displayDetails()
	{
		if(this.s==null)
		{
			System.out.println("student is not added yet...");
		}
		else {
			System.out.println("......"+name+"....");
		    System.out.println("student name : "+s.getSname());
		    System.out.println("student id : "+s.getId());	
		    System.out.println("student std : "+s.getStd());
		    System.out.println("student city : "+ s.getCity());
					
		}
	}

}

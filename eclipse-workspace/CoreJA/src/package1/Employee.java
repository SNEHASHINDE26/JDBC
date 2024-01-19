package package1;

public class Employee {
   
	private String name;
	private int id ;
	private double contact;
	private String city;
	
	public Employee(String name, int id, double contact, String city) {
	
		this.name = name;
		this.id = id;
		this.contact = contact;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getContact() {
		return contact;
	}

	public void setContact(double contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}


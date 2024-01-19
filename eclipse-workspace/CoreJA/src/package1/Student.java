package package1;

public class Student {
	
	private String sname;
	private int id;
	private int std;
	private String city;

	public String getSname() {
		return sname;
	
	}

	public int getId() {
		return id;
	
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(String sname, int id, int std, String city) {
		super();
		this.sname = sname;
		this.id = id;
		this.std = std;
		this.city = city;
	}

}

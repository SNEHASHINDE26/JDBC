package jdbcTest;

  public class Demo {
	  
	  private String UserName;
	  private String Password;
	  private int Age;
	  private double Cno;
	  private String City;
	  
	 
	public String getUserName() {
			return  UserName;
	  }
	  
    public void setUserName(String username) {
		UserName = username;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		this.Password = password;
	}
	
	public int getAge() {
		return Age;
	}
	
	public void setAge(int age) {
		this.Age = age;
	}
	
	public double getCno() {
		return Cno;
	}
	
	public void setCno(double cno) {
		this.Cno = cno;
	}
	
	public String getCity() {
		return City;
	}
	
	public void setCity(String city) {
		this.City = city;
	}
	
			
		
		public String toString(){
			return UserName+"\t"+Password+"\t"+Age+"\t"+Cno+"\t"+City;
		}
	}
		

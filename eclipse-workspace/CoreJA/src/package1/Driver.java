package package1;

 public class Driver {

	public static void main(String[] args) {
	Mobile m1 = new Mobile ("samsung","white",new Battery(5000,"target"));
		
		System.out.println(m1.company);
		System.out.println(m1.color);
		System.out.println(m1.b.capacity);
		System.out.println(m1.b.company);
	

	}

}

package Exception;

public class Child1 extends Parent1 {
	int b;
	public static void main(String[]args) {
		Parent P1=new Parent();
		Child C1=(Child)P1;//ClassCastException
		System.out.println(C1.a);
		System.out.println(C1.b);
	}
	

}

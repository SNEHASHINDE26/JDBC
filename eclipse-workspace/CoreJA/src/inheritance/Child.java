package inheritance;

public class Child extends Parent{
	/*int b;
	public static void main(String[]args) {
		Parent p =new Child();//upCasting
         System.out.println(p.a);
         //System.out.println(p.b);//CTE
         System.out.println("................");
         
	}*/






int b;
public static void main(String[]args) {
	Child C1 =(Child)P;//DownCasting
     System.out.println(C1.a);
     System.out.println(C1.b);
}
}
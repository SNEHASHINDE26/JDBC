package productOperation;

import java.util.Scanner;
  
   //table product_info
  public class MainApp {

	public static void main(String[] args) {
				
     Scanner sc = new Scanner(System.in);
     
     System.out.println("1.Add Product\n2.Delete Product\n3.Display Product\n");
     System.out.println("Enter choice:");
     System.out.println("================");
     int choice = sc.nextInt();
	
     ProductSimulator ps = new ProductSimulator();
  
      if(choice==1) {
    	 
       System.out.println("Enter id : ");
    	int id = sc.nextInt();
    	 
       System.out.println("Enter name : ");
    	String name = sc.next();
    	 
       System.out.println("Enter price : ");
    	double price = sc.nextDouble();
    	 
    	ps.addProduct(id, name, price);
     }
     else if(choice==2) {
    	 System.out.println("Enter id : ");
    	 int id = sc.nextInt();
    	 ps.deleteProduct(id);
     }
     else if(choice==3) {
    	 System.out.println("Display all Product\n");
    	 ps.displayProduct();
     }    
  }
}

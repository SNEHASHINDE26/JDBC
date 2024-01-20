package domain;

import java.util.ArrayList;
import java.util.Scanner;
import dao.ProductDAO;
import dto.Product;

public class ProductMainApp {

    static Scanner sc1=new Scanner(System.in);
    
    public static void main(String[]args) {
    	
    	System.out.println("Select mode of operation:");
    	System.out.println("1.Add product");
    	System.out.println("2.Delete product");
    	System.out.println("3.Display product");
    	int choice=sc1.nextInt();
    	
    	System.out.println("-------------------------------------------");
    	if(choice==1)
    	{
    		insertProduct();
    	}
    	else if(choice==2)
    	{
    		removeProduct();
    	}
    	else if(choice==3)
    	{
    		displayProduct();
    	}
    	else
    	{
    		System.out.println("Invalid choice");	
    	}
	}

	 static void insertProduct() {
		
		System.out.println("Enter Product Name");
		String Name=sc1.next();
		System.out.println("Enter Product Price");	
		double Price=sc1.nextDouble();
		
		
		//add data to DTO object
		Product p1=new Product();
		p1.setProductName(Name);
		p1.setProductPrice(Price);
		
		
		//pass DTO object as argument to addProduct()method
		ProductDAO d1=new ProductDAO();
		int count=d1.addProduct(p1);
		System.out.println(count+"PRODUCT INSERTED SUCCESSFULLY");
	 }
	    static void removeProduct() {
		System.out.println("Enter Product Id:");
		int id=sc1.nextInt();
		
		//add data to DTO object
		Product p1= new Product();
		p1.setProductId(id);
		
		//pass DTO object as argument to addProduct()method
		ProductDAO d1=new ProductDAO();
		int count= d1.deleteProduct(p1);
		System.out.println(count+"PRODUCT DELETED SUCCESSFULLY");
	}

	private static void displayProduct() {
		ProductDAO p1=new ProductDAO();
		ArrayList<Product>data=p1.displayProducts();
		for(Product p:data) {
			System.out.println(p);
			System.out.println("PRODUCT DISPLAYED SUCCESSFULLY");
		}
	}

}

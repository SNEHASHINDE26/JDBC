package producttest;

import java.util.Scanner;
  //product_info
  public class ProductMainapp1 {

	public static void main(String[] args) {
			
		 ProductDemo1 pd = new ProductDemo1();
			
	     Scanner sc=new Scanner(System.in);
	    
	     System.out.println("1.MAX Price \n2.MIN Price");
		 System.out.println("==============");
	     System.out.println("Enter Choice:");

	     int choice=sc.nextInt();
	
	     if(choice==1) {
	    	 pd.maxprice();
	     }
	     else if(choice==2) {
	    	 pd.minprice();    	 
	     }
     }
 }
		



	



package inheritance;

import java.util.Scanner;

public class CartDriver {

	public static void main(String[] args) 
	{
	Cart c1 = new Cart ();
	Scanner sc = new Scanner(System.in);
	boolean exit = true;
	while(exit)
	{
		System.out.println("Enter the choice \n1.Add Book \n2.Remove Book \n3.Check Cart \n4.Show Cart");
		int choice = sc.nextInt();
		Cart b1= null ;
		switch (choice)
		{
		case 1:  
		{
			System.out.println("Enter the Book \n1.RomeoJulet \n2. HarryPotter");
			choice = sc.nextInt();
			switch(choice)
			{ 
			 case 1:
			 {
			  System.out.println("Enter the quantity of RomeoJulet");	 
			  int quantity = sc.nextInt();
			  c1.addCart(choice, quantity);
			 }
			 break;
		
			 case 2:
			 {
				  System.out.println("Enter the quantity of HarryPotter");	 
				  int quantity = sc.nextInt();
				  c1.addCart(choice, quantity); 
			 }
			  break ;
			}
		}
			  
			 case 2:
			 {
				 b1.removeBook();
			 }
			 break;
			 case 3:
			 {
				b1.checkCart();
			 }
		    break;
		   case 4:
		    {
		     b1.showCart();
		    }
		    break;
		    
		    default:
		    {
		    	System.out.println("Invalid choice...");
		    }
		    break ;
	}
   }
  }
}

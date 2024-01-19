package inheritance;

import java.util.Scanner;

public class BagDriver {

	public static void main(String[] args) 
	{
	Bag b1 = new Bag();
	Scanner sc = new Scanner(System.in);
	boolean exit = true;
	while(exit)
	{
		System.out.println("Enter the choice \n1.Add Ball");
		int choice = sc.nextInt();
		switch (choice)
		{
		case 1:  
		{
			System.out.println("Enter the game \n1.BasketBall \n2. TennisBall \n3");
			choice = sc.nextInt();
			switch(choice)
			{ 
			 case 1:
			 {
			  System.out.println("Enter the radius of basket ball");	 
			  double radius = sc.nextDouble();
			  b1.addBall(choice, radius);
			 }
			 break;
		
			 case 2:
			 {
				  System.out.println("Enter the radius of tennis ball");	 
				  double radius = sc.nextDouble();
				  b1.addBall(choice, radius); 
			 }
			  break ;
			}
		}
			  
			 case 2:
			 {
				 b1.removeBall();
			 }
			 break;
			 case 3:
			 {
				b1.checkBag();
			 }
		    break;
		   case 4:
		    {
		     b1.showGame();
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

	
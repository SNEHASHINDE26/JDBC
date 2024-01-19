package inheritance;

public class Bag {
	Ball b;
	public void addBall(int choice,double radius)
	{
	if(this.b==null)
	 {
	 if(choice==1)	
	  {
		Ball b = new BasketBall(radius);
		System.out.println("Basket Ball successfully added in Bag");
	  }
	  else if (choice==2)
	   {
		System.out.println("Tennis Ball successfully added in Bag"); 
	   }
	  else
	  {
		System.out.println("Invalid choice");
	  }
	 }
	}
	 
	 public void removeBall()
	 {
		 if(this.b==null)
		 {
			 System.out.println("No ball is added in bag...");
		 }
		 else
		 {
			 this.b=null;
			 System.out.println("Ball  is removed successfully...");
		 }
	 
	  }
      public void checkBag()
       {
	     if(this.b==null)
	     {
	    	 System.out.println("Bag is empty...");
	     }
	     else
	     {
	    	System.out.println("Bag is not empty..."); 
	     }
	 
       }
       public void showGame()  
        {
	     if(this.b==null)
	      {
		  System.out.println("No Ball is added in bag...");
	      }
	      else
	       {
		    if(b instanceof BasketBall)  
		     {
			  BasketBall b1 = (BasketBall) b;
			  System.out.println("You Can Play : "+b1.getName());
		     }
            else
		    {
			TennisBall t1 = (TennisBall) b;
			System.out.println("You Can Play : "+t1.getName());
		    }
	       }
	   }
	 
  
}

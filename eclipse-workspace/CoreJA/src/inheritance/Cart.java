package inheritance;

      public class Cart {

		Book b;
		public void addCart(int choice,int quantity)
		{
		if(this.b==null)
		 {
		 if(choice==1)	
		  {
			b = new RomeoJulet(quantity);
			System.out.println("RomeoJulet successfully added in Cart");
		  }
		  else if (choice==2)
		   {
			  b = new HarryPotter(quantity);
			System.out.println("HarryPotter successfully added in Cart"); 
		   }
		 }
		  else
		  {
			System.out.println("Invalid choice");
		  }
		 
		}
		 
		 public void removeBook()
		 {
			 if(this.b==null)
			 {
				 System.out.println("No Book is added in Cart...");
			 }
			 else
			 {
				 this.b=null;
				 System.out.println("Book  is removed successfully...");
			 }
		 
		  }
	      public void checkCart()
	       {
		     if(this.b==null)
		     {
		    	 System.out.println("cart is empty...");
		     }
		     else
		     {
		    	System.out.println("cart is not empty..."); 
		     }
		 
	       }
	       public void showCart()  
	        {
		     if(this.b==null)
		      {
			  System.out.println("No Book is added in Cart...");
		      }
		      else
		       {
		    	  if(b instanceof RomeoJulet)
			     {
				  RomeoJulet r1 = (RomeoJulet) b;
				  System.out.println("You Can read : "+r1.getName());
			     }
	            else
			    {
				HarryPotter h1 = (HarryPotter) b;
				System.out.println("You Can read : "+h1.getName());
			    }
		       }
		   }
		 
      
	}  


package package1;
import java.util.Scanner;
public class WhatsApp
{
	User u;
	public void login(User u)
	{
		if(this.u==null)
		{
			this.u=u;
			System.out.println("Login successfull...");
		}
		else
		{
			System.out.println("Already loggin");
		}
	}
	public void logout()
		{
			if(this.u==null)
			{
				System.out.println("Login first....");
			}
			else
			{
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter the pswd");
               int pswd =sc.nextInt();
               if(pswd==u.getPswd())
				{
					this.u=null;
					System.out.println("Logout successfully...");
				}
               else
               {
            	   System.out.println("Incorrect Password");
               }
					
			}
		}
		public void updateStatus()
		{
			if(this.u==null)
			{
				System.out.println("Login first....");
			}
			else
			{
	             Scanner sc = new Scanner(System.in);
	             System.out.println("Enter the pswd");
	             int pswd =sc.nextInt();
	             if(pswd == u.getPswd())
	             {
		           System.out.println("Enter the new status");	
		           Scanner SC = new Scanner(System.in);
		           String status = sc.next();
		           u.setStatus(status);
		           System.out.println("Status updated succesfull....");
		         }
	             else
	             {
	            	 System.out.println("Status Failed");	 
	             }
			}
		}
	
		public void displayUserDetails()
		{
			if(this.u==null)
			{
				System.out.println("Login first");
			}
			else
			{
				Scanner sc =new Scanner (System.in);
				System.out.println("Enter the pswd");
				int pswd = sc.nextInt();
				if(pswd==u.getPswd())
				{
					System.out.println("Username : "+u.getUname());
					System.out.println("Username : "+u.getCno());
					System.out.println("Username : "+u.getStatus());
					
				}
			}
		}
	
    public void changepswd()
    {
	    if(this.u==null)
	    {
		System.out.println("Login first....");
	    }
	    else 
	   {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the old password");
		 int pswd = sc.nextInt();
		 if(pswd==u.getPswd())
		  {
	        System.out.println("Enter the new password");
	        int npswd = sc.nextInt();
	        u.setPswd(npswd);
	        System.out.println("Password changed successful");
		  }
		}
	}
	 
}


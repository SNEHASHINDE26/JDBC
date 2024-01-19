package package1;
import java.util.Scanner;
public class WhatsAppDriver
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      WhatsApp W1 = new WhatsApp();
      
      Scanner sc = new Scanner(System.in);
      
      boolean exit =true ; 
      while(exit)
      {
    	  System.out.println("Enter the choice \n1.Login \n2.Logout \n3.update \n4.Display");
    	  int a = sc.nextInt();
    	  switch (a)
    	  {
    	  case 1:
    	  {
    	  System.out.println("Enter the username");
    	  String uname =sc.next();
    	  System.out.println("Enter the contact no");
    	  long cno = sc.nextLong();
    	  System.out.println("Enter the Status");
    	  String status =sc.next();
    	  System.out.println("Enter the pswd");
    	  int pswd = sc.nextInt();
    	  W1.login(new User(uname,cno,status,pswd));
    	  }
    	  break;
    	  case 2:
    	  {
    		  W1.logout();
    	  }
    	  break;
    	  case 4:
    	  {
    		  W1.updateStatus();
    	  }
    	  break;
    	  default:
    	  {
    		  System.out.println("Invalid Choice");
    	  }
    	
      }
	}
	}
}



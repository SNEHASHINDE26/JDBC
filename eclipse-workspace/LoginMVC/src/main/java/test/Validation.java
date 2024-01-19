package test;

//service layer-->model layer
public class Validation {
	
      public boolean validate(String username, String password) {
    	  
    	  if(username.equals("admin") && password.equals("123")) {
    		  
    		  return true;
    	 
    	  }else {
    		 
    		  return false;
    	  }
      }
}

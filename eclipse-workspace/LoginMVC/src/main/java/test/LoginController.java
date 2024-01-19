package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginlink")
public class LoginController extends HttpServlet {
      
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          
		  //fetch data
    	  String username = req.getParameter("username");
    	  String password = req.getParameter("password");
    	  
    	
    	  Validation v1 = new Validation();
    	 
    	  boolean status = v1.validate(username,password);
    	    
    	  if(status) {
    	    	 
    		        resp.sendRedirect("welcome.jsp");
    	    }else {
    		        resp.sendRedirect("index.html");
    	  }
    }
}

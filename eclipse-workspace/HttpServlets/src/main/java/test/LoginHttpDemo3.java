package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/thirdlink")
public class LoginHttpDemo3 extends HttpServlet{
	
	    static String user1 = "Sneha";
	    static String password1 = "Sneha@26";
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		 String username  = req.getParameter("user");
		 String password = req.getParameter("pass");

		 PrintWriter pw = resp.getWriter();
		 

		 if(user1.equalsIgnoreCase(username) && password1.equalsIgnoreCase(password)) {
			 pw.print("<h1 style=color:green>Login Successful....!</h1>");
		 } 
		else {
			  pw.print("<h1 style='color:red'>Invalid Login</h1>");
			
		 }				 
	}
}

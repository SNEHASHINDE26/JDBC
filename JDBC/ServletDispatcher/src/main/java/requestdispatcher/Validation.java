package requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet Chaining
@WebServlet("/loginlink")
public class Validation extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 String username = req.getParameter("user");
		 String password = req.getParameter("pass");
		  
		 if(username.equals("Sneha") && password.equals("123")) {
			 RequestDispatcher rd = req.getRequestDispatcher("welcomelink");
			 rd.forward(req, resp);
			 
		 }else {
			 PrintWriter pw = resp.getWriter();
			 
			 pw.print("<h1 style='color:red'>INVALID LOGIN DETAILS</h1>");
			
			 RequestDispatcher rd = req.getRequestDispatcher("login.html");
			 rd.include(req, resp);
		 }
				 
				 
	}
 
	
	
}

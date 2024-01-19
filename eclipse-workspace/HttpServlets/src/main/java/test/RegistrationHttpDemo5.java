package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fifthlink")
public class RegistrationHttpDemo5 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		String FirstName = req.getParameter("firstname");
		String LastName  = req.getParameter("lastname");
	    String ContactNo = req.getParameter("number");
	    String Gender    = req.getParameter("gender");
	    String Branch    = req.getParameter("branch");
	    
	   
	    PrintWriter pw = resp.getWriter();
	   
	   
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Registration Confirmation</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h2>Registration Confirmation</h2>");
        pw.println("<p>First Name: " + FirstName + "</p>");
        pw.println("<p>Last Name: " + LastName + "</p>");
        pw.println("<p>Contact Number: " + ContactNo + "</p>");
        pw.println("<p>Gender: " + Gender + "</p>");
        pw.println("<p>Branch: " + Branch + "</p>");
        pw.println("</body>");
        pw.println("</html>");

        
    }
}
   

		
	
     


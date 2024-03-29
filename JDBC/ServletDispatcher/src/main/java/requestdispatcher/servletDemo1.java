package requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet Chaining
@WebServlet("/firstlink")
public class servletDemo1  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
		PrintWriter pw = resp.getWriter();
	    
		pw.print("<h1 style='color:red'>RESPONSE FROM FIRST SERVLET</h1>");
	    
	    RequestDispatcher rd = req.getRequestDispatcher("secondlink");
	    rd.include(req, resp);	
	}

}

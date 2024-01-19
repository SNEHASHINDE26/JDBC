package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/seventhlink")
public class AddMulHttpDemo7 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String n1 = req.getParameter("num1");
		String n2 = req.getParameter("num2");
		
		String addition = req.getParameter("add");
		String multiplication = req.getParameter("mul");
		
		//parsing of n1 & n2
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		PrintWriter pw = resp.getWriter();
		
		if(addition != null) {
		       pw.print("<h2> Addition is: </h2>"+(num1 + num2));
		}
		else if(multiplication !=null) {
			   pw.print("<h2> Multiplication is: </h2>"+(num1 * num2));

		}
		
	}
	
}

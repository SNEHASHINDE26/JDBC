package salaryCalculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/link1")
public class Class1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		  String name = req.getParameter("empName");
	      String id   = req.getParameter("empId");
	      String sal  = req.getParameter("Salary");
	     
	      //parsing
	      double basicSal = Double.parseDouble(sal); // Assuming salary is the basic salary input
	      double hra = basicSal * 0.3; // Calculating House Rent Allowance (HRA) as 30% of basic salary
	      double gross = basicSal + hra; // Calculating gross salary by adding HRA to the basic salary
	      
	      req.setAttribute("gross", gross);
	      RequestDispatcher rd = req.getRequestDispatcher("link2");
	      rd.include(req, resp);
	      
	      double net=(double)req.getAttribute("net");
	      
	      PrintWriter pw = resp.getWriter();
	      
	      pw.print("<h2 style=color:green>Employee Name:"+name+"</h2>");
	      pw.print("<h2 style=color:green>Employee ID:"+id+"</h2>");
	      pw.print("<h2 style=color:green>Employee Gross Salary:"+gross+"</h2>");
	      pw.print("<h2 style=color:green>Employee Net Salary:"+net+"</h2>");

	}
   
}

package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sixthlink")
public class EmpHttpDemo6  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String ename = req.getParameter("Ename");
		String esalary = req.getParameter("Salary");
		String degn = req.getParameter("Designation");
		
		PrintWriter pw = resp.getWriter();
		
		//parsing of salary
		double currentSal = Double.parseDouble(esalary);
		   
		  if(degn.equals("HR")) {
			   currentSal = currentSal + (currentSal*0.20);
		
			   pw.println("<h1 style='color:red'>Total Salary : "+currentSal+"</h1>");
	
		  }else if(degn.equals("Manager")) {
			   currentSal = currentSal + (currentSal*0.30);
		   
			   pw.println("<h1 style='color:green'>Total Salary :"+currentSal+"</h1>");
		}	
	}		
}




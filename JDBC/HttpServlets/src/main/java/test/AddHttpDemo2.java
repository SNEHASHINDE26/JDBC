package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet("/secondlink")

	public class AddHttpDemo2 extends HttpServlet{

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String n1 = req.getParameter("number1");
			String n2 = req.getParameter("number2");
			
			//parsing
			int num1 = Integer.parseInt(n1);
			int num2 = Integer.parseInt(n2);
			
			PrintWriter pw = resp.getWriter();
			 
			
			pw.print("<h1 style='color:blue'>Addition:"+(num1+num2)+"</h1>");
//			pw.print("<h2 sytle='color:green'>Multiplication:"+(num1*num2)+"</h2>");
		}    
		
  }


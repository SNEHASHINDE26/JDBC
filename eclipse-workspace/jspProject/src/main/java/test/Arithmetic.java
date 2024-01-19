package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/resultlink")
public class Arithmetic extends HttpServlet {
	
	static double n1;
	static double n2;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		
		//parsing
		n1 = Double.parseDouble(num1);
		n2 = Double.parseDouble(num2);
		
	}
	
}
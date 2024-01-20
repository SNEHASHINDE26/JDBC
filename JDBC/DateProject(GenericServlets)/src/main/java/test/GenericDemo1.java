package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/WelcomeLink")

public class GenericDemo1 extends GenericServlet {

		@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	   Date d1=new Date();
	   PrintWriter pw=resp.getWriter();
	   pw.print("<h1>"+d1+"</h1>");
		
	}

}

package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/fourthlink")
public class CourseHttpDemo4 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String[] courses = req.getParameterValues("course");
		
		PrintWriter pw = resp.getWriter();
		
		pw.print("<h1>Selected Courses</h1>");
		
		for(int a=0; a<courses.length; a++) {
			pw.print("<h3>"+courses[a]+"</h3>");
		}
		
	}
       
}

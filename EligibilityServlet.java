package com.task1;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/age")
public class EligibilityServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		 PrintWriter pw=res.getWriter();
		 res.setContentType("text/html");
		 
		 int age=Integer.parseInt(req.getParameter("age"));
		 String gender=req.getParameter("gender");
		 String name=req.getParameter("pname");
		 
		 if(age>21 && age<60 && gender.equalsIgnoreCase("male"))
		 {
			  req.setAttribute("name", name);
			  req.setAttribute("gender", gender);
			  req.getRequestDispatcher("data.jsp").forward(req, res);
		 }
		 else if(age>18 && age<60 && gender.equalsIgnoreCase("female"))
		 {
			  req.setAttribute("name", name);
			  req.setAttribute("gender", gender);
			  req.getRequestDispatcher("data.jsp").forward(req, res);
		 }
		 else
		 {
			 pw.println("<h1 style='color:blue;'> <u style='color:black;'>"+name+"</u> Eligible for marrieage Think one<br> more time before taking decision!</h1>");
			 req.getRequestDispatcher("index.html").forward(req, res);
		 }
		 
	}

}

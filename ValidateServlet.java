package com.task1;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ms")
public class ValidateServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("null")
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String name=req.getParameter("pname");
		 
		String adhaar=req.getParameter("adhar");
		
		 
		
		if(name==null || name.isEmpty())
		{
			pw.println("<h1 style='color:red;'>Name should not be null or Empty</h1>");
			req.getRequestDispatcher("index.html").include(req, res);
			System.out.println("name folder");
			
			 
		}
		
		else if(adhaar.length()!=12)
		{
			pw.println("<h1 style='color:red;'>Adhaar Number should be of 12 digits and should not be zero</h1>");
			req.getRequestDispatcher("index.html").include(req, res);
			System.out.println("count folder");
		}
		else
		{ 
			pw.println("<h1>valid name adhaar</h1>");
			req.getRequestDispatcher("/age").forward(req, res);
		}
		
		
	}

}

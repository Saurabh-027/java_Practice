package com.admission;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.validation.AdminValidation;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/login.do")
public class LoginForwarderServlet extends HttpServlet{
	
	AdminValidation av = new AdminValidation();
	
	protected void doGet(HttpServletRequest request , HttpServletResponse response ) throws ServletException , IOException
	{
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}
	
	protected void doPost(HttpServletRequest request , HttpServletResponse response ) throws ServletException , IOException
	{
		String n=request.getParameter("name");
		if(n.equals("teacher"))
		request.getRequestDispatcher("/WEB-INF/views/teacherlogin.jsp").forward(request, response);
		
		if(n.equals("student"))
			request.getRequestDispatcher("/WEB-INF/views/studentlogin.jsp").forward(request, response);
		
		
		if(n.equals("admin"))
		{
			request.getRequestDispatcher("/WEB-INF/views/adminlogin.jsp").forward(request, response);
			AdminValidation ad = new AdminValidation();
			boolean f =	ad.adminvalidation(request.getParameter("name"));
			if(f)
			{
				ad.Sysout();
				request.getRequestDispatcher("/WEB-INF/views/adminshow.jsp").forward(request, response);
				
			}
		}
				
	}
}

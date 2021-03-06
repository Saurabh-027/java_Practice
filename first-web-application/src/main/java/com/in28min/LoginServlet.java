package com.in28min;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.ServletException;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request , HttpServletResponse response ) throws ServletException , IOException
	{
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}
	
	protected void doPost(HttpServletRequest request , HttpServletResponse response ) throws ServletException , IOException
	{
		request.setAttribute("name",request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/views/welcome1.jsp").forward(request, response);
	}

}

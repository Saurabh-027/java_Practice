package com.admission;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.validation.*;


@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/loginServlet.do")
public class LoginServlet extends HttpServlet
{
	
	/*
	 * protected void doGet(HttpServletRequest request , HttpServletResponse
	 * response ) throws ServletException , IOException {
	 * request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,
	 * response);
	 * 
	 * }
	 */
	
	protected void doPost(HttpServletRequest request , HttpServletResponse response ) throws ServletException , IOException
	{
		String role=request.getParameter("role");
		
		if(role.equals("teacher")) 
		{
			try {
				String empid = request.getParameter("empid");
				String username = request.getParameter("username");
				String password = request.getParameter("password");

				TeacherValidation tv  = new TeacherValidation();

				boolean t;

				t = tv.showteacher(username,password,empid);
				if(t) {
					request.setAttribute("username", username);
					request.setAttribute("empid", empid);
					request.getRequestDispatcher("/WEB-INF/views/teachershow.jsp").forward(request, response);
				}

			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

			else if(role.equals("student"))
			{
				try {
				String stuid = request.getParameter("studid");
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				
				StudentValidation sv = new StudentValidation();
				
				boolean v;
					
						v = sv.showstudent(username, password, stuid);
					
				if(v) {
					request.setAttribute("username", username);

					request.getRequestDispatcher("/WEB-INF/views/studentshow.jsp").forward(request, response);
				}
				} 
				
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
		
		
				else if(role.equals("admin"))
				{
//				request.getRequestDispatcher("/WEB-INF/views/adminlogin.jsp").forward(request, response);
					String id = request.getParameter("id");
					AdminValidation ad = new AdminValidation();
					boolean f =	ad.adminvalidation(id);
					if(f)
					{
						ad.Sysout();
						request.getRequestDispatcher("/WEB-INF/views/teacherdataentry.jsp").forward(request, response);
				
					}
				}
				
		}
}


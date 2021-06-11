package com.admission;

import com.insertion.StudentDataInsertion;
import com.insertion.TeacherDataInsertion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/dataServlet.do")
public class dataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String role = request.getParameter("role");

        if(role.equals("teacherData"))
        {
            String empId = request.getParameter("empid");
            String name = request.getParameter("name");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String mobile = request.getParameter("mobile");
            String email = request.getParameter("email");
            String dept = request.getParameter("dept");

            TeacherDataInsertion td = new TeacherDataInsertion();
            td.insertData(empId,name,username,password,mobile,email,dept);
        }
        else if(role.equals("studentData"))
        {
          String stuid = request.getParameter("stuid");
          String name = request.getParameter("name");
          String dept = request.getParameter("dept");
          String mobile = request.getParameter("mobile");
          String username = request.getParameter("user");
          String password = request.getParameter("pass");

            StudentDataInsertion sd = new StudentDataInsertion();
            sd.dataInsertion( stuid,name,dept,mobile,username,password);
        }

    }
}

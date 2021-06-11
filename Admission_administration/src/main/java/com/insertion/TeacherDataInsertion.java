package com.insertion;

import com.dbconnect.Dbconnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TeacherDataInsertion {
    public void insertData(String empId,String name,String username,String password,String mobile,String email,String dept)
            {
                try
                {
                    Dbconnector jd = new Dbconnector("aas");
                    Connection con = jd.connect();

                    final String query = "INSERT INTO teacherData(name,mobile,dept,username,password,email,empId) VALUES( '" + name + "','" + mobile + "', '" + dept + "','" + username + "','" + password + "',+'" + email +"','"+ empId +"' )";
                    Statement stmt = con.createStatement();

                    int inserted = stmt.executeUpdate(query);
                    System.out.println(inserted + "data inserted");
                }
                catch (SQLException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

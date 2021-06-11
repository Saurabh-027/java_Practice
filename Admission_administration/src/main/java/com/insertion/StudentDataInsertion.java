package com.insertion;

import com.dbconnect.Dbconnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDataInsertion {
    public void dataInsertion(String stuid,String name,String dept,String mobile, String username,String password)
    {
        try
        {
            Dbconnector jd = new Dbconnector("aas");
            Connection con = jd.connect();

            final String query = "INSERT INTO StudentData(stuid,name,mobile,dept,username,password) VALUES( '" + stuid + "','" + name + "', '" + dept + "','" + mobile + "','" + username + "',+'" + password +"' )";
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

package com.validation;

import com.dbconnect.Dbconnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TeacherValidation {
    Dbconnector jdbc = new Dbconnector("aas");
    Scanner sc = new Scanner(System.in);

    public boolean showteacher(String username, String password, String empid) throws SQLException {
        int count = 0;
        try (Connection con = jdbc.testJDBCConnection()){
//			Connection con = jdbc.testJDBCConnection();

            final String query = "SELECT * FROM  login_teacher";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next() != false) {

                String emp = rs.getString(1);
                String user = rs.getString(2);
                String pass = rs.getString(3);
                if (user.equals( username) && pass.equals( password )&& emp.equals(empid)) {
                    count = 1;
                }
            }
            //rs.close();
//			jdbc.closeConnection();

        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.toString());
            throw e;
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }

    }
}

package com.validation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.dbconnect.Dbconnector;

public class StudentValidation {

	Dbconnector jdbc = new Dbconnector("aas");
	Scanner sc = new Scanner(System.in);

	public boolean showstudent(String username, String password, String Stuid) throws SQLException {
		int count = 0;
		try (Connection con = jdbc.testJDBCConnection()){
//			Connection con = jdbc.testJDBCConnection();

			final String query = "SELECT * FROM  login_student";

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next() != false) {

				String n = rs.getString(1);
				String str = rs.getString(2);
				String pass = rs.getString(3);
				if (str.equals( username) && pass.equals( password )&& n.equals(Stuid)) {
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

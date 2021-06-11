package com.dbconnect;
import java.sql.*;



public class Dbconnector
{
	private static  String url;
	private static  String user;
	private static  String password;
	private Connection conn;
	
	public Dbconnector(String db) 
	{
		url = "jdbc:postgresql://localhost/" + db;
		user = "postgres";
		password = "1234";
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Dbconnector jd = new Dbconnector("aas");
		Connection con = jd.testJDBCConnection();
	}
	public Connection testJDBCConnection()
	{
		Connection con = connect();
		return con;
	}
	
	public Connection connect() {
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println("Exception in DB connection caught : " + e.getMessage());
        }

        return conn;
    }
	
	public void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	      
}
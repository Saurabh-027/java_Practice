package database.Creation;
import java.sql.*;
public class JDBCConnectionTest {
	private final String url;
	private final String user;
	private final String password;
	
	public JDBCConnectionTest(String db) {
		url = "jdbc:postgresql://localhost/" + db;
		user = "postgres";
		password = "1234";
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		JDBCConnectionTest jdConnectionTest = new JDBCConnectionTest("test");
		Connection con = jdConnectionTest.testJDBCConnection();
		
		/*jdConnectionTest.testCRUDOperation(con, "delete");
		jdConnectionTest.testCRUDOperation(con, "read");
		jdConnectionTest.testCRUDOperation(con, "count");*/
		
	}
	
/*	public void testCRUDOperation(Connection con, String operationType) throws SQLException {
	
		if(operationType.equalsIgnoreCase("insert")) {
		
			final String query = "INSERT INTO hellouser(id, name, password) VALUES(2, 'kk', '1234')";
			Statement stmt = con.createStatement();
			int inserted = stmt.executeUpdate(query);
			System.out.println(inserted + " data got inserted");
			
		} else if (operationType.equalsIgnoreCase("read")){
			final String query = "SELECT * FROM  hellouser";
			Statement stmt = con.createStatement();
			
			ResultSet rs= stmt.executeQuery(query);
			while(rs.next()!=false)
			{
				int n = rs.getInt(1);
				String str = rs.getString(2);
				String pass = rs.getString(3);
				System.out.println("id = " + n + ", User Name = " + str.trim() + ", Password = " + pass.trim());
				
			}
			
		} else if (operationType.equalsIgnoreCase("update")) {
			final String query="UPDATE hellouser set password='7896' WHERE password='1234'";
			Statement stmt=con.createStatement();
			int inserted=stmt.executeUpdate(query);
			System.out.println(inserted + " table updated");
		} 
		
		else if (operationType.equalsIgnoreCase("delete")) {
			final String query="DELETE FROM hellouser WHERE password='7896'";
			Statement stmt=con.createStatement();
			int inserted=stmt.executeUpdate(query);
			System.out.println( inserted + " row deleted");
			
		} 
		
		else if (operationType.equalsIgnoreCase("count")) {
			final String query = "SELECT COUNT(*) FROM hellouser";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			int count = rs.getInt(1);
			System.out.println("Count is : " + count);
		}
		
		else {
			System.out.println("The defined operation is not supported");
		}
		
	}*/
	
	public Connection testJDBCConnection() {
		Connection con = connect();
		return con;
	}
	
	public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println("Exception in DB connection caught : " + e.getMessage());
        }

        return conn;
    }
	

}

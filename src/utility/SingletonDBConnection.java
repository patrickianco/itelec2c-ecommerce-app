package utility;

import java.sql.*;

public class SingletonDBConnection {
	
	private static Connection con;

	private SingletonDBConnection() {}
	private static Connection getDBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petstore", "root", "harambe");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return con;	
	}
	
	public static Connection getConnection() {
		return ((con != null) ? con : getDBConnection());
	}
}

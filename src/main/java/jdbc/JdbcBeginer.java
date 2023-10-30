package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBeginer {
//	static final String DB_URL = "jdbc:mysql://192.168.135.1:3306/javacore";
	static final String DB_URL = "jdbc:mysql://localhost:3306/javacore";
	static final String USER = "root";
	static final String PASS = "123456";
//	static final String QUERY = "SELECT * FROM building";

	public static void main(String[] args) {
		String name = null;
		String street = null;
		String district = null;
		String ward = null;
		String floorarea = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String QUERY = "SELECT * FROM javacore.building where name like '%building%'";
//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(QUERY);
			ResultSetMetaData rsmd = rs.getMetaData();
//			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(QUERY);
			while (rs.next()) {
				System.out.print("ID: " + rs.getLong("id") + ", Type: " + rsmd.getColumnType(1));
				System.out.print(", Name: " + rs.getString("name"));
				System.out.print(", Street: " + rs.getString("street"));
				System.out.print(", District: " + rs.getString("district"));
				System.out.print(", Ward: " + rs.getString("ward"));
				System.out.println(", FloorArea: " + rs.getInt("floorarea"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (conn != null) {					
					conn.close();
				}
				if (stmt != null) {					
					stmt.close();
				}
				if (rs != null) {					
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import constant.SystemConstant;
import utils.ConnectionUtils;
import utils.StringUtils;

public class CustomerJdbc {

	public static void main(String[] args) {
//		String name = null;
		String fullName = null;
//		String street = null;
//		String district = null;
//		String ward = null;
//		String floorarea = null;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			StringBuilder query = new StringBuilder("SELECT * FROM customer "+SystemConstant.ONE_EQUAL_ONE+"");
			// Build query SQL
			if (!StringUtils.isNullOrEmpty(fullName)) {
				query.append(" AND name like '%"+fullName+"%'");
			}
//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = ConnectionUtils.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query.toString());
			ResultSetMetaData rsmd = rs.getMetaData();
//			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(QUERY);
			while (rs.next()) {
//				System.out.print("ID: " + rs.getLong("id") + ", Type: " + rsmd.getColumnType(1));
				System.out.print(", fullName: " + rs.getString("fullName"));
//				System.out.print(", Street: " + rs.getString("street"));
//				System.out.print(", District: " + rs.getString("district"));
//				System.out.print(", Ward: " + rs.getString("ward"));
//				System.out.println(", FloorArea: " + rs.getInt("floorarea"));
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

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExplain {
	static final String DB_URL = "jdbc:mysql://localhost:3306/javacore";
	static final String USER = "root";
	static final String PASS = "123456";
	static final String QUERY = "SELECT * FROM building";

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Thiếu file JAR driver");
		} catch (Exception e) {
			System.out.println("Lỗi ngoại lệ");
		}

//		System.out.println(10/0); //Runtime Exception
	}
}

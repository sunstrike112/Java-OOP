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
			Integer value1 = 0/10;
			System.out.println(value1);
			Class.forName("com.mysql.jdbc.Driver");
//			Integer value2 = 10/0;
//			System.out.println(value2);
		} catch (ClassNotFoundException e) {
			System.out.println("Thiếu file JAR driver");
		} catch (ArithmeticException e) {
			System.out.println("Ngoại lệ Arithmetic Exception");
		} catch (Exception e) {
			System.out.println("Lỗi ngoại lệ");
		}

//		System.out.println(10/0); //Runtime Exception
	}
}

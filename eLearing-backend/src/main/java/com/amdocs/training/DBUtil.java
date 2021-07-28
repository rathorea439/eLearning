//package com.amdocs.training;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

package com.amdocs.training;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
public class DBUtil {
	public static DataSource dataSource() {
		try {
			BasicDataSource ds = new BasicDataSource();
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUrl("jdbc:mysql://localhost:3306/amdocs_database");
			ds.setUsername("root");
			ds.setPassword("test");
			return ds;
		} catch (Exception ex) {
			return null;
		}
	}
}
//
//public class DBUtil {
//
//	private static Connection connection = null;
//
//	private DBUtil() {
//	}
//
//	public static Connection getConnection() {
//		String url = "jdbc:mysql://localhost:3306/amdocs_database";
//		String user = "root";
//		String password = "test";
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			if (connection == null) {
//				connection = DriverManager.getConnection(url, user, password);
//			}
//			return connection;
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//}
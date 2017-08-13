package com.mystuff.JDBCtutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String ORAUSER = "hr";
	private static final String ORAPWD = "hr";
	private static final String ORACS = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(ORACS, ORAUSER, ORAPWD);
	}
	
	public static void showErrorMessage(SQLException e) {
		System.err.println("Error Code: "  + e.getMessage() + 
				" " + e.getErrorCode());
	}
}

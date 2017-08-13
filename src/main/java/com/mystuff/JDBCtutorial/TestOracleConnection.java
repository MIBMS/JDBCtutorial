package com.mystuff.JDBCtutorial;

import java.sql.*;

public class TestOracleConnection {
	
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from countries");
			rs.next();
			System.out.println("Country name: " + rs.getString("Country_name"));		
		} catch (SQLException e) {
			DBUtil.showErrorMessage(e);
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		
	}
}

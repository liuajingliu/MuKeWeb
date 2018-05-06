package com.aa.common.DbTools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbUtil {
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/mydb?characterEncoding=UTF-8";
		String user = "root";
		String password = "123456";

		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		Connection conn = DbUtil.getConnection();
		System.out.println(conn); 
	}

	public static void close(ResultSet rs, PreparedStatement st, Connection conn)
			throws SQLException {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				conn.close();
			}
		}
	}

}
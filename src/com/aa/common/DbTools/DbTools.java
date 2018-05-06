/**
 * 
 */
/**
 * @author 刘666
 *
 */
package com.aa.common.DbTools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbTools {

	public static final String DRIVERCLASS = "com.mysql.jdbc.Driver"; 
	public static final String URL = "jdbc:mysql://localhost:3306/mydb"; 
	public static final String USER = "root"; 
	public static final String PASSWORD = "123456"; 
	//封装可以链接对象的方法
	public static Connection getConnection (){
		
		Connection conn = null;
		try {
			Class.forName(DRIVERCLASS);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);//创建链接
		} catch (Exception e) {
			System.out.println(111);
			e.printStackTrace();
		}
		return conn;
		
	}
	//封装关闭资源的方法     返回值：void 参数：Connection   PreparedStatement
	public static void closeall(Connection conn ,PreparedStatement pstm , ResultSet rs) {
		try {
			if(rs != null){
				rs.close();
			}
			if(pstm != null){
				pstm.close();
			}
			if(conn != null){
				conn.close();
			}
			
			
		} catch (Exception e) {
			System.out.println(111);
			e.printStackTrace();
		}
	}

}

/**
 * 
 */
/**
 * @author ��666
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
	//��װ�������Ӷ���ķ���
	public static Connection getConnection (){
		
		Connection conn = null;
		try {
			Class.forName(DRIVERCLASS);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);//��������
		} catch (Exception e) {
			System.out.println(111);
			e.printStackTrace();
		}
		return conn;
		
	}
	//��װ�ر���Դ�ķ���     ����ֵ��void ������Connection   PreparedStatement
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

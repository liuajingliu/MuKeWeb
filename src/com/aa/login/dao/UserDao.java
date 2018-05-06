package com.aa.login.dao;

/*
 * @author Αυ666
 *
 */
import java.sql.*;

import com.aa.common.DbTools.DbTools;
import com.aa.common.DbTools.DbUtil;
import com.aa.login.pojo.User;

public class UserDao {
	@SuppressWarnings("unused")
	public Boolean select(User user) throws ClassNotFoundException,
			SQLException {
		String sql = "select * from user where username =? and password =?";
		Connection conn = DbUtil.getConnection();
		if(conn == null)
			System.out.println("NO------");
		PreparedStatement pstate = conn.prepareStatement(sql);
		pstate.setString(1, user.getUsername());
		pstate.setString(2, user.getPassword());
		ResultSet rs = pstate.executeQuery();
		rs.next();
	
		if (rs != null)
			return true;
		
		return false;
	}

	public void insert(User user) throws ClassNotFoundException, SQLException {
		String sql = "insert into user(username,password) values(?,?)";
		Connection conn = DbUtil.getConnection();
		PreparedStatement pstate = conn.prepareStatement(sql);
		pstate.setString(1, user.getUsername());
		pstate.setString(2, user.getPassword());
		pstate.executeUpdate();
	}

}
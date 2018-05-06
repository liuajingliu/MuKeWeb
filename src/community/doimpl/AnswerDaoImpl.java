package community.doimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.aa.common.DbTools.DbTools;

import community.dao.AnswerDao;
import community.pojo.Answer;

public class AnswerDaoImpl implements AnswerDao {

	public ArrayList<Answer> queryAll(String id)
			throws SQLException {
		Connection conn = (Connection) DbTools.getConnection();
		
		String sql = "SELECT * From answer where community_id = ?";
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setString(0, id);
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<Answer> list = new ArrayList<Answer>();
		
		Answer a = null;
		while(rs.next()){
			a = new Answer();
			a.setCommunity_id(rs.getString(0));
			a.setAnswer_desc(rs.getString(1));
			a.setAnswer_stuid(rs.getString(2));
	
			list.add(a);
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
		return list;
	}

}

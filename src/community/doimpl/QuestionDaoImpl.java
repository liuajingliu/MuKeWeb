package community.doimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.aa.common.DbTools.DbTools;

import community.dao.QuestionDao;
import community.pojo.Question;

public class QuestionDaoImpl implements QuestionDao {

	public ArrayList<Question> queryAll()
			throws SQLException {
		Connection conn = (Connection) DbTools.getConnection();
		
		String sql = "SELECT * From question";
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<Question> list = new ArrayList<Question>();
		
		Question q = null;
		while(rs.next()){
			q = new Question();
			q.setCommunity_id(rs.getString(0));
			q.setCommunity_name(rs.getString(1));
			q.setCommunity_desc(rs.getString(2));
			q.setCommunity_stuid(rs.getString(3));
	
			list.add(q);
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
		return list;
	}

}

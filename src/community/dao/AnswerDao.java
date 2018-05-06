package community.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import community.pojo.Answer;

public interface AnswerDao {
		public ArrayList<Answer> queryAll(String id) throws SQLException;
}

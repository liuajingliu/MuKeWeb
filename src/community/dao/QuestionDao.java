package community.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import community.pojo.Question;


public interface QuestionDao {
	public ArrayList<Question> queryAll() throws SQLException;
}

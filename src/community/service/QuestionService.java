package community.service;

import java.sql.SQLException;
import java.util.ArrayList;

import community.dao.QuestionDao;
import community.doimpl.QuestionDaoImpl;
import community.pojo.Question;

public class QuestionService {

	private QuestionDao dao = new QuestionDaoImpl();
	
	public ArrayList<Question> queryAll() throws SQLException{
		
		return dao.queryAll();
	}
	
}

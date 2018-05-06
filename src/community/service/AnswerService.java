package community.service;

import java.sql.SQLException;
import java.util.ArrayList;

import community.dao.AnswerDao;
import community.doimpl.AnswerDaoImpl;
import community.pojo.Answer;

public class AnswerService {

	private AnswerDao dao = new AnswerDaoImpl();
	
	public ArrayList<Answer> queryAll(String id) throws SQLException{
		
		return dao.queryAll(id);
	}
	
}

package course.service;

import java.sql.SQLException;
import java.util.ArrayList;

import course.dao.CourseDao;
import course.doimpl.CourseDaoImpl;
import course.pojo.Course;


public class CourseService {

	private CourseDao dao = new CourseDaoImpl();
	
	public ArrayList<Course> queryAll(String direction, String classification,String rank) throws SQLException{
		
		if("ȫ��".equals(direction)){
			direction = null;
		}
		if("ȫ��".equals(classification)){
			classification = null;
		}
		if("ȫ��".equals(rank)){
			rank = null;
		}
		
		return dao.queryAll(direction, classification, rank);
	}
	
}

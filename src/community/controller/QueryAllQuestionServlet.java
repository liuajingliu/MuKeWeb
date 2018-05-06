package community.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import community.pojo.Question;
import community.service.QuestionService;

@WebServlet("/")
public class QueryAllQuestionServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
	//	((ServletRequest) response).setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		QuestionService service = new QuestionService();
		
		try{
			ArrayList<Question> list = service.queryAll();
			for (Question q : list) {
				System.out.println(q); 
				Gson gson=new Gson();
				out.write(gson.toJson(list));
			}
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	
}

package community.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import community.pojo.Answer;
import community.service.AnswerService;

public class QueryAllAnswerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		((ServletRequest) response).setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		AnswerService service = new AnswerService();
		String id = request.getParameter("community_id");
		
		try{
			ArrayList<Answer> list = service.queryAll(id);
			for (Answer q : list) {
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

/**
 * 
 */
/**
 * @author Αυ666
 *
 */
package com.aa.login.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aa.login.pojo.User;
import com.aa.login.service.LoginService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("aaa");
		String userName = request.getParameter("username");
	    String pwd = request.getParameter("password");
	    
	    User user = new User();
	    user.setUsername(userName);
	    user.setPassword(pwd);
	    
        LoginService service = new LoginService();
		
			boolean login = false;
			try {
				login = service.select(user);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(login == true){
				response.sendRedirect("index.html");
			}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

}

/**
 * 
 */
/**
 * @author Αυ666
 *
 */
package com.aa.login.controller;

import java.io.IOException;

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

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
	    String pwd = request.getParameter("password");
	    
	    User user = new User();
	    user.setUsername(userName);
	    user.setPassword(pwd);
	    
        LoginService service = new LoginService();
        System.out.println("--------------------------------------------");
		try {
			boolean login = service.select(user);
			System.out.println(login);
			if(login == false){
				service.insert(user);
				response.sendRedirect("login_register.html");
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}

package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import domain.User;
import service.UserService;
import service.impl.UserServiceImpl;
import dto.UserLogin;


//@WebServlet("/login")
//public class LoginServlet extends HttpServlet {
//
//	private static final long serialVersionUID = 1L;
//	private UserService userService = UserServiceImpl.getUserService();
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		String email = request.getParameter("email");
//		String password = request.getParameter("password");
//
//		User user = userService.getUserByEmail(email);
//
//		if (user != null && user.getPassword().equals(password)) {
//			UserLogin userLogin = new UserLogin();
//			userLogin.destinationUrl = "adminka.jsp";
//			userLogin.userEmail = user.getEmail();
//			//userLogin.
//			String json = new Gson().toJson(userLogin);
//			response.setContentType("application/json");
//			response.setCharacterEncoding("UTF-8");
//			response.getWriter().write(json);
//		}
//	}
//
//}

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserService userService = UserServiceImpl.getUserService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("login");
		String password = request.getParameter("password");

		User user = userService.getUserByEmail(email);
	
		if (user != null && user.getPassword().equals(password)) {
			request.setAttribute("userEmail", email);
			request.getRequestDispatcher("adminka.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}

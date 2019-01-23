//package tomcat;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import domain.User2;
//import service.UserService2;
//
//@WebServlet("/registration")
//public class RegistrationServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	private UserService userService = UserService.getUserService();
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		String firstName = request.getParameter("firstName");
//		String lastName = request.getParameter("lastName");
//		String email = request.getParameter("email");
//		String password = request.getParameter("password");
//		
//		userService.saveUser(new User(firstName, lastName, email, password));
//		request.setAttribute("userEmail", email);		
//		request.getRequestDispatcher("adminka.jsp").forward(request, response);
//	}
//
//}

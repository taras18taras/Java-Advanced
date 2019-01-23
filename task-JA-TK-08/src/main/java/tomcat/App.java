//package tomcat;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.apache.log4j.xml.DOMConfigurator;
//
//import dao.MagazineDao;
//import domain.Magazine;
//import domain.User;
//import service.UserService;
//import service.impl.UserServiceImpl;
//import utils.ConnectionUtils;
//
//public class App {
//	//BasicConfigurator.configure();
//	//private static Logger LOG = LogManager.getLogger(App.class);
//	
//	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
//			
//		UserService userService = new UserServiceImpl();
//		userService.create(new User("UserName", "BOO", "TEST","Admin"));
//		userService.create(new User("test@gmail.com", "BOO", "TEST","Admin"));
//		userService.create(new User("Boo@mail.ru", "DANGER", "RUN","NOOB"));
//
//	}	
//
//}

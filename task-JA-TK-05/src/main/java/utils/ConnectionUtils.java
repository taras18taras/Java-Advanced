package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class ConnectionUtils {
	
	private static Logger LOG = LogManager.getLogger(ConnectionUtils.class);
	private static Connection conn = null;
	private static String USER_NAME = "root";
	private static String USER_PASSWORD = "123456";
	private static String URL = "jdbc:mysql://localhost/books?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	public static Connection openConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
		} catch (Exception e) {
			LOG.error("Could not connect");
		}
		return conn;
		
	}
}

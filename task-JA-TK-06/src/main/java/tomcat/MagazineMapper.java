package tomcat;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import domain.Magazine;



public class MagazineMapper {
	private static Logger LOG = LogManager.getLogger(MagazineMapper.class);
	
	public static Magazine  map(ResultSet result) throws SQLException {
		//LOG.info("readAll from db");
		int id = result.getInt("id");
		String name= result.getString("name");
		String description= result.getString("description");
		double price= result.getDouble("price");
		//LOG.info("readAll successed");
		return new Magazine(id, name, description, price);
	}

}

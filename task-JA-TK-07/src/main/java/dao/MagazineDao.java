package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import domain.Magazine;
import tomcat.MagazineMapper;


public class MagazineDao {
	private static Logger LOG = LogManager.getLogger(MagazineDao.class);
	static String READ_ALL = "select * from book";
	static String CREATE = "insert into book(name, description,price) values(?,?,?)";
	static String READ_BY_ID = "select * from book where id=?";
	static String UPDATE_BY_ID = "update book  set name=?,description=?,price=? where id=?";
	static String DELETE_BY_ID = "delete from book where id=?";
	
	private  Connection connection;
	private PreparedStatement preparedStatement;
	
	public MagazineDao(Connection connection) {
		this.connection =  connection;
	}
	
	public void insert(Magazine  magazine) throws SQLException {
		LOG.info("Inserting into db");
		preparedStatement = connection.prepareStatement(CREATE);
		preparedStatement.setString(1, magazine.getName());
		preparedStatement.setString(2, magazine.getDescription());
		preparedStatement.setDouble(3, magazine.getPrice());
		preparedStatement.executeUpdate();
		LOG.info("Insert successed");
		
	}
	
	public List<Magazine>  readAll() throws SQLException  {
		List<Magazine> listOfMagazine = new ArrayList<>();
		preparedStatement = connection.prepareStatement(READ_ALL);
		ResultSet result = preparedStatement.executeQuery();
		while(result.next()) {
			listOfMagazine.add(MagazineMapper.map(result));
		}
		return 	listOfMagazine;
	}
	
	public Magazine read(int id) throws SQLException  {
		LOG.info("read from db by id");
		preparedStatement = connection.prepareStatement(READ_BY_ID);
		preparedStatement.setInt(1, id);
		ResultSet result = preparedStatement.executeQuery(); 
		result.next();
		LOG.info("read successed");
		return 	MagazineMapper.map(result);
	}
	
	
	
	public void  update(Magazine  magazine) throws SQLException  {
		LOG.info("update into db");
		preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
		preparedStatement.setString(1, magazine.getName());
		preparedStatement.setString(2, magazine.getDescription());
		preparedStatement.setDouble(3, magazine.getPrice());
		preparedStatement.setInt(4, magazine.getId());
		preparedStatement.executeUpdate();
		LOG.info("update successed");
	}
	
	public void  delete(int id) throws SQLException  {
		LOG.warn("delete line from db");
		preparedStatement = connection.prepareStatement(DELETE_BY_ID);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();	
		LOG.warn("delete successed");
	}

	
	
	
	

}

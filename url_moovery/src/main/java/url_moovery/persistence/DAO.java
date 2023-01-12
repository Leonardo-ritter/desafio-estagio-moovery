package url_moovery.persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	
	public Connection connection;
	public ResultSet resultSet;
	public PreparedStatement statement;
	
	/*
	private static final String DATABASE = "URL_MOOVERY?";//
	private static final String URL = "jdbc:mysql://localhost:3306/";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";//"com.mysql.cj.jdbc.Driver";
	private static final String USER = "root";
	private static final String PASS = "leo91419033";
	
	*/
	public void abrirBanco() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver'");
		connection = DriverManager.getConnection("jdbc:mysql://localhost/3306/"+"URL_MOOVERY?", "root", "leo91419033");
	}

	public void fecharBanco() throws Exception{
		if(!connection.isClosed())
			connection.close();
	}
	
}

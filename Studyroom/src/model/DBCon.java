package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@70.12.115.66:1521:orcl";
	String user = "knave";
	String pass = "tiger";
	static Connection con;
//	DBCon db;
	
	private DBCon() throws Exception{
		Class.forName(driver);
		// 2. Connection 연결객체 얻어오기
		con = DriverManager.getConnection(url, user, pass);
	}
	public static Connection getConnection() throws Exception{
		if(con == null) new DBCon();
		return con;
		
	}
}

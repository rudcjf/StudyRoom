package model;

import java.sql.*;
import model.vo.Login;


public class LoginModel {
	Connection con;
	
	public LoginModel() throws Exception {
		con =DBCon.getConnection();

	}
	//로그인 함수
	public Login login(int id) throws Exception{
		Login log = new Login();
		String sql = "SELECT C_TEL FROM customer WHERE C_NUM=?";
		// 4. sql 전송객체 (PreparedStatement)		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1,  id);
		// 5. sql 전송
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			log.setCusPass(rs.getString("C_TEL"));
		}
		
		// 6. 닫기 (PreparedStatement  만 닫기)
		ps.close();
		
		return log;
		
	}
	public Login login(String id) throws Exception{
		Login log = new Login();
		String sql = "SELECT E_PASS FROM emp WHERE E_ID=?";
		// 4. sql 전송객체 (PreparedStatement)		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1,  id);
		// 5. sql 전송
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			log.setCusPass(rs.getString("E_PASS"));
			
		}
		
		// 6. 닫기 (PreparedStatement  만 닫기)
		ps.close();
		
		return log;
		
	}
	
	
	
	
}

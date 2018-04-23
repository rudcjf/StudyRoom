package model;

import java.sql.*;
import java.util.ArrayList;

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
	
	
	public ArrayList search() throws Exception{
		ArrayList data = new ArrayList();
		String str = "SELECT * FROM customer";
		
		PreparedStatement ps = con.prepareStatement(str);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			ArrayList temp = new ArrayList();
			temp.add(rs.getInt("c_num"));
			temp.add(rs.getString("c_name"));
			temp.add(rs.getString("c_tel"));
			temp.add(rs.getString("c_adr"));
			temp.add(rs.getString("c_mail"));
			
			data.add(temp);
			
		}
		
		rs.close();
		ps.close();
		
		return data;
	}
	
	public void insertCus(Login log) throws Exception{
		// 3. sql 문장 만들기
		String sql = "INSERT INTO customer(c_num, c_name, c_tel, c_adr, c_mail) VALUES (seq_cus.nextval, ?,?,?,?)";
		// 4. sql 전송객체 (PreparedStatement)		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1,  log.getC_name());
		ps.setString(2,  log.getC_tel());
		ps.setString(3,  log.getC_adr());
		ps.setString(4,  log.getC_mail());
		// 5. sql 전송
		ps.executeUpdate();
		// 6. 닫기 (PreparedStatement  만 닫기)
		ps.close();
		
	}
	
	//수정 함수
	public void updateCus(Login log, int c_num) throws Exception{
		String sql = "UPDATE customer SET C_NAME = ?, C_TEL = ?, C_ADR = ?, C_MAIL = ? WHERE C_NUM = ?";
		// 4. sql 전송객체 (PreparedStatement)		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1,  log.getC_name());
		ps.setString(2,  log.getC_tel());
		ps.setString(3,  log.getC_adr());
		ps.setString(4,  log.getC_mail());
		ps.setInt(5, c_num);
		// 5. sql 전송
		ps.executeUpdate();
		// 6. 닫기 (PreparedStatement  만 닫기)
		ps.close();
		
	}
	//삭제 함수
	public void deleteCus(Login log, int c_num){
		try{
			String sql = "DELETE FROM customer WHERE c_num = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, c_num);
			ps.executeUpdate();
			
			ps.close();
		}catch(Exception ex){
			
			System.out.println("삭제 실패 : "+ex.getMessage());
		}
		
	}
	
	
	
	
}

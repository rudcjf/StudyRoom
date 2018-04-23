package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class OrderModel {
Connection con;
	
	public OrderModel() throws Exception {
		con =DBCon.getConnection();

	}
	public ArrayList search() throws Exception{
		ArrayList data = new ArrayList();
		String str = "SELECT * FROM pay WHERE p_date IS NULL";
		
		PreparedStatement ps = con.prepareStatement(str);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			ArrayList temp = new ArrayList();
			temp.add(rs.getInt("p_num"));
			temp.add(rs.getInt("r_num"));
			temp.add(rs.getString("p_way"));
			temp.add(rs.getString("p_date"));
			temp.add(rs.getString("p_price"));
			
			data.add(temp);
			
		}
		rs.close();
		ps.close();
		
		return data;
	}
	
	public ArrayList searchAdmin() throws Exception{
		ArrayList data = new ArrayList();
		String str = "SELECT * FROM pay";
		
		PreparedStatement ps = con.prepareStatement(str);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			ArrayList temp = new ArrayList();
			temp.add(rs.getInt("p_num"));
			temp.add(rs.getInt("r_num"));
			temp.add(rs.getString("p_way"));
			temp.add(rs.getString("p_date"));
			temp.add(rs.getString("p_price"));
			
			data.add(temp);
			
		}
		rs.close();
		ps.close();
		
		return data;
	}
	
	
	
	
	
	public void pay(int p_num, String p_way) throws Exception {
		String sql = "Update pay SET p_way =?, p_date = sysdate where p_num = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, p_way);
		ps.setInt(2, p_num);
		
		
		// 5. sql 전송
		ps.executeUpdate();
		
		ps.close();
		
		
		
	} 
}

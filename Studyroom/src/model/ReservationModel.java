package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReservationModel {
	Connection con;
	
	public ReservationModel() throws Exception {
		con =DBCon.getConnection();
	}
	
	
	public int[] emptyRoom(String date, String start, String end)throws Exception{
		
		String startTime = "2018/"+date+" "+start;
		String endTime = "2018/"+date+" "+end;
		
		int[] result = new int[16];
		int a =0;
		String sql = "Select r_room  from reservation where  ";
		//넣은 범위안에 
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, startTime);
		ps.setString(2, endTime);
		ps.setString(3, endTime);
		ps.setString(4, startTime);
		ps.setString(5, endTime);
		ps.setString(6, startTime);
		
		
		// 5. sql 전송
		ResultSet rs = ps.executeQuery();
		int i =0;
		while(rs.next()){
			i++;
			a = rs.getInt(" r_room");
			System.out.println(a);
		}
		/*for(int data : result){
			System.out.println(data);
		}*/
		
			// 6. 닫기 (PreparedStatement  만 닫기)
		ps.close();
		con.close();
		return result;
	}
	
	
}

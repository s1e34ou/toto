package toto.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import toto.db.TotoDB;

public class TotoMemberDAO implements  ItotoMember{
	private static TotoMemberDAO memDAO;
	private boolean isS = false;
	public static TotoMemberDAO getInstance() {
		if(memDAO == null){
			memDAO = new TotoMemberDAO();
		}
		return memDAO;
	}
	
	/////////	/////////	/////////	/////////	/////////	/////////	/////////
	// method
	
	@Override
	public boolean joinMember(TotoMemberDTO dto) {
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		int count = 0;
		
		String sql = " insert into toto_member(t_id, t_pw, t_name, t_nick, t_birth, t_mail, t_point, t_auth, t_pimg)"
				+ " values(?, ?, ?, ?, ?, ? , 10000000, 3, ?) "; 
		
		try {
			conn = TotoDB.getConnection();
			psmt = conn.prepareStatement(sql);
			int i = 1;
			psmt.setString(i++, dto.gettId());
			psmt.setString(i++, dto.gettPw());
			psmt.setString(i++, dto.gettName());
			psmt.setString(i++, dto.gettNick());
			psmt.setString(i++, dto.gettBirth());
			psmt.setString(i++, dto.gettMail());
			psmt.setString(i++, dto.gettPimg());
			
			count = psmt.executeUpdate();
			
			log("join complete!");
		} catch (Exception e) {
			log("join failed!", e);
		}finally{
			TotoDB.close(conn, psmt, null);
			log("close-joinMember-complete!");
		}
		return count > 0? true:false;
	}
	
	
	/////////	/////////	/////////	/////////	/////////	/////////	/////////	/////////
	//log confirm 
	public void log(String msg) {
		if(isS){
			System.out.println(this.getClass() + ":" + msg);
		}
	}
	
	public void log(String msg, Exception e){
		if(isS){
			System.out.println(e + " : " + this.getClass() + " : " + msg);
		}
	}
	
	
	
}

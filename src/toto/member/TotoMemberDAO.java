package toto.member;

import toto.db.TotoDB;

public class TotoMemberDAO {
	private static TotoMemberDAO memDAO;
	public static TotoMemberDAO getInstance() {
		if(memDAO == null){
			memDAO = new TotoMemberDAO();
		}
		return memDAO;
	}
	
	
	
	
}

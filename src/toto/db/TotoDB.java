package toto.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TotoDB {
	

	private TotoDB(){}
	
	static{
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver Loading Sucoess!!!");
			}catch(ClassNotFoundException e){
				System.out.println("Driver Loading fail");
				System.out.println(e.getMessage());
			} 
	}
	
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "hr";

		conn = DriverManager.getConnection(url, user, passwd);
		return conn;
	}

	public static void close(Connection conn, Statement psmt, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
			}
		}
		if (psmt != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
	}
}

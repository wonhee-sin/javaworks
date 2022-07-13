package dbconnect.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtill {
	
	private static String driverclass = "oracle.jdbc.OracleDriver";	
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String username = "system";
	private static String password = "12345";
	
	public static Connection getConnection() {
		try {
			Class.forName(driverclass);
			return DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close (Connection conn, PreparedStatement pstmt, ResultSet rs) {
		
		if(rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pstmt = null;
			}
		}
		
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}
	}
	
	
}

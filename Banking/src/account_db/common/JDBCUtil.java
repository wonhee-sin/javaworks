package account_db.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//오라클 DB와 연결
public class JDBCUtil {
	private static String driverClass = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String username = "system";
	private static String password = "12345";
	
	//DB 연결 메서드
	public static Connection getConnection() {
		try {
			Class.forName(driverClass);
			return DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}//catch 문 닫음
		return null;
	}//getConnection 메서드 닫음
	
	//DB 연결 종료 메서드
	public static void close (Connection conn, PreparedStatement pstmt) {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pstmt = null;
			} // finally문 닫기
		}//if문 닫기
		
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}//finally 닫기
		}//if문 닫기
	}//close 종료 메소드 닫기
	
	//DB 연결 종료 메서드 - Resultset 사용하는 경우
		public static void close (Connection conn, PreparedStatement pstmt, ResultSet rs) {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					pstmt = null;
				} // finally문 닫기
			}//if문 닫기
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					conn = null;
				}//finally 닫기
			}//if문 닫기
			
			if(rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					rs = null;
				}//finally 닫기
			}//if문 닫기
		}//close 종료 메소드 닫기
	
}//클래스 닫음

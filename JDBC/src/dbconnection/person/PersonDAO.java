package dbconnection.person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dbconnection.common.JDBCUtil;

public class PersonDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public void insertPerson(Person person) {
		try {
			conn = JDBCUtil.getConnection();
			String sql = "INSERT INTO person (userId, userPw, name, age) VALUES (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserId());
			pstmt.setString(2, person.getUserPw());
			pstmt.setString(3, person.getName());
			pstmt.setInt(4, person.getAge());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	public ArrayList<Person> getPersonList(){
		ArrayList<Person> personList = new ArrayList<>();
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM person";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Person person = new Person();
				person.setUserId(rs.getString("userId"));
				person.setUserPw(rs.getString("userPw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				
				personList.add(person);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return personList;	
	}
	
	public void updatePerson(Person person) {
		try {
			conn = JDBCUtil.getConnection();
			String sql = "UPDATE person SET userPw = ?, name = ?, age = ? WHERE userId = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserPw());
			pstmt.setString(2,  person.getName());
			pstmt.setInt(3,  person.getAge());
			pstmt.setString(4,  person.getUserId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	public void deletePerson (Person person) {
		try {
			conn = JDBCUtil.getConnection();
			String sql = "DELETE FROM person WHERE userId = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,person.getUserId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	public Person getPerson(String userId) {
		Person person = new Person();
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM person WHERE userid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				person.setUserId(rs.getString("userId"));
				person.setUserPw(rs.getString("userPw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return person;
	}
	

	
	
	
	
	
}

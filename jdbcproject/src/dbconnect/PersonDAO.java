package dbconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dbconnect.common.JdbcUtill;

public class PersonDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	
	
	
	
	
	public void insertPerson(Person person) {
		
	}
	
	
	public ArrayList<Person> getPersonList() {
		ArrayList<Person> personList = new ArrayList<>();
		try {
			conn = JdbcUtill.getConnection();
			String sq1 = "SELECT * FROM person";
			pstmt = conn.prepareStatement(sq1);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Person person = new Person();
				person.setuserId(rs.getString("userId"));
				person.setuserpw(rs.getString("userpw"));
				person.setname(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				
				personList.add(person);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				JdbcUtill.close(conn, pstmt, rs);
			}
		return personList;
	}
}

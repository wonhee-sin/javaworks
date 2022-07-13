package dbconnection.person;

public class PersonMain  {
	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
		Person p1 = new Person();
		
//		p1.setAge(25);
//		p1.setName("kimkim");
//		p1.setUserId("kimrm");
//		p1.setUserPw("kim1234");
		
//		dao.insertPerson(p1);
		
//		dao.updatePerson(p1);
		
//		dao.getPerson("kimrm");
		dao.getPersonList().toArray();
		dao.getPerson("kimrm");
		System.out.println(dao.getPersonList());
	}
}

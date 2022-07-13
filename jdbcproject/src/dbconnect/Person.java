package dbconnect;

public class Person {
	private String userId;
	private String userpw;
	private String name;
	private int age;
	
	//setter, getter
	
	public String getuserId() {
		return userId;
	}
	
	public void setuserId (String userId) {
		this.userId = userId;
	}
	
	public String getuserpw() {
		return userpw;
	}
	
	public void setuserpw (String userpw) {
		this.userpw = userpw;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname (String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
}

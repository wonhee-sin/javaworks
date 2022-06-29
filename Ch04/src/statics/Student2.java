package statics;

public class Student2 {
	private static int serialNum = 1000;
	private int id;			//학번
	private String name;	//이름
	
	public Student2() {
		serialNum++;
		id = serialNum;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}

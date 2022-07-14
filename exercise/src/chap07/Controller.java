package chap07;

public class Controller {
	//필드
	public MemberService service;
	
	//매개변수의 다형성
	public void setService(MemberService service) {
		this.service = service;
	}
}

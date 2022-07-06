package innerinterface;

public class Calllistener implements Button.OnClickListener {
	//Button 클래스의 OnClickListener에 접근 > 구현 클래스 만들기
	
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
	
}

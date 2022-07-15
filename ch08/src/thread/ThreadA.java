package thread;

//스레드 만드는 방법
public class ThreadA extends Thread {
	
	public ThreadA () {
		setName("ThreadA");	//이름 설정
	}

	@Override
	public void run() {
		System.out.println(getName() + "가 출력한 내용");
		super.run();
	}
	
	
}

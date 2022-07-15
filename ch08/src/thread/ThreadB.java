package thread;

//스레드 만드는 방법
public class ThreadB extends Thread {
	
	public ThreadB () {
	}

	@Override
	public void run() {
		System.out.println(getName() + "가 출력한 내용");
		super.run();
	}
	
	
}

package chap07;

public class Test7_3 {

	public static void main(String[] args) {
		// 1. O, O, O, X
		//추상클래스엔 추상메서드가 없을 수도 있음
		
		// 2. O, O, O, X
		//추상메서드가 있으면 추상 클래스임
		
		//3.
		method(new LoginServlet());
		method(new FileDownloadServlet());

	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}

package nestedclass;

class OutClass{
	int num = 10;
	static int sNum = 20;
	
	static class inClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println(inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println(sInNum + "(내부 클래스의 정적 변수 사용)");
		}
		static void sTest() {
			//num += 20;
			//inNum += 10;
			System.out.println(sNum + "(외부 클래스의 정적 변수 사용");
			System.out.println(sInNum + "(내부 클래스의 정적 변수 사용");
		}
	}
}


public class StaticInnerClass {

	public static void main(String[] args) {
		OutClass.inClass inclass = new OutClass.inClass();
		
		System.out.println("정적 내부 클래스의 일반 메서드 호출");
		inclass.inTest();
		
		System.out.println("정적 내부 클래스의 정ㅈ거 메서드 호출");
		OutClass.inClass.sTest();

	}

}

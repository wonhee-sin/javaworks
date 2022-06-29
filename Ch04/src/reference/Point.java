package reference;

public class Point {
	//점 클래스
	//필드
	int x, y;
	
	//생성자
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showInfo() {
		System.out.printf("x : %d, y : %d\n",x,y);
	}
}

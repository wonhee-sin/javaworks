package object.clone;

public class Circle implements Cloneable { //clone()을 사용하려면 Cloneable 인터페이스르 구현해야 함
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		point = new Point(x,y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		
		return "중심점 : (" + point + ") 반지름 : " + radius;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
	
}

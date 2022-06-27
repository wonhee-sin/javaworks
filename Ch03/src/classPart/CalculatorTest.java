package classPart;

public class CalculatorTest {

	public static void main(String[] args) {
		//Calculator 사용
		Calculator calc = new Calculator();
		
		int add = calc.add(10, 20);
		System.out.println(add);
		
		int sub = calc.sub(50, 30);
		System.out.println(sub);

		int mul = calc.mul(50, 30);
		System.out.println(mul);
		
		double div = calc.div(60, 30);
		System.out.println(div);
	}

}

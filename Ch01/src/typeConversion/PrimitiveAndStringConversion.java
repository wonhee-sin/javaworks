package typeConversion;

public class PrimitiveAndStringConversion {

	public static void main(String[] args) {
		int val1 = Integer.parseInt("10");
		double val2 = Double.parseDouble("3.14");
		boolean val3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + val1);
		System.out.println("value2: " + val2);
		System.out.println("value3: " + val3);
		
		System.out.println(val1 + val2);
		if (val3) {
			System.out.println("true");
		}
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		System.out.println(str1 + str2 + str3);
	}

}

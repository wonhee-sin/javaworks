package chap05;

public class Test5_1 {

	public static void main(String[] args) {
		//1. O, O, O, X
		
		//2. O, O, X, O
		
		//3. O, X, O, O
		
		//4. O, O, O, X
		
		//5. 
		int var1 = 10;
		int var2 = 10;
		String var3 = "AB";
		String var4 = "AB";
		String var5 = new String("AB");
		
		System.out.println(var1 == var2);  //true
		System.out.println(var1 != var2);  //false
		System.out.println(var3 == var4);  //true
		System.out.println(var3 != var5);  //true
		System.out.println(var4.equals(var5)); //true
	}

}

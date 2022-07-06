package exception;

public class ExeceptionExample3 {

	public static void main(String[] args) {
		
		String data = null;
		//System.out.println(data.toString());  //NullpointerException 발생
		
		System.out.println("======================================");
		
		
		
		int[] num = new int[2];
		
		num[0] = 1;
		num[1] = 1;
		//num[2] = 1;
		
		//ArrayIndexOutOfBoundsException
		System.out.println("완료");
		
		
		
		System.out.println("=======================================");
		
		String data1 = "100";
		String data2 ="a200";
		
		int value1 = Integer.parseInt(data1);
		//int value2 = Integer.parseInt(data2);	//NumberFormatException 발생
		
		//int result = value1 + value2;
		//System.out.println(data1 + " + " + data2 + " = " + result );

	}

}

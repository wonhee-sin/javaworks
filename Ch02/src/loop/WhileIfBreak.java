package loop;

public class WhileIfBreak {
	public static void main(String[] args) {
		//반복 조건문
		 int i = 0;
		 while(true) {
			 i++;
			 System.out.println("hello" + i);
			 if(i == 10)
				 break;
		 }
		 System.out.println("==========================================");
		 
		 //1부터 10까지 더하기
		 int n = 0;
		 int sum = 0;
		 while(true) {
			 n++;
			 sum += n;
			 if (n == 10)
				 break;
		 }
		 System.out.println(sum);
	}
}

package operator;

public class operator1 {

	public static void main(String[] args) {
		// 대입 연산자
		int num = 10;
		
		System.out.println(num);
		System.out.println(-num);
		
		//값 변경
		num = -num;
		System.out.println(num);
		
		String season = "summer";
		System.out.println(season);
		
		//배열
		String[] seasons = {"spring", "summer" , "fall", "winter"};
		System.out.println(seasons[0]);
		System.out.println(seasons[3]);
		System.out.println("============================================");
		System.out.println(seasons.length + "개");
		
		int i;
		for(i=0;i<seasons.length;i++) {
			System.out.print(seasons[i] + " ");
		}
	}

}

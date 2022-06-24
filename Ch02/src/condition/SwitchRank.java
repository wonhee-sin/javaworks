package condition;

public class SwitchRank {
	public static void main(String[] args) {
		//순위에 따른 메달 색깔 출력하기
		
		int rank = 2;
		char medalColor;
		
		switch(rank) {
		case 1:
			medalColor = '6';
			break;
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = 'A';
			break;
		}
		
		System.out.printf("메달 색깔은 %s 입니다.",medalColor);
	}
}

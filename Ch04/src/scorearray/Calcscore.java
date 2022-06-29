package scorearray;

import java.util.Scanner;

public class Calcscore {

	public static void main(String[] args) {
		boolean run = true; // 실행함수
		int studentNum = 0; // 학생수(배열의 크기)
		int[] score = null; //정수 배열
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1. 학생 수 | 2.점수 입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택>");
			try{
				int selecNo = Integer.parseInt(scan.nextLine());
				
				if(selecNo == 1) {
					System.out.print("학생 수>");
					studentNum = Integer.parseInt(scan.nextLine()); //학생수
					score = new int[studentNum]; //학생 수 만큼 배열의 크기 선언
				}else if (selecNo == 5) {
					run = false;
				}else if (selecNo == 2) {
					for (int i = 0; i < score.length; i++) {
						System.out.print("score[" + i + "]");
						score[i] = Integer.parseInt(scan.nextLine());
					}
				}else if (selecNo == 3) {
					System.out.print("{ ");
					for (int i = 0; i < score.length; i++) {
						System.out.print(score[i] + " ");
					}
					System.out.print("}");
					System.out.println();
				}else if (selecNo == 4) {
					//총점
					int sum = 0;
					for(int i = 0; i < score.length; i ++) {
						sum += score[i];
					}
					//최고 점수
					int max = 0;
					for (int i = 0; i < score.length; i++) {
						if (max < score[i]) {
							max = score[i];
						}
					}
					//평균
					double avg = (double)sum / score.length;
					System.out.printf("총합은 %d, 최고점수는 %d, 평균은 %.2f\n", sum, max, avg);
				}else {
					System.out.println("지원되지 않는 기능입니다. 다시 선택하세요");
				}
			}catch(Exception e) {
			System.out.println("올바른 선택이 아닙니다. 다시 선택하세요");
		}
		}// while 닫기
		System.out.println("프로그램 종료!!");
	}// mian 닫기

}

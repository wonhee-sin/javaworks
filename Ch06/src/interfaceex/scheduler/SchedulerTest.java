package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 배분 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 배분");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에개 배분");
		System.out.println("P : 우선 순위가 높은 고객 먼저 할당");
		
		int ch = System.in.read(); //할당방식을 입력받아 ch에 대입 read()메서드는 한 글자를 입력받는 메서드
		Scheduler scheduler = null;
		
		if (ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin(); //다형성으로 생성
		} else if (ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		} else if (ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
			return ;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}

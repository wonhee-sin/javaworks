package collection.stack;

import java.util.Stack;

public class StackCoinTest {

	public static void main(String[] args) {
		
		//dao - Stack
		Stack<Coin> coinBox = new Stack<>();
		
		//Coin 객체 생성
		Coin coin500 = new Coin(500);
		Coin coin100 = new Coin(100);
		Coin coin50 = new Coin(50);
		Coin coin10 = new Coin(10);
		
		//스택에서 동전 넣기 
		coinBox.push(coin500); 		//0번 인덱스
		coinBox.push(coin100);		//1번 인덱스
		coinBox.push(coin50);		//2번 인덱스
		coinBox.push(coin10);		//3번 인덱스
		
		//스택에서 동전 빼기
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
			}

	}

}

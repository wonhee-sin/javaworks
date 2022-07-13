package generic;

import java.util.ArrayList;

public class GenericTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("grape");
		list.add("egg");
		list.add("coffee");
		
		String str1 = list.get(0);
		System.out.println(str1);
		
		//왜 제네릭 프로그래밍을 하는가? 타입을 정해주지 않으면 Object로 됨
		ArrayList cart = new ArrayList<>();
		cart.add("grape");
		cart.add("egg");
		cart.add("coffee");
		
		String str2 = (String)list.get(0);	//다운캐스팅 - 형변환 해야함
		System.out.println(str2);
	}
}

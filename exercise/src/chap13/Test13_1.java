package chap13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test13_1 {

	public static void main(String[] args) {
		// 1. O, O, O, X
		
		// 2. O, O, X, O
		
		// 3. O, O, O, X
		
		// 4. 4
		
		// 5. 
		List<Board> arrayList = new ArrayList<>();
		
		//6.
		Map<String, Integer> hashMap = new HashMap<>();
		
		//7. 
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
		
		//8.
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
		
		//향상 for
		for(Student student : set) {
			System.out.println(student.studentNum + ":" + student.name);
		}
		
		//9.
		
	}

}













package arrayList;

import java.util.ArrayList;
import reference.Subject;

public class Student {
	
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	//과목 추가 메서드
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < subjectList.size(); i++) {
			Subject subject = subjectList.get(i);
			sum += subject.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + 
						subject.getSubjectName() + " 과목 성적은 " + 
						subject.getScorePoint() + "점입니다." );
		}
		System.out.println("총점 :"+ sum);
		avg = (double)sum/subjectList.size();
		System.out.printf("평균 :%.2f\n", avg);
		System.out.println();
		
	}
}

package collection.member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//DAO 생성
public class MemberHashSet {

	private Set<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	//회원 추가
	public void addMember (Member member) {
		hashSet.add(member);
	}
	
	//회원 목록 보기
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		
		 /* Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			System.out.println(member);
		} */
	}
	
	//회원 삭제
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int dbMemberId = member.getMemberId();
			if(dbMemberId == memberId) {	//외부 입력 memeberId와 같다면
				hashSet.remove(member); // 회원 객체 삭제
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
}

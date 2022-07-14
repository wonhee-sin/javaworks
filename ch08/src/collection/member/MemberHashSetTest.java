package collection.member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		//객체 생성
		MemberHashSet memberHashSet = new MemberHashSet();
		
		//회원 추가
		
		memberHashSet.addMember(new Member(1001, "Naver"));
		memberHashSet.addMember(new Member(1002, "Kakao"));
		memberHashSet.addMember(new Member(1003, "NCsoft"));
		memberHashSet.addMember(new Member(1001, "Naver"));	//중복 불가
		
		//회원 목록 조회
		memberHashSet.showAllMember();
		System.out.println("==============================================");
		
		//회원 삭제
		memberHashSet.removeMember(1003);
		memberHashSet.removeMember(1004);
		
		//회원 목록 조회
		memberHashSet.showAllMember();
		
	}
}

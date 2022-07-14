package collection.member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		//mHashMap 객체 생성
		MemberHashMap mHashMap = new MemberHashMap();
		
		//회원 추가
		//key : 중복 불가 , value는 변경가능
		mHashMap.addMember(new Member(1004, "Samsung"));
		mHashMap.addMember(new Member(1002, "LG"));
		mHashMap.addMember(new Member(1003, "Naver"));
		mHashMap.addMember(new Member(1001, "Kakao"));
		mHashMap.addMember(new Member(1002, "Hyundai"));	
		
		//회원 목록 조회
		mHashMap.showAllMember();
		System.out.println("=====================================");
		
		mHashMap.removeMember(1001);
		mHashMap.removeMember(1005);
		
		//조회
		mHashMap.showAllMember();
		
	}
}

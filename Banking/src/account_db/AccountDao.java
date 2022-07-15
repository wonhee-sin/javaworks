package account_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import account_db.common.JDBCUtil;

public class AccountDao {
	//jdbc 관련 변수 선언
	
	private Scanner scanner = new Scanner(System.in);
	
	//계좌 생성
	public void CreateAccount() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		System.out.println("-------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.next();
			if(findAccount(ano) != null || findDeletedAccount(ano) != null) {
				System.out.println("중복 계좌입니다. 다시 입력하세요");
			}else {
				System.out.print("계좌주: ");
				String owner = scanner.next();
				while(true) {
					System.out.print("초기입금액: ");
					int balance = scanner.nextInt();
					if(balance < 100) {
						System.out.println("초기 입금액은 100원 이상입니다. 다시 입력하세요");
					}else {
						//db 연동
						try {
							conn = JDBCUtil.getConnection();
							String sql = "INSERT INTO account(ano, owner, balance) VALUES (?, ?, ?)";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, ano);
							pstmt.setString(2, owner);
							pstmt.setInt(3, balance);
							pstmt.executeUpdate();
							System.out.println("결과 : 계좌가 생성되었습니다.");
							break;
						} catch (Exception e) {
							e.printStackTrace();
						} finally {
							JDBCUtil.close(conn, pstmt);
						}
					}
				}
				break;
			}
		}
	}
	
	//목록 보기
	public List<Account> getAccountList(){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<Account> accountlist = new ArrayList<>();
		
		System.out.println("-------------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("-------------------------------------------");
		
		//db연결
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				Account account = new Account(ano, owner, balance);
				accountlist.add(account);
			}//while문 닫기
			for(int i = 0; i < accountlist.size(); i++) {
				Account account = accountlist.get(i);
				System.out.print("계좌 번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔액: " + account.getBalance() + "\t");
			}//for문 닫기
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		return accountlist;
	}
	
	//예금
	public void deposit() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		System.out.println("-------------------------------------------");
		System.out.println("예금");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호 : (돌아가기 '0'키 입력)");
			String ano = scanner.next();
			if(ano.equals("0")) {
				break;
			}else {
			if(findAccount(ano) == null) { //검색 계좌가 없으면
		    	System.out.println("계좌가 없습니다. 다시 입력하세요");	
		    }else {
				while(true) {
					System.out.print("입금액: ");
					int money = scanner.nextInt();
					if(money < 0) {
						System.out.println("음수로 입력할 수 없습니다. 다시 입력하세요");
					}else {
						try {
							conn = JDBCUtil.getConnection();
							String sql = "UPDATE account SET balance = balance + ? WHERE ano = ?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setInt(1, money);
							pstmt.setString(2, ano);
							pstmt.executeUpdate();
							System.out.printf("%,d원 정상 입금되었습니다.\n", money);
							break;
						} catch (Exception e) {
							e.printStackTrace();
						}finally {
							JDBCUtil.close(conn, pstmt);
						}
					}
				}//안쪽 while 닫기
				break;
		    }
		}
		}
	}
	
	//출금
	public void withdrow() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		System.out.println("-------------------------------------------");
		System.out.println("출금");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호 : (돌아가기 '0'키 입력)");
			String ano = scanner.next();
			if(ano.equals("0")) {
				break;
			}else {
				if(findAccount(ano) == null) { //검색 계좌가 없으면
					System.out.println("계좌가 없습니다. 다시 입력하세요");	
				}else {
					while(true) {
						conn = JDBCUtil.getConnection();
						System.out.print("출금액: ");
						int money = scanner.nextInt();
						if(findAccount(ano).getBalance() <= 0) {
							System.out.println("잔액이 없습니다. 초기화면으로 돌아갑니다.");
							break;
						}else if(money > findAccount(ano).getBalance()) {
							System.out.println("잔액이 부족합니다. 다시 입력하세요");
						}else if(money < 0) {
							System.out.println("음수로 입력할 수 없습니다. 다시 입력하세요");
						}else {
							try {
								String sql = "UPDATE account SET balance = balance - ? WHERE ano = ?";
								pstmt = conn.prepareStatement(sql);
								pstmt.setInt(1, money);
								pstmt.setString(2, ano);
								pstmt.executeUpdate();
								System.out.printf("%,d원 정상 입금되었습니다.\n", money);
								break;
							} catch (Exception e) {
								e.printStackTrace();
							}finally {
								JDBCUtil.close(conn, pstmt);
							}
						}
					}//안쪽 while 닫기
					break;
				}
			}
		}
	}
	
	//계좌 조회
	public void searchAccount() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		System.out.println("-------------------------------------------");
		System.out.println("계좌조회");
		System.out.println("-------------------------------------------");
		while(true) {
			System.out.print("계좌 번호: (뒤로가기 '0' 입력)");
			String ano = scanner.next();
			if(ano.equals("0")) {
				break;
			}else {
			if(findAccount(ano) == null) {
				System.out.println("계좌가 없습니다. 다시 입력하세요");
			}else {
				Account account = findAccount(ano);
				System.out.print("계좌 번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔액: " + account.getBalance() + "\t");
				break;
			}
		}
		}
		
		
	}
	
	//계좌 삭제
	public void deleteAccount() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		System.out.println("-------------------------------------------");
		System.out.println("계좌삭제");
		System.out.println("-------------------------------------------");
		while(true) {
			System.out.print("계좌 번호: (뒤로가기 '0' 입력)");
			String ano = scanner.next();
			if(ano.equals("0")) {
				break;
			}else {
			if(findAccount(ano) == null) {
				System.out.println("계좌가 없습니다. 다시 입력하세요");
			}else {
				try {
				conn = JDBCUtil.getConnection();
				String sql = "INSERT INTO deletedaccount (ano, owner, balance) VALUES (?, ?, ?)";
				
					Account account = findAccount(ano);
				    pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, account.getAno());
					pstmt.setString(2, account.getOwner());
					pstmt.setInt(3, account.getBalance());
					pstmt.executeUpdate();
				} catch(Exception e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
				
				try {
					conn = JDBCUtil.getConnection();
					String sql = "DELETE FROM account WHERE ano = ?";
					
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, ano);
					pstmt.executeUpdate();
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					JDBCUtil.close(conn, pstmt);
				}
				break;
			}
		}
		}
	}
	
	public void restore() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		System.out.println("-------------------------------------------");
		System.out.println("계좌 복구");
		System.out.println("-------------------------------------------");
		while(true) {
			System.out.print("계좌 번호: (뒤로가기 '0' 입력)");
			String ano = scanner.next();
			if(ano.equals("0")) {
				break;
			}else {
			if(findDeletedAccount(ano) == null) {
				System.out.println("계좌가 없습니다. 다시 입력하세요");
			}else {
				try {
				conn = JDBCUtil.getConnection();
				String sql = "INSERT INTO account (ano, owner, balance) VALUES (?, ?, ?)";
				
					Account account = findDeletedAccount(ano);
				    pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, account.getAno());
					pstmt.setString(2, account.getOwner());
					pstmt.setInt(3, account.getBalance());
					pstmt.executeUpdate();
				} catch(Exception e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
				
				try {
					conn = JDBCUtil.getConnection();
					String sql = "DELETE FROM deletedaccount WHERE ano = ?";
					
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, ano);
					pstmt.executeUpdate();
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					JDBCUtil.close(conn, pstmt);
				}
				break;
			}
		}
		}
	}
	
	//계좌 찾기
	private Account findAccount(String ano) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Account account = null;
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				account = new Account(ano, owner, balance);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return account;
	}
	
	private Account findDeletedAccount(String ano) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Account account = null;
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM deletedaccount WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				account = new Account(ano, owner, balance);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return account;
	}
	
}

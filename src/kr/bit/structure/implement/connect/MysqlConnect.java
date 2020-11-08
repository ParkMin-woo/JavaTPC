package kr.bit.structure.implement.connect;

public class MysqlConnect implements DbConnect {
	@Override
	public void getConnection(String url, String userId, String pwd) {
		System.out.println("url : " + url);
		System.out.println("userId : " + userId);
		System.out.println("pwd : " + pwd);
		System.out.println("Mysql DB에 접속되었습니다.");
	}
}

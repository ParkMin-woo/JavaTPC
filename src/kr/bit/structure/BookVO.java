package kr.bit.structure;

public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	public BookVO() {
		// 초기화 작업
		// ※ 현재까지 실무에서 이렇게 쓰는것을 본 적이 없다...;;;
		/*
		title = "클라우스 슈밥의 제4차 산업혁명";
		price = 15000;
		company = "새로운현재";
		page = 287;
		*/
	}
	
	// 생성자의 중복정의(Overloading)
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}

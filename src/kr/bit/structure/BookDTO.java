package kr.bit.structure;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	// 추가
	public BookDTO() {
		// 객체를 생성하는 작업을 한다.(기계어코드)
		super();
	}
	
	/*
	public BookDTO(String title2, int price2, String company2, int page2) {
		// TODO Auto-generated constructor stub
	}
	*/

	/**
	 * @param title
	 * @param price
	 * @param company
	 * @param page
	 */
	public BookDTO(String title, int price, String company, int page) {
		// super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
}

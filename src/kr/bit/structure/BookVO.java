package kr.bit.structure;

public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	public BookVO() {
		// �ʱ�ȭ �۾�
		// �� ������� �ǹ����� �̷��� ���°��� �� ���� ����...;;;
		/*
		title = "Ŭ��콺 ������ ��4�� �������";
		price = 15000;
		company = "���ο�����";
		page = 287;
		*/
	}
	
	// �������� �ߺ�����(Overloading)
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}

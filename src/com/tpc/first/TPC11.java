package com.tpc.first;

import kr.bit.structure.BookDTO;

public class TPC11 {
	public static void main(String[] args) {
		
		// å 1���� �����ϱ� ���ؼ� [��ü�� ����]�Ͻÿ�.
		BookDTO book = new BookDTO();
		book.title = "SQL ù����";
		book.price = 22000;
		book.company = "�Ѻ��̵��";
		book.page = 367;
		System.out.print("title\tprice\tcompany\tpage\n");
		System.out.print(book.title + "\t" + book.price + "\t" + book.company + "\t" + book.page + "\n");
	}
}

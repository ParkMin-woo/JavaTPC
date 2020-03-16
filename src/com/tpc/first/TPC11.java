package com.tpc.first;

import kr.bit.structure.BookDTO;

public class TPC11 {
	public static void main(String[] args) {
		
		// 책 1권을 저장하기 위해서 [객체를 생성]하시오.
		BookDTO book = new BookDTO();
		book.title = "SQL 첫걸음";
		book.price = 22000;
		book.company = "한빛미디어";
		book.page = 367;
		System.out.print("title\tprice\tcompany\tpage\n");
		System.out.print(book.title + "\t" + book.price + "\t" + book.company + "\t" + book.page + "\n");
	}
}

package com.tpc.first;

import kr.bit.structure.BookDTO;

public class TPC14 {
	public static void main(String[] args) {
		// 책 -> Class(BookDTO) -> 객체 -> 인스턴스
		String title = "스프링";
		int price = 25000;
		String company = "제이펍";
		int page = 890;
		
		BookDTO b1;		// Object(객체)
		b1 = new BookDTO(title , price, company, page);		// Instance
		
		bookPrint(b1);
	}
	
	// branch test중
	public static void bookPrint(BookDTO b) {
		System.out.println("b = " + b);
		System.out.println("b.title = " + b.title);
		System.out.println("b.price = " + b.price);
		System.out.println("b.company = " + b.company);
		System.out.println("b.page = " + b.page);
	}
}

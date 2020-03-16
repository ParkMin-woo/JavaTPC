package com.tpc.first;

import kr.bit.structure.BookDTO;

public class TPC14 {
	public static void main(String[] args) {
		// √• -> Class(BookDTO) -> ∞¥√º -> ¿ŒΩ∫≈œΩ∫
		String title = "Ω∫«¡∏µ";
		int price = 25000;
		String company = "¡¶¿Ã∆‡";
		int page = 890;
		
		BookDTO b1;		// Object(∞¥√º)
		b1 = new BookDTO(title , price, company, page);		// Instance
		
		bookPrint(b1);
	}
	
	public static void bookPrint(BookDTO b) {
		System.out.println("b = " + b);
		System.out.println("b.title = " + b.title);
		System.out.println("b.price = " + b.price);
		System.out.println("b.company = " + b.company);
		System.out.println("b.page = " + b.page);
	}
}

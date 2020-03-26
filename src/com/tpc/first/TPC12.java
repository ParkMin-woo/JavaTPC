package com.tpc.first;

import kr.bit.structure.BookVO;

public class TPC12 {
	public static void main(String[] args) {
		// 생성자 -> 객체를 생성하고 초기화
		//      -> 중복정의 가능
		// BookVO 객체 생성
		BookVO b1 = new BookVO();
		System.out.println("==========b1===============");
		System.out.println("b1 = " + b1);
		System.out.println("==========값을 넣기 전의 b1이 참조하는 객체(?)의 field값들===============");
		System.out.println("b1.title = " + b1.title);
		System.out.println("b1.price = " + b1.price);
		System.out.println("b1.company = " + b1.company);
		System.out.println("b1.page = " + b1.page);
		b1.title = "클라우스 슈밥의 제4차 산업혁명";
		b1.price = 15000;
		b1.company = "새로운현재";
		b1.page = 287;
		System.out.println("==========값을 넣은 후의 b1이 참조하는 객체(?)의 field값들===============");
		System.out.println("b1.title = " + b1.title);
		System.out.println("b1.price = " + b1.price);
		System.out.println("b1.company = " + b1.company);
		System.out.println("b1.page = " + b1.page);
		/*
		System.out.println("==========b1===============");
		System.out.println("b1 = " + b1);
		System.out.println("==========b1 객체(?)의 field값들===============");
		// b1.title = "누구나 쉽게 SQL";
		// System.out.println("만약에 초기화된 title의 값을 바꾸면???");
		System.out.println("b1.title = " + b1.title);
		System.out.println("b1.price = " + b1.price);
		System.out.println("b1.company = " + b1.company);
		System.out.println("b1.page = " + b1.page);
		*/
		
		// BookVO(String title, int price, String company, int page)
		BookVO b2 = new BookVO("사람이 먼저다", 15000, "퍼플카우" , 350);
		System.out.println("");
		System.out.println("==========b2===============");
		System.out.println("b2 = " + b2);
		System.out.println("==========b2 객체(?)의 field값들===============");
		System.out.println("b2.title = " + b2.title);
		System.out.println("b2.price = " + b2.price);
		System.out.println("b2.company = " + b2.company);
		System.out.println("b2.page = " + b2.page);

		/*
		BookVO b3 = new BookVO();
		System.out.println("==========b3===============");
		System.out.println("b3 = " + b3);
		System.out.println("b3.title = " + b3.title);
		System.out.println("b3.price = " + b3.price);
		System.out.println("b3.company = " + b3.company);
		System.out.println("b3.page = " + b3.page);
		*/

	}
}

package com.tpc.first;

import kr.bit.structure.BookDTO;

public class TPC10 {
	public static void main(String[] args) {
		// byte , short, int, long, char, float, double, boolean -> Primitive DataType
		int a;
		// System.out.println(a);
		a = 10;
		
		// 책이라는 자료형을 만들자. -> class
		// 객체 생성
		BookDTO b = new BookDTO();
		System.out.println("b => " + b);
		/*
		System.out.println("title => " + b.title);
		System.out.println("price => " + b.price);
		System.out.println("company => " + b.company);
		System.out.println("page => " + b.page);
		*/
		
		b.title = "이것이 자바다";
		b.price = 30000;
		b.company = "한빛미디어";
		b.page = 1222;
		System.out.println("title => " + b.title);
		System.out.println("price => " + b.price);
		System.out.println("company => " + b.company);
		System.out.println("page => " + b.page);
		// this().title = "사람이 먼저다";
	}
}

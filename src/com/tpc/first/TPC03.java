package com.tpc.first;

import kr.bit.structure.Book;
import kr.bit.structure.MemberVO;

public class TPC03 {
	public static void main(String[] args) {
		// 관계를 이해하라!
		// PDT VS UDDT
		// 정수 1개를 저장하기 위한 변수를 선언
		int a;
		a = 10;
		System.out.println("a => " + a + "\n");
		
		// 책 1권을 저장하기 위한 변수를 선언하시오.
		Book book;
		// new에 의하여 객체화
		book = new Book();
		
		book.company = "한빛미디어";
		book.title = "자바의 정석";
		book.price = 15000;
		book.page = 700;
		
		System.out.println("출판사 => " + book.company);
		System.out.println("제목 => " + book.title);
		System.out.println("가격 => " + book.price);
		System.out.println("페이지 => " + book.page + "\n");
		
//		회원 관리
		MemberVO member;
		member = new MemberVO();
		
		/*
		member.name = "김수영";
		member.age = 26;
		member.adress = "경기도 성남";
		member.job = "나이키 직원";
		member.height = 170.9f;
		member.weight = 50.12f;
		*/
		member.name = "강희애";
		member.age = 28;
		member.adress = "경기도 수원";
		member.job = "IT개발자";
		member.height = 160.9f;
		member.weight = 45.01f;
		System.out.println("이름 => " + member.name);
		System.out.println("나이 => " + member.age);
		System.out.println("주소 => " + member.adress);
		System.out.println("직업 => " + member.job);
		System.out.println("키 => " + member.height);
		System.out.println("몸무게 => " + member.weight);
	}
}
package com.tpc.first;

import com.google.gson.Gson;

// import kr.bit.structure.BookDTO;
import kr.bit.structure.MemberDTO;
import kr.bit.util.MyUtil;

public class TPC19 {
	public static void main(String[] args) {
		// 1. JAVA에서 제공해주는 Class들(API)
		// 문자열(String)
		String name = new String("JENNIE KANG");
		System.out.println("name : " + name);
		String nameLowerCase = name.toLowerCase();
		System.out.println("nameLowerCase : " + nameLowerCase);
		
		// 2. 직접 만들어서 사용하는 Class들(DTO/VO , DAO , Utility)
		MyUtil util = new MyUtil();
		int sum = util.sum();
		System.out.println("sum = " + sum);
		
		// 3. 다른 회사/개인이 만들어놓은 Class들
		// Gson -> Json      https://mvnrepository.com/
		Gson gson = new Gson();
		/*
		BookDTO book = new BookDTO("사람이 먼저다", 15000, "퍼플카우" , 350);
		System.out.println("book : " + book);
		String bookJson = gson.toJson(book);
		System.out.println("bookJson : " + bookJson);
		*/
		MemberDTO member = new MemberDTO("강희애", 28, "010-4876-8395", "서울 강남구");
		System.out.println(member);
		String memberJson = gson.toJson(member);
		System.out.println(memberJson);
	}
}

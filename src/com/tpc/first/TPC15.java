package com.tpc.first;

import kr.bit.structure.MemberDTO;

public class TPC15 {
	public static void main(String[] args) {
		// getter , setter method 테스트중
		MemberDTO member1 = new MemberDTO();
		
		member1.setName("박민우");
		System.out.println("name = " + member1.getName());
		member1.setAge(29);
		System.out.println("age = " + member1.getAge());
		member1.setTel("010-4801-5126");
		System.out.println("tel = " + member1.getTel());
		member1.setAddr("서울시 송파구");
		System.out.println("addr = " + member1.getAddr());
		
		System.out.println("toString() method call : " + member1.toString());
		
		MemberDTO member2 = new MemberDTO("강희애" , 28 , "010-4876-8395" , "서울 강남구");
		System.out.println(member2.toString());
		
		// 객체참조변수명만 써도 자동으로 toString 메서드가 호출됨
		// 아직은 왜그런지 모르겠음...;;;
		System.out.println(member2);
		System.out.println(member2.getClass());
		System.out.println(member2.getClass().getName());
	}
}
 
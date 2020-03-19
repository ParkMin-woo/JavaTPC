package com.tpc.first;

import kr.bit.structure.MemberDTO;

public class TPC15 {
	public static void main(String[] args) {
		// getter , setter method 테스트중
		MemberDTO member = new MemberDTO();
		
		member.setName("박민우");
		System.out.println("name = " + member.getName());
		member.setAge(29);
		System.out.println("age = " + member.getAge());
		member.setTel("010-4801-5126");
		System.out.println("tel = " + member.getTel());
		member.setAddr("서울시 송파구");
		System.out.println("addr = " + member.getAddr());
		
		System.out.println("toString() method call : " + member.toString());
	}
}
 
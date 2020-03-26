package com.tpc.first;

import kr.bit.structure.Inflearn01;
import kr.bit.structure.Inflearn02;

public class TPC13 {
	public static void main(String[] args) {
		
		// 생성자의 접근지정자가 private이라서 new에 의한 객체 생성은 불가능하다.
		// Inflearn01 inf = new Inflearn01();
		
		Inflearn01.java();
		
		// Inflearn01 클래스의 tpc() 메소드에 static이 붙어있지 않아서
		// 클래스명.메소드명으로 호출이 불가능.
		// Inflearn01.tpc();
		
		Inflearn02 inf02 = new Inflearn02();
		inf02.python();
		
		// Inflearn02 클래스의 생성자의 접근 지정자는 public(default constructor)
		// public 생성자가 붙어도 new에 의한 객체 생성 후에 static이 붙은 메소드, 필드로 접근할 수 있음.
		// 하지만 별로 권장하는 방법은 아닌 거 같음.
		inf02.oracle();
		Inflearn02.oracle();
		
		// Java API 중에서 접근지정자가 private인 생성자를 가진 API들
		// System sys = new System();
		System.out.println("제니강, 보고싶다... ㅜㅜ");
		double abstract1 = Math.abs(-11.1);
		System.out.println("abstract1 = " + abstract1);
		
		int maxNum = Math.max(930, 507);
		System.out.println("maxNum = " + maxNum);

	}
}

package com.tpc.first;

import kr.bit.structure.inheritance.JungSuk1;
import kr.bit.structure.inheritance.JungSuk2;

public class TPC25 {
	public static void main(String[] args) {
		JungSuk1 js = new JungSuk2();

		js.method1();
		js.method2();
		
		// 부모 클래스인 JungSuk1에 method3()가 없어서 실행이 안됨.
		// method3()는 자식 클래스인 JungSuk2의 고유 메서드.
		// js.method3();
		((JungSuk2)js).method3();
	}
}

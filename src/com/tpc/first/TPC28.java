package com.tpc.first;

import kr.bit.structure.inheritance.etc.Child1;
import kr.bit.structure.inheritance.etc.Parent1;

public class TPC28 {
	static void method1(Parent1 parent) {
		if(parent instanceof Child1) {
			Child1 child = (Child1) parent;
			System.out.println("이 객체는 Child1입니다. in method1()");
		}
		else {
			System.out.println("이 객체는 Parent1입니다. in method1()");
		}
	}
	
	static void method2(Parent1 parent) {
		Child1 child = (Child1) parent;
		System.out.println("이 객체는 Child1입니다. in method2()");
	}
	
	public static void main(String[] args) {

		Parent1 parentA = new Child1();
		method1(parentA);
		method2(parentA);
		
		Parent1 parentB = new Parent1();
		method1(parentB);
		// method2(parentB); // 무조건 Type 변환을 시도하려고 했기 때문에 ClassCastException Error가 발생한다.
							 // Type 변환을 시도할면 instanceof 연산자를 사용해서 어떤 Type인지 Check하는 것이 좋다.
	}
}

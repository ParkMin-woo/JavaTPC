package com.tpc.first;

import kr.bit.structure.inheritance.phone.Phone;
import kr.bit.structure.inheritance.phone.SmartPhone;
import kr.bit.structure.inheritance.phone.TelePhone;

// 이것이 자바다 추상클래스 선언 예제
public class TPC29 {
	public static void main(String[] args) {
		
		// Phone phone = new Phone();		// Phone 객체는 abstract class이기 때문에 new에 의한 객체생성이 불가능하다.
										    // class 앞에 abstract가 붙으면 java는 abstract class로 인식.
		String owner = "박민우";
		
		SmartPhone smartPhone = new SmartPhone(owner);
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		System.out.println("-----------------------------------");
		
		TelePhone telePhone = new TelePhone(owner);
		telePhone.turnOn();
		telePhone.autoAnswering();
		telePhone.turnOff();

	}
}

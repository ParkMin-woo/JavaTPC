package com.tpc.first;

import kr.bit.structure.inheritance.animal.Animal;
import kr.bit.structure.inheritance.animal.Dog;
import kr.bit.structure.inheritance.phone.Phone;
import kr.bit.structure.inheritance.phone.SmartPhone;
import kr.bit.structure.inheritance.phone.TelePhone;

// 이것이 자바다 추상클래스 선언 예제
public class TPC29 {
	public static void main(String[] args) {
		
		// Phone phone = new Phone();		// Phone 객체는 abstract class이기 때문에 new에 의한 객체생성이 불가능하다.
										    // class 앞에 abstract가 붙으면 java는 abstract class로 인식.
		String owner = "박민우";
		
		// SmartPhone smartPhone = new SmartPhone(owner);
		Phone smartPhone = new SmartPhone(owner);
		smartPhone.turnOn();
		((SmartPhone) smartPhone).internetSearch();
		smartPhone.turnOff();
		
		System.out.println("-----------------------------------");
		
		// TelePhone telePhone = new TelePhone(owner);
		Phone telePhone = new TelePhone(owner);
		telePhone.turnOn();
		((TelePhone) telePhone).autoAnswering();
		telePhone.turnOff();
		
		System.out.println("-----------------------------------");
		
		TPC29 tpc29 = new TPC29();
		tpc29.turnOnOrOff(smartPhone);
		tpc29.turnOnOrOff(telePhone);
		// Animal dog = new Dog();
		// tpc29.turnOnOrOff(dog);
	}
	
	// 2020.11.05 커밋 테스트
	public void turnOnOrOff(Phone phone) {
		if(phone instanceof SmartPhone) {
			phone.turnOn();
			((SmartPhone) phone).internetSearch();
			phone.turnOff();
			System.out.println("-----------------------------------");
		}
		else if(phone instanceof TelePhone) {
			phone.turnOn();
			((TelePhone) phone).autoAnswering();
			phone.turnOff();
			System.out.println("-----------------------------------");
		}
		else {
			System.out.println("이건 뭥미??? ㅋㅋㅋㅋ");
		}
	}
}

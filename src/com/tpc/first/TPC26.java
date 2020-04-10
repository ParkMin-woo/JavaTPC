package com.tpc.first;

import kr.bit.structure.inheritance.Car;
import kr.bit.structure.inheritance.HankookTire;
import kr.bit.structure.inheritance.KumhoTire;

// TPC26 예제 보완할 것!
public class TPC26 {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		// 타이어가 20번 돈다고 가정
		for(int i = 1 ; i <= 20 ; i++) {
			int problemLocation = myCar.run();
			
			switch(problemLocation) {
				case 1 :
					System.out.println("frontLeftTire는 HankookTire로 교체");
					myCar.frontLeftTire = new HankookTire(16 , "frontLeftTire");
					break;
				
				case 2 :
					System.out.println("frontRightTire는 KumhoTire로 교체");
					myCar.frontRightTire = new KumhoTire(20 , "frontRightTire");
					break;
				
				case 3 :
					System.out.println("backLeftTire는 HankookTire로 교체");
					myCar.backLeftTire = new HankookTire(12 , "backLeftTire");
					break;
				
				case 4 :
					System.out.println("backRightTire는 KumhoTire로 교체");
					myCar.backRightTire = new KumhoTire(24 , "backRightTire");
					break;
			}
			
			System.out.println("-------------------------------------");
		}
		
		/*
		myCar.run();
		myCar.run();
		myCar.run();
		myCar.run();
		myCar.run();
		myCar.run();
		myCar.frontLeftTire = new HankookTire(10, "frontLeftTire");
		myCar.run();
		myCar.run();
		myCar.run();
		myCar.run();
		myCar.frontRightTire = new KumhoTire(20, "frontRightTire");
		myCar.run();
		myCar.run();
		*/
	}
}

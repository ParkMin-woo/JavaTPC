package com.tpc.first;

import kr.bit.structure.inheritance.Car;
import kr.bit.structure.inheritance.HankookTire;
import kr.bit.structure.inheritance.KumhoTire;

// TPC26 예제 보완할 것!
public class TPC26 {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		// 타이어가 20번 돈다고 가정
		for(int i = 1 ; i <= 20 ; i++) {
			int problemLocation = myCar.run();
			
			for(int j = 0 ; j < myCar.tires.length ; j++) {
				if(j%2 == 0) {
					if(problemLocation == (j+1)) {
						System.out.println(myCar.tires[j].location + "는 HankookTire로 교체");
						myCar.tires[j] = new HankookTire(16 , myCar.tires[j].location);
						break;
					}
				}
				else if(j%2 == 1) {
					if(problemLocation == (j+1)) {
						System.out.println(myCar.tires[j].location + "는 KumhoTire로 교체");
						myCar.tires[j] = new HankookTire(20 , myCar.tires[j].location);
						break;
					}
				}
			}

			/*
			switch(problemLocation) {
				for(int j = 0 ; j < myCar.tires.length ; j++) {
					case (j+1) :
						System.out.println(myCar.tires[j].location + "는 HankookTire로 교체");
						myCar.tires[j] = new HankookTire(16 , myCar.tires[j].location);
						break;
				}
				case 1 :
					System.out.println("frontLeftTire는 HankookTire로 교체");
					// myCar.frontLeftTire = new HankookTire(16 , "frontLeftTire");
					myCar.tires[0] = new HankookTire(16 , "frontLeftTire");
					break;
				
				case 2 :
					System.out.println("frontRightTire는 KumhoTire로 교체");
					// myCar.frontRightTire = new KumhoTire(20 , "frontRightTire");
					myCar.tires[1] = new KumhoTire(20 , "frontRightTire");
					break;
				
				case 3 :
					System.out.println("backLeftTire는 HankookTire로 교체");
					// myCar.backLeftTire = new HankookTire(12 , "backLeftTire");
					myCar.tires[2] = new HankookTire(12 , "backLeftTire");
					break;
				
				case 4 :
					System.out.println("backRightTire는 KumhoTire로 교체");
					// myCar.backRightTire = new KumhoTire(24 , "backRightTire");
					myCar.tires[3] = new KumhoTire(24 , "backRightTire");
					break;
			}
			*/
			
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

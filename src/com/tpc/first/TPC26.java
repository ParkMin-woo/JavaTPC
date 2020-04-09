package com.tpc.first;

import kr.bit.structure.inheritance.Car;
import kr.bit.structure.inheritance.HankookTire;
import kr.bit.structure.inheritance.KumhoTire;

public class TPC26 {
	public static void main(String[] args) {
		Car myCar = new Car();
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
	}
}

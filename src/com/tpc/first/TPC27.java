package com.tpc.first;

import kr.bit.structure.inheritance.driver.Bus;
import kr.bit.structure.inheritance.driver.Driver;
import kr.bit.structure.inheritance.driver.Taxi;
import kr.bit.structure.inheritance.driver.Vehicle;

// 이것이 자바다 매개변수 다형성 예제
public class TPC27 {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		// Vehicle vehicle = new Bus();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(bus);
		// vehicle = new Taxi();
		driver.drive(taxi);
		
	}
}

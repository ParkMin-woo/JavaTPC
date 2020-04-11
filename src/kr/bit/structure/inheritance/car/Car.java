package kr.bit.structure.inheritance.car;

public class Car {	
	// Tire 객체들을 배열로 관리
	public Tire[] tires = new Tire[] {
		new Tire(6, "frontLeftTire")
		, new Tire(10, "frontRightTire")
		, new Tire(14, "backLeftTire")
		, new Tire(18, "backRightTire")
	};
	
	public int run() {
		System.out.println("[자동차가 신나게 달리는 중입니다.]");
		// System.out.println("tires.length => " + tires.length);
		
		for(int i = 0 ; i < tires.length ; i++) {
			boolean rollTF = tires[i].roll();
			// if(tires[i].roll() == false) {
			if(rollTF == false) {
				stop();
				return (i+1);
			}
		}
		return 0;
	}
	
	public void stop() {
		System.out.println("자동차가 멈췄습니다.");
	}
}

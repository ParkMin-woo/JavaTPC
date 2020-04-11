package kr.bit.structure.inheritance;

public class Car {
	/*
	public Tire frontLeftTire = new Tire(6, "frontLeftTire");
	public Tire frontRightTire = new Tire(10, "frontRightTire");
	public Tire backLeftTire = new Tire(14, "backLeftTire");
	public Tire backRightTire = new Tire(18, "backRightTire");
	*/
	
	// Tire 객체들을 배열로 관리
	public Tire[] tires = new Tire[] {
		new Tire(6, "frontLeftTire")
		, new Tire(10, "frontRightTire")
		, new Tire(14, "backLeftTire")
		, new Tire(18, "backRightTire")
	};
	
	public int run() {
		/*
		System.out.println("tires => " + tires);
		System.out.println("tires.length => " + tires.length);
		for(Tire temp : tires) {
			System.out.println("temp => " + temp);
		}
		*/
		System.out.println("자동차가 신나게 달리는 중입니다.");
		/*
		boolean tireTF1 = tires[0].roll();
		boolean tireTF2 = tires[1].roll();
		boolean tireTF3 = tires[2].roll();
		boolean tireTF4 = tires[3].roll();
		*/
		
		for(int i = 0 ; i < tires.length ; i++) {
			if(tires[i].roll() == false) {
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
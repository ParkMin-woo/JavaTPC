package kr.bit.structure.inheritance;

public class Car {
	public Tire frontLeftTire = new Tire(6, "frontLeftTire");
	public Tire frontRightTire = new Tire(10, "frontRightTire");
	public Tire backLeftTire = new Tire(14, "backLeftTire");
	public Tire backRightTire = new Tire(18, "backRightTire");
	
	// public void run() {
	public int run() {
		System.out.println("자동차가 신나게 달리는 중입니다.");
		
		boolean tireTF1 = frontLeftTire.roll();
		boolean tireTF2 = frontRightTire.roll();
		boolean tireTF3 = backLeftTire.roll();
		boolean tireTF4 = backRightTire.roll();
		
		/*
		if(tireTF1 == false || tireTF2 == false || tireTF3 == false || tireTF4 == false) {
			this.stop();
		}
		else {
			
		}
		*/
		
		if(tireTF1 == false) {
			stop();
			return 1;
		}
		if(tireTF2 == false) {
			stop();
			return 2;
		}
		if(tireTF3 == false) {
			stop();
			return 3;
		}
		if(tireTF4 == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	public void stop() {
		System.out.println("자동차가 멈췄습니다.");
	}
}

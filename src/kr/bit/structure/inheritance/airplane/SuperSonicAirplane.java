package kr.bit.structure.inheritance.airplane;

public class SuperSonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SPECIAL = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SPECIAL) {
			System.out.println("비행기가 초음속으로 날고 있는 중입니다.");
		}
		else {
			super.fly();
		}
	}	
}

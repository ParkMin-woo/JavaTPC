package kr.bit.structure.inheritance;

public class KumhoTire extends Tire {

	/**
	 * @param maxRotation
	 * @param location
	 */
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		accumulatedRotation += 1;
		
		if(accumulatedRotation < maxRotation) {
			int remainRotation = maxRotation - accumulatedRotation;
			System.out.println(location + " 금호타이어의 남은 회전수는 " + remainRotation + "회입니다.");
			return true;
		}
		else {
			System.out.println(location + " 금호타이어가 펑크났습니다.");
			return false;
		}
	}
	
}

package kr.bit.structure.inheritance;

public class HankookTire extends Tire {
	/*
	private int maxRotation;				// 최대 회전수
	private int accumulatedRotation;		// 누적 회전수
	private String location;				// 타이어의 위치(앞왼쪽 , 앞오른쪽 , 뒤왼쪽 , 뒤오른쪽)
	*/
	
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean roll() {
		accumulatedRotation += 1;
		
		if(accumulatedRotation < maxRotation) {
			int remainRotation = maxRotation - accumulatedRotation;
			System.out.println(location + " 한국타이어의 남은 회전수는 " + remainRotation + "회입니다.");
			return true;
		}
		else {
			System.out.println(location + " 한국타이어가 펑크났습니다.");
			return false;
		}
	}

}

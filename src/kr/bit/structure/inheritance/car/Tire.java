package kr.bit.structure.inheritance.car;

// 이것이 자바다에서 다형성 부분 실습을 위한 에제
public class Tire {
	protected int maxRotation;				// 최대 회전수
	protected int accumulatedRotation;		// 누적 회전수
	protected String location;				// 타이어의 위치(앞왼쪽 , 앞오른쪽 , 뒤왼쪽 , 뒤오른쪽)
	
	/**
	 * @param maxRotation
	 * @param location
	 */
	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		accumulatedRotation += 1;
		
		if(accumulatedRotation < maxRotation) {
			int remainRotation = maxRotation - accumulatedRotation;
			System.out.println(location + " 타이어의 남은 회전수는 " + remainRotation + "회입니다.");
			return true;
		}
		else {
			System.out.println(location + " 타이어가 펑크났습니다.");
			return false;
		}
	}

	/**
	 * @return the maxRotation
	 */
	public int getMaxRotation() {
		return maxRotation;
	}

	/**
	 * @param maxRotation the maxRotation to set
	 */
	public void setMaxRotation(int maxRotation) {
		this.maxRotation = maxRotation;
	}

	/**
	 * @return the accumulatedRotation
	 */
	public int getAccumulatedRotation() {
		return accumulatedRotation;
	}

	/**
	 * @param accumulatedRotation the accumulatedRotation to set
	 */
	public void setAccumulatedRotation(int accumulatedRotation) {
		this.accumulatedRotation = accumulatedRotation;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}

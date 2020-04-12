package kr.bit.structure.inheritance.phone;

// 이것이 자바다 abstract class 예제
public abstract class Phone {
	public String owner;

	/**
	 * @param owner
	 */
	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	
	/*
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	*/
	
	public abstract void turnOn();
	
	public abstract void turnOff();
}

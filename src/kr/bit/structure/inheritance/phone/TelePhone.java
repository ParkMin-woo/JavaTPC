package kr.bit.structure.inheritance.phone;

public class TelePhone extends Phone {

	/**
	 * @param owner
	 */
	public TelePhone(String owner) {
		super(owner);
	}
	
	public void autoAnswering() {
		System.out.println("자동 응답을 합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("피쳐폰 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("피쳐폰 전원을 끕니다.");
	}
	
	
}

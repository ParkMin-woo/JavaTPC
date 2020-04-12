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
}

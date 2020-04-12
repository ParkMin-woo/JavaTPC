package kr.bit.structure.inheritance.phone;

public class SmartPhone extends Phone {

	/**
	 * @param owner
	 */
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
}

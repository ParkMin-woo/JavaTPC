package kr.bit.structure.inheritance;

public class Temp01 {
	public void display() {
		System.out.println("Temp01 클래스의 diplay() 메서드 호출");
	}

	// toString() 메서드를 재정의하지 않으면 객체의 메모리 위치 주소값(번지값)이 return됨.
	@Override
	public String toString() {
		// return super.toString();
		return "Temp01에서 toString() 메서드를 재정의 했습니다.";
	}
}

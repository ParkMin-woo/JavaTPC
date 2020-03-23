package kr.bit.action;

public class OverLoadingPractice {
	// 동작으로만 이루어진 객체
	// 메서드로만 이루어진 클래스
	public void sum(int x , int y) {
		System.out.println("x + y = " + (x + y));
	}
	
	public void sum(int x , int y , int z) {
		System.out.println("x + y + z = " + (x + y + z));
	}
	
	public void sum(float x , int y) {
		System.out.println("x + y = " + (x + y));
	}
	
	public void sum(int x , float y) {
		System.out.println("x + y = " + (x + y));
	}

	public void sum(float x , float y) {
		System.out.println("x + y = " + (x + y));
	}
}

package kr.bit.structure;

public class MyUtil {
	/*
	public float sum() {
		float h = 5.07f;
		float m = 9.3f;
		float sum = h + m;
		return sum;
	}
	*/
	
	// 1부터 100까지 구하는 메서드 making
	public int sum() {
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			sum += i;
		}
		return sum;
	}
}

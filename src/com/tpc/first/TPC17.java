package com.tpc.first;

import kr.bit.action.OverLoadingPractice;

public class TPC17 {
	public static void main(String[] args) {
		OverLoadingPractice ov = new OverLoadingPractice();
		ov.sum(10, 20);				// JAVA Compiler가 ov.sum_int_int(10, 20) 메서드 호출
		ov.sum(28, 29, 11);
		ov.sum(5.07f, 29);
		ov.sum(28, 9.3f);
		ov.sum(5.07f, 2.345f);

	}
}

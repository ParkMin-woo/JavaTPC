package com.tpc.first;

import kr.bit.action.OverLoadingPractice;

public class TPC17 {
	public static void main(String[] args) {
		OverLoadingPractice ov = new OverLoadingPractice();
		ov.sum(10, 20);				// JAVA Compiler가 ov.sum_int_int(10, 20) 메서드 호출
		ov.sum(28, 29, 11);			// JAVA Compiler가 ov.sum_int_int_int(28, 29, 11) 메서드 호출
		ov.sum(5.07f, 29);			// JAVA Compiler가 ov.sum_float_int(5.07f, 29) 메서드 호출
		ov.sum(28, 9.3f);			// JAVA Compiler가 ov.sum_int_float(28, 9.3f) 메서드 호출
		ov.sum(5.07f, 2.345f);		// JAVA Compiler가 ov.sum_float_float(5.07f, 2.345f) 메서드 호출

	}
}

package com.tpc.first;


// JVM 메모리에서 자바가 구동하는 원리
public class TPC16 {
	public static void main(String[] args) {
		double m = 9.30;
		double h = 5.07;
		
		TPC16 tpc16 = new TPC16();
		double sum = tpc16.add(m , h);
		System.out.println("sum = " + sum);
	}

	// git test
	private double add(double a, double b) {
		double add = a + b;
		return add;
	}
}

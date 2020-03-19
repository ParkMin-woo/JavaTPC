package com.tpc.first;

public class TPC09 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		TPC09 tpc09 = new TPC09();
		int v = tpc09.sum(a, b);		// Heap Area에 객체 생성
		System.out.println("v = " + v);
	}
	
	public int sum(int x, int y) {
		int sum = x + y;
		return sum;
	}
}

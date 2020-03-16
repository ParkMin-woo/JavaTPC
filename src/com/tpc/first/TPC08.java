package com.tpc.first;

public class TPC08 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int v = sum(a , b);
		System.out.println("v = " + v);
	}

	private static int sum(int x, int y) {
		int sum = x + y;
		return sum;
	}
}

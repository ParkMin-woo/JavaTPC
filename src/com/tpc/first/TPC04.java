package com.tpc.first;

public class TPC04 {
	public static void main(String[] args) {
		// 4. Data를 이동하라.(variable vs array)
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		
		// a, b, c 메서드 처리 -> sum()
		sum(a, b, c);
		
		// 변수를 모를경우
		// 즉, 변수가 여러개인 경우
		int[] d = new int[10];
		
		for(int i = 0 ; i < d.length ; i++) {
			d[i] = 10 + 10*i;
		}
		
		// arraySum(d);
		
		int[] e;
		e= new int[4];
		System.out.println("e => " + e);
		for(int i = 0 ; i < e.length ; i++) {
			System.out.println("e[" + i + "] => " + e[i]);
		}
		
		String[] s;
		s= new String[4];
		System.out.println("s => " + s);
		for(int i = 0 ; i < s.length ; i++) {
			System.out.println("s[" + i + "] => " + s[i]);
		}
		
		int d1 = arraySum(d);
		System.out.println("d1 => " + d1);
	}
	
	public static void sum(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println("sum = " + sum);
	}
	
	public static int arraySum(int[] x) {
		int sum = 0;
		for(int i = 0 ; i < x.length ; i++) {
			sum = sum+ x[i];
		}
		// System.out.println("arraySum = " + sum);
		return sum;
	}
}

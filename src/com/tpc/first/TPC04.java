package com.tpc.first;

public class TPC04 {
	public static void main(String[] args) {
		// 4. Data�� �̵��϶�.(variable vs array)
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		
		// a, b, c �޼��� ó�� -> sum()
		sum(a, b, c);
		
		// ������ �𸦰��
		// ��, ������ �������� ���
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

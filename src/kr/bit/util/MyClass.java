package kr.bit.util;

public class MyClass {
	public int sum(int a, int b) {
		int sum = 0;
		for(int i = a ; i <= b ; i++) {
			sum += i;
		}
		return sum;
	}
}

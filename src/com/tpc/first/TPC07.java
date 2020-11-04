package com.tpc.first;

public class TPC07 {
	public static void main(String[] args) {
		int a = 20;
		float b = 34.55f;
		
		float sum01 = sum01(a, b);			// Call By Value
		System.out.println("sum01 = " + sum01);
		
		int[] arrList = makingArr(100);			// Call By Value
		int arrSum = arrSum(arrList);			// Call By Reference
		System.out.println("arrSum = " + arrSum);
	}

	public static float sum01(int x, float y) {
		float sum = x+y;
		return sum;
	}
	
	private static int[] makingArr(int cntOfArr) {
		int[] arr = new int[cntOfArr];
		// int element = 1;
		/*
		for(int tempNum : arr) {
			tempNum = element;
			element++;
		}
		*/
		for(int i = 0 ; i < cntOfArr ; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

	private static int arrSum(int[] x) {
		int sum = 0;
		for(int tempNum : x) {
			sum += tempNum;
		}
		return sum;
	}
}

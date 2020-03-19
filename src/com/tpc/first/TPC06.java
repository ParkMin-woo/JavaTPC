package com.tpc.first;

public class TPC06 {
	public static void main(String[] args) {
		// 5. 메서드 -> 동작(method), 기능(function)
		int v = intSum(20, 30);
		System.out.println("v = " + v);
		
		int[] arr = makeArr(5);
		
		// Advanced for Loop
		for(int temp : arr) {
			System.out.println("temp => " + temp);
		}
		// arr이 참조하는 객체 메모리 위치 주소값이 리턴됨.
		// System.out.println("arr => " + arr);
		
		int intArrSum = intArraySum(arr);
		System.out.println("intArrSum = " + intArrSum);
		
		int[] arr2 = makeArr(100);
		int intArrSum2 = intArraySum(arr2);
		System.out.println("intArrSum2 = " + intArrSum2);

	}

	// 정수 2개를 매개변수로 받아서 총 합을 구하여 return하는 메서드를 정의하시오.
	public static int intSum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static int[] makeArr(int idx) {
		int[] arr = new int[idx];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i + 1;
			// System.out.println("arr[" + i + "] => " + arr[i]);
		}
		
		System.out.println("arr in makeArr => " + arr);
		return arr;
	}
	
	// 정수 여러개를 매개변수로 받아서 총 합을 구하여  return하는 메서드를 정의
	public static int intArraySum(int[] x) {
		int sum = 0;
		// Advanced for Loop
		for(int tempNum : x) {
			sum += tempNum;
		}
		return sum;
	}
}

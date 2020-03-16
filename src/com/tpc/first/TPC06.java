package com.tpc.first;

public class TPC06 {
	public static void main(String[] args) {
		// 5. �޼��� -> ����(method), ���(function)
		int v = intSum(20, 30);
		System.out.println("v = " + v);
		
		int[] arr = makeArr(5);
		
		// Advanced for Loop
		for(int temp : arr) {
			System.out.println("temp => " + temp);
		}
		// arr�� �����ϴ� ��ü �޸� ��ġ �ּҰ��� ���ϵ�.
		// System.out.println("arr => " + arr);
		
		int intArrSum = intArraySum(arr);
		System.out.println("intArrSum = " + intArrSum);
		
		int[] arr2 = makeArr(100);
		int intArrSum2 = intArraySum(arr2);
		System.out.println("intArrSum2 = " + intArrSum2);

	}

	// ���� 2���� �Ű������� �޾Ƽ� �� ���� ���Ͽ� return�ϴ� �޼��带 �����Ͻÿ�.
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
	
	// ���� �������� �Ű������� �޾Ƽ� �� ���� ���Ͽ�  return�ϴ� �޼��带 ����
	public static int intArraySum(int[] x) {
		int sum = 0;
		// Advanced for Loop
		for(int tempNum : x) {
			sum += tempNum;
		}
		return sum;
	}
}

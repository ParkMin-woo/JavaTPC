package com.tpc.first;

public class TPC05 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = (i + 1) * 10;
		}
		
		arrSum1(arr1);
		
		// 9개의 정수형 변수를 만들어라. -> 2차원 구조로 생성
		int[][] arr2 = new int[3][3];
		for(int i = 0 ; i < arr2.length ; i++) {
			for(int j = 0 ; j < arr2[i].length ; j++) {
				arr2[i][j] = i + j;
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		
		arrSum2(arr2);
		
		int [][] arr3 = new int[5][];
		for(int i = 0 ; i < arr3.length ; i++) {
			arr3[i] = new int[i + 1];
			for(int j = 0 ; j < arr3[i].length ; j++) {
				// arr3[i][j] = i + j;
				arr3[i][j] = '*';
				System.out.print((char)arr3[i][j]);
			}
			System.out.println();
		}
		
		// arrSum2(arr3);
	}

	public static void arrSum1(int[] x) {
		int sum = 0;
		for(int i = 0 ; i < x.length ; i++) {
			sum += x[i];
		}
		System.out.println("sum = " + sum);
	}
	
	public static void arrSum2(int[][] x) {
		int sum = 0;
		for(int i = 0 ; i < x.length ; i++) {
			for(int j = 0 ; j < x[i].length ; j++) {
				sum += x[i][j];
			}
		}
		System.out.println("sum = " + sum);
	}
}

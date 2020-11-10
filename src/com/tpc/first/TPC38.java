package com.tpc.first;

import kr.bit.util.IntArray;

public class TPC38 {
	public static void main(String[] args) {
		IntArray intArray = new IntArray(3);
		intArray.add(10);
		intArray.add(20);
		intArray.add(30);
		for(int i = 0 ; i < intArray.size() ; i++) {
			System.out.println("intArray.get(" + i + ") = " + intArray.get(i));
		}
		
//		for(int intElement : intArray) {
//			System.out.println("intElement => " + intElement);
//		}
	}
}

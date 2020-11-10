package com.tpc.first;

public class TPC36 {
	public static void main(String[] args) {
		String str = new String("Apple");
		str = str.toUpperCase();
		System.out.println("str => " + str);
		str = str.toLowerCase();
		System.out.println("str => " + str);
		int strLength = str.length();
		System.out.println("strLength => " + strLength);
		char ithSpelling = str.charAt(0);
		System.out.println("ithSpelling => " + ithSpelling);
		ithSpelling = str.charAt(4);
		System.out.println("ithSpelling => " + ithSpelling);
		// java.lang.StringIndexOutOfBoundsException 에러 발생
		// 글자수 범위 넘어서 발생함
		// ithSpelling = str.charAt(5);
		// System.out.println("ithSpelling => " + ithSpelling);
		for(int i = 0 ; i < strLength ; i++) {
			System.out.println(i + "번째 spelling : " + str.charAt(i) );
		}
		// System.out.println(str.indexOf("A"));
		for(int i = 0 ; i < strLength ; i++) {
			System.out.println(str.charAt(i) + "의 index : " + str.indexOf(str.charAt(i)) );
		}
		System.out.println("B의 index => " + str.indexOf("B"));
		System.out.println("A의 index => " + str.indexOf("A"));
		System.out.println("replaceAll 메서드 연습 => " + str.replaceAll("p", "b"));
	}
}

package com.tpc.first;

public class TPC37 {
	public static void main(String[] args) {
		String str1 = new String("APPLE");
		String str2 = new String("APPLE");
		String str3 = "APPLE";
		String str4 = "APPLE";
		// 보통 String형은 new String("문자열")로 생성하지 않고,
		// 상수처럼 String s = "aaa" 이런 식으로 생성한다.
		// 아마 현업에서 100% 상수처럼 표현할 것이다.
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
		
		if(str1 == str2) {
			System.out.println("str1과 str2의 주소값은 같다.");
		} else {
			System.out.println("str1과 str2의 주소값은 다르다.");
		}
		
		if(str1 == str3) {
			System.out.println("str1과 str3의 주소값은 같다.");
		} else {
			System.out.println("str1과 str3의 주소값은 다르다.");
		}
		
		if(str3 == str4) {
			System.out.println("str3와 str4의 주소값은 같다.");
		} else {
			System.out.println("str3와 str4의 주소값은 다르다.");
		}
		
		// 문자열을 비교할 때에는 절대 == 로 비교하지 말자.
		// == 은 번지값(주소값)을 비교하기 때문에
		// 그러므로 equals() 메서드를 이용해서 문자열을 비교하자.
		// 초급 개발자가 프로젝트 가면은 항상 하는 실수 중에 하나가 바로 문자열 비교다.
		if(str1.equals(str2)) {
			System.out.println("str1과 str2의 문자열은 같다.");
		} else {
			System.out.println("str1과 str2의 문자열은 다르다.");
		}
		
		if(str1.equals(str3)) {
			System.out.println("str1과 str3의 문자열은 같다.");
		} else {
			System.out.println("str1과 str3의 문자열은 다르다.");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3과 str4의 문자열은 같다.");
		} else {
			System.out.println("str3과 str4의 문자열은 다르다.");
		}
	}
}

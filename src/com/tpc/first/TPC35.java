package com.tpc.first;

import kr.bit.util.MyClass;

public class TPC35 {
	public static void main(String[] args) {
		// kr.bit.util.MyClass myClass = new kr.bit.util.MyClass();
		// 실제 현업 개발에서는 import구문을 생략하면서 class full name를 사용하지는 않는다.
		// 보기에도 불편해 보이고, 소스의 길이가 비효율적으로 증가하기 때문에.
		// 그리고 내가 개발을 2년정도 하면서 class full name를 사용하는 경우를 못봤다.
		// 그러니깐 class full name를 사용하지 말고, 사용할 package를 import해서 편하게 사용하자.
		MyClass myClass = new MyClass();
		int sum = myClass.sum(1, 10);
		System.out.println("sum = " + sum);
	}
}

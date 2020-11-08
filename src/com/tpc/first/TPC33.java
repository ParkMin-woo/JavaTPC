package com.tpc.first;

import kr.bit.structure.inheritance.Temp01;

public class TPC33 {
	public static void main(String[] args) {
		Object temp = new Temp01();
		String temp01ToStringValue = temp.toString();
		System.out.println("temp01ToStringValue => " + temp01ToStringValue);
		 ((Temp01) temp).display();
	}
}

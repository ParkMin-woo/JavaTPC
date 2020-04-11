package com.tpc.first;

import kr.bit.structure.inheritance.area.DetailCircleArea;
import kr.bit.structure.inheritance.area.OrdinaryCircleArea;

public class TPC22 {
	public static void main(String[] args) {
		OrdinaryCircleArea oca = new OrdinaryCircleArea();
		double r = 5;
		double circleArea1 = oca.areaCircle(r);
		System.out.println("circleArea1 => " + circleArea1);
		
		DetailCircleArea dca = new DetailCircleArea();
		double circleArea2 = dca.areaCircle(r);
		System.out.println("circleArea2 => " + circleArea2);
		
		OrdinaryCircleArea oca2 = new DetailCircleArea();
		double circleArea3 = oca2.areaCircle(r);
		System.out.println("circleArea3 => " + circleArea3);
	}
}

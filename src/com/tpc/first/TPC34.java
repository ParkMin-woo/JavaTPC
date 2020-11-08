package com.tpc.first;

import kr.bit.structure.inheritance.Temp02;
import kr.bit.structure.inheritance.Temp03;

public class TPC34 {
	public static void main(String[] args) {
		display(new Temp02());
		display(new Temp03());
		
		Object[] objArray = new Object[2];
		objArray[0] = new Temp02();
		objArray[1] = new Temp03();
		for(Object objElement : objArray) {
			display(objElement);
		}
		// display(objArray);
	}

	private static void display(Object obj) {
		if(obj instanceof Temp02) {
			((Temp02) obj).go();
		} else {
			((Temp03) obj).go();
		}
	}
}

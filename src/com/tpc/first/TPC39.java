package com.tpc.first;

import java.util.ArrayList;

import kr.bit.structure.inheritance.Temp01;
import kr.bit.structure.inheritance.Temp02;
import kr.bit.structure.inheritance.Temp03;
import kr.bit.util.ObjectArray;

public class TPC39 {
	public static void main(String[] args) {
		ObjectArray objectArray = new ObjectArray(3);
		// ArrayList objectArray = new ArrayList(2);	// Object[], 배열의 길이에 제약이 없다.
		objectArray.add(new Temp01());
		objectArray.add(new Temp02());
		objectArray.add(new Temp03());
		
		for( int i = 0 ; i < objectArray.size() ; i++ ) {
			Object objectElement = objectArray.get(i);
			if(objectElement instanceof Temp01) {
				((Temp01) objectElement).display();
			}
			else if(objectElement instanceof Temp02) {
				((Temp02) objectElement).go();
			}
			else if(objectElement instanceof Temp03) {
				((Temp03) objectElement).go();
			}
		}
	}
}

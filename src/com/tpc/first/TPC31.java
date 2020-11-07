package com.tpc.first;

import kr.bit.structure.implement.remocon.Radio;
import kr.bit.structure.implement.remocon.RemotementControl;
import kr.bit.structure.implement.remocon.TV;

// Interface 실습
public class TPC31 {
	public static void main(String[] args) {
		RemotementControl remoCon = new TV();
		excute(remoCon);
		remoCon = new Radio();
		excute(remoCon);		// 메서드 오버로딩
		
		RemotementControl[] remoConArray = new RemotementControl[2];
		remoConArray[0] = new TV();
		remoConArray[1] = new Radio();
		excute(remoConArray);	// 메서드 오버로딩
	}

	private static void excute(RemotementControl remoCon) {
		System.out.println("메서드 파라미터로 객체를 받은 경우");
		if(remoCon instanceof TV) {
			((TV) remoCon).turnOn();
			remoCon.chUp();
			remoCon.chDown();
			remoCon.internet();
			((TV) remoCon).turnOff();
		} else {
			((Radio) remoCon).turnOn();
			remoCon.chUp();
			remoCon.chDown();
			remoCon.internet();
			((Radio) remoCon).turnOff();
		}
	}

	private static void excute(RemotementControl[] remoConArray) {
		System.out.println("메서드 파라미터로 배열 객체를 받은 경우");
		for(RemotementControl remoConElement : remoConArray) {
			if(remoConElement instanceof TV) {
				((TV) remoConElement).turnOn();
				remoConElement.chUp();
				remoConElement.chDown();
				remoConElement.internet();
				((TV) remoConElement).turnOff();
			} else {
				((Radio) remoConElement).turnOn();
				remoConElement.chUp();
				remoConElement.chDown();
				remoConElement.internet();
				((Radio) remoConElement).turnOff();
			}
		}
	}
}

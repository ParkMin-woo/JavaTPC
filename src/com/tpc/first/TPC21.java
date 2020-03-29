package com.tpc.first;

import kr.bit.structure.DmbCellPhone;

public class TPC21 {
	public static void main(String[] args) {
		DmbCellPhone dmbPhone = new DmbCellPhone("모토로라", "검정" , "박민우", 10);
		String owner = dmbPhone.getOwner();
		dmbPhone.turnOn(owner);
		dmbPhone.ring(owner);
		dmbPhone.sendMessage("제니강, 안녕???\n되게 오랜만이다. ㅎㅎ");
		dmbPhone.receiveMessage("오, 미누미누 ㅋㅋㅋㅋㅋ\n나도 마찬가지야.\n잘 지냈어???");
		dmbPhone.hangUp(owner);
		
		dmbPhone.dmbTurnOn();
		dmbPhone.changeDmbChannel(15);
		dmbPhone.dmbTurnOff();
		
		dmbPhone.turnOff(owner);
		
		System.out.println(dmbPhone);
	}
}

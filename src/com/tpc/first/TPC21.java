package com.tpc.first;

import kr.bit.structure.inheritance.CellPhone;
import kr.bit.structure.inheritance.DmbCellPhone;

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
		
		CellPhone cellPhone = new DmbCellPhone("아이폰", "흰색", "제니강", 5);
		String iPhoneOwner = ((DmbCellPhone) cellPhone).getOwner();
		cellPhone.turnOn(iPhoneOwner);
		cellPhone.ring(iPhoneOwner);
		cellPhone.sendMessage("미누미누, 나 너 너무 보고싶어... ㅜㅜ");
		cellPhone.receiveMessage("제니강, 생일때까지 기달려주라. 너한테 선물줄게!");
		cellPhone.sendMessage("오, 진짜??? ㅋㅋㅋㅋ");
		cellPhone.receiveMessage("ㅇㅇ ㅋㅋㅋㅋㅋㅋ");
		cellPhone.sendMessage("나 5월 7일이 정말 기대되는데??? ㅋㅋㅋㅋ");
		cellPhone.receiveMessage("그 전날에 뭐 받고 싶은지 이야기해죠.");
		cellPhone.sendMessage("알았어. ㅋㅋㅋㅋ");
		cellPhone.hangUp(iPhoneOwner);
		
		((DmbCellPhone) cellPhone).dmbTurnOn();
		((DmbCellPhone) cellPhone).changeDmbChannel(10);
		((DmbCellPhone) cellPhone).dmbTurnOff();
		System.out.println(cellPhone);
	}
}

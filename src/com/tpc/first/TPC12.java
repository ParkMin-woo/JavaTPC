package com.tpc.first;

import kr.bit.structure.BookVO;

public class TPC12 {
	public static void main(String[] args) {
		// ������ -> ��ü�� �����ϰ� �ʱ�ȭ
		//      -> �ߺ����� ����
		// BookVO ��ü ����
		BookVO b1 = new BookVO();
		System.out.println("==========b1===============");
		System.out.println("b1 = " + b1);
		System.out.println("==========���� �ֱ� ���� b1 ��ü(?)�� field����===============");
		System.out.println("b1.title = " + b1.title);
		System.out.println("b1.price = " + b1.price);
		System.out.println("b1.company = " + b1.company);
		System.out.println("b1.page = " + b1.page);
		b1.title = "Ŭ��콺 ������ ��4�� �������";
		b1.price = 15000;
		b1.company = "���ο�����";
		b1.page = 287;
		System.out.println("==========���� ���� ���� b1 ��ü(?)�� field����===============");
		System.out.println("b1.title = " + b1.title);
		System.out.println("b1.price = " + b1.price);
		System.out.println("b1.company = " + b1.company);
		System.out.println("b1.page = " + b1.page);
		/*
		System.out.println("==========b1===============");
		System.out.println("b1 = " + b1);
		System.out.println("==========b1 ��ü(?)�� field����===============");
		// b1.title = "������ ���� SQL";
		// System.out.println("���࿡ �ʱ�ȭ�� title�� ���� �ٲٸ�???");
		System.out.println("b1.title = " + b1.title);
		System.out.println("b1.price = " + b1.price);
		System.out.println("b1.company = " + b1.company);
		System.out.println("b1.page = " + b1.page);
		*/
		
		// BookVO(String title, int price, String company, int page)
		BookVO b2 = new BookVO("����� ������", 15000, "����ī��" , 350);
		System.out.println("");
		System.out.println("==========b2===============");
		System.out.println("b2 = " + b2);
		System.out.println("==========b2 ��ü(?)�� field����===============");
		System.out.println("b2.title = " + b2.title);
		System.out.println("b2.price = " + b2.price);
		System.out.println("b2.company = " + b2.company);
		System.out.println("b2.page = " + b2.page);

		/*
		BookVO b3 = new BookVO();
		System.out.println("==========b3===============");
		System.out.println("b3 = " + b3);
		System.out.println("b3.title = " + b3.title);
		System.out.println("b3.price = " + b3.price);
		System.out.println("b3.company = " + b3.company);
		System.out.println("b3.page = " + b3.page);
		*/
	}
}

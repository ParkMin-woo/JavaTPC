package com.tpc.first;

import kr.bit.structure.Book;
import kr.bit.structure.MemberVO;

public class TPC03 {
	public static void main(String[] args) {
		// ���踦 �����϶�!
		// PDT VS UDDT
		// ���� 1���� �����ϱ� ���� ������ ����
		int a;
		a = 10;
		System.out.println("a => " + a + "\n");
		
		// å 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		Book book;
		// new�� ���Ͽ� ��üȭ
		book = new Book();
		
		book.company = "�Ѻ��̵��";
		book.title = "�ڹ��� ����";
		book.price = 15000;
		book.page = 700;
		
		System.out.println("���ǻ� => " + book.company);
		System.out.println("���� => " + book.title);
		System.out.println("���� => " + book.price);
		System.out.println("������ => " + book.page + "\n");
		
//		ȸ�� ����
		MemberVO member;
		member = new MemberVO();
		
		member.name = "�����";
		member.age = 26;
		member.adress = "��⵵ ����";
		member.job = "����Ű ����";
		member.height = 170.9f;
		member.weight = 50.12f;
		System.out.println("�̸� => " + member.name);
		System.out.println("���� => " + member.age);
		System.out.println("�ּ� => " + member.adress);
		System.out.println("���� => " + member.job);
		System.out.println("Ű => " + member.height);
		System.out.println("������ => " + member.weight);
	}
}
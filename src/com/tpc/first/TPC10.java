package com.tpc.first;

import kr.bit.structure.BookDTO;

public class TPC10 {
	public static void main(String[] args) {
		// byte , short, int, long, char, float, double, boolean -> Primitive DataType
		int a;
		// System.out.println(a);
		a = 10;
		
		// å�̶�� �ڷ����� ������. -> class
		// ��ü ����
		BookDTO b = new BookDTO();
		System.out.println("b => " + b);
		/*
		System.out.println("title => " + b.title);
		System.out.println("price => " + b.price);
		System.out.println("company => " + b.company);
		System.out.println("page => " + b.page);
		*/
		
		b.title = "�̰��� �ڹٴ�";
		b.price = 30000;
		b.company = "�Ѻ��̵��";
		b.page = 1222;
		System.out.println("title => " + b.title);
		System.out.println("price => " + b.price);
		System.out.println("company => " + b.company);
		System.out.println("page => " + b.page);
		// this().title = "����� ������";
	}
}

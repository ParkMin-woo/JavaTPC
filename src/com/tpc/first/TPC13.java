package com.tpc.first;

import kr.bit.structure.Inflearn01;
import kr.bit.structure.Inflearn02;

public class TPC13 {
	public static void main(String[] args) {
		
		// �������� ���������ڰ� private�̶� new�� ���� ��ü ������ �Ұ����ϴ�.
		// Inflearn01 inf = new Inflearn01();
		
		Inflearn01.java();
		
		// Inflearn01 Ŭ������ tpc() �޼ҵ忡 static�� �پ����� �ʾƼ�
		// Ŭ������.�޼ҵ������ ȣ���� �Ұ���.
		// Inflearn01.tpc();
		
		Inflearn02 inf02 = new Inflearn02();
		inf02.python();
		
		// Inflearn02 Ŭ������ �������� ���� �����ڴ� public(default constructor)
		// public �����ڰ� �پ new�� ���� ��ü ������ ���Ͽ� static�� ���� �޼ҵ�, �ʵ�� ������ �� ����.
		// ������ ���� �����ϴ� ����� �ƴ� �� ����.
		inf02.oracle();
		Inflearn02.oracle();
		
		// Java API �߿��� ���������ڰ� private�� �����ڸ� ���� API��
		// System sys = new System();
		System.out.println("���ϰ�, ����ʹ�... �̤�");
		double abstract1 = Math.abs(-11.1);
		System.out.println("abstract1 = " + abstract1);
		
		int maxNum = Math.max(930, 507);
		System.out.println("maxNum = " + maxNum);
	}
}

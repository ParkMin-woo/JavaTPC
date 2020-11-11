package com.tpc.first;

// Wrapper Class 실습
public class TPC41 {
	public static void main(String[] args) {
		// 정수 1을 담을 변수 선언
		int a = 1;
		Integer b = new Integer(1);
		Integer c = 1;
		System.out.println("a => " + a);
		System.out.println("b => " + b);
		System.out.println("c => " + c);
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(b.intValue()==c);
		System.out.println(c==a);
		
		Object[] objectArray = new Object[3];
		objectArray[0] = new Integer(1);
		objectArray[1] = 2;
		objectArray[2] = 3;
		for(Object objectElement : objectArray) {
			System.out.println("objectElement => " + objectElement);
		}
		
		// "100" + "100" = 200
		Integer x = 100;
		Integer y = 100;
		System.out.println(x+y);
		String xStr = x.toString();
		String yStr = y.toString();
		System.out.println(xStr + yStr);
		// Integer sum = xStr + yStr;
		int sum = new Integer(xStr) + new Integer(yStr);
		System.out.println("sum = " + sum);
		int sum2 = Integer.parseInt(xStr) + Integer.parseInt(yStr);
		System.out.println("sum2 = " + sum2);
		
		// 100 + 100 = "100100"
		Integer z = 100;
		Integer w = 100;
		System.out.println("z+w = " + (z+w));
		String zStr = z.toString();
		String wStr = w.toString();
		System.out.println("zStr + wStr = " + (zStr + wStr));
	}
}

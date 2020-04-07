package kr.bit.structure.inheritance;

public class JungSuk2 extends JungSuk1 {

	@Override
	public void method2() {
		// super.method2();
		System.out.println("JungSuk2의 method2 실행");
	}
	
	public void method3() {
		System.out.println("JungSuk1의 method2부터  실행");
		super.method2();
		System.out.println("JungSuk2의 method3 실행");
	}
	
}

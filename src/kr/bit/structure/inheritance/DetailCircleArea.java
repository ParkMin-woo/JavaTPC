package kr.bit.structure.inheritance;

public class DetailCircleArea extends OrdinaryCircleArea {
	
	// 나 OrdinaryCircleArea 클래스에서 구한 원의 넓이가 마음에 안들어.
	// DetailCircleArea 클래스에서 pi를 이용하여 정확하게 구할래!
	// 그러면 OrdinaryCircleArea 클래스에서 구한 원의 넓이를 구하는 메소드를 재정의해서 다시 나타낼래!
	@Override
	public double areaCircle(double r) {
		double area = Math.PI * r * r;
		// System.out.println("DetailCircleArea 클래스에서 구한 원의 넓이는??? " + area);
		return area;
		// return super.areaCircle(r);
	}
	
}

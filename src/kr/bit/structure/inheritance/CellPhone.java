package kr.bit.structure.inheritance;

public class CellPhone {
	// CellPhone 클래스의 field 선언
	protected String model;
	protected String color;
	
	public CellPhone() {}
	
	/**
	 * @param model
	 * @param color
	 */
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	// CellPhone 클래스의 메소드 선언
	public void turnOn(String owner) {
		// System.out.println(model + "이(가) 켜졌습니다.");
		System.out.println(owner + "의 핸드폰이 켜졌습니다.");
	}
	
	public void turnOff(String owner) {
		System.out.println(owner + "의 핸드폰이 꺼졌습니다.");
	}
	
	public void ring(String owner) {
		System.out.println(owner + "의 전화가 왔습니다.");
	}
	
	public void sendMessage(String message) {
		System.out.println("MY : " + message);
	}
	
	public void receiveMessage(String message) {
		System.out.println("YOU : " + message);
	}
	
	public void hangUp(String owner) {
		System.out.println(owner + "의 전화가 끝났습니다.");
	}
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "CellPhone [model=" + model + ", color=" + color + "]";
	}
}

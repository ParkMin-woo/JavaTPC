package kr.bit.structure;

public class Dog extends Animal {

	/**
	 * 
	 */
	public Dog() {
		super();
	}

	/**
	 * @param name
	 * @param age
	 * @param species
	 */
	public Dog(String name, int age, String species) {
		super(name, age, species);
	}

	@Override
	public void walk() {
		// super.walk();
		System.out.println(name + "이(가) 걷는다.");
	}
	
	public void follow() {
		System.out.println(name + "가 사람들을 잘 따른다.");
	}
	
	
	
}

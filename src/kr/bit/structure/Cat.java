package kr.bit.structure;

public class Cat extends Animal {

	/**
	 * 
	 */
	public Cat() {
		super();
	}

	/**
	 * @param name
	 * @param age
	 * @param species
	 */
	public Cat(String name, int age, String species) {
		super(name, age, species);
	}
	
	public void night() {
		System.out.println(name + "는 밤에 눈에서 빛이 난다.");
	}

}

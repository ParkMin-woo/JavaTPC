package kr.bit.structure;

public class Animal {
	public String name;
	public int age;
	public String species;
	
	public Animal() {
		super();
	}
	
	/**
	 * @param name
	 * @param age
	 * @param species
	 */
	public Animal(String name, int age, String species) {
		super();
		this.name = name;
		this.age = age;
		this.species = species;
	}

	public void eat() {
		System.out.println(name + "가(이) 밥을 " + "먹는다.");
	}
}

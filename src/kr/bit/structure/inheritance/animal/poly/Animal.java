package kr.bit.structure.inheritance.animal.poly;

public abstract class Animal {
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

	public void move() {
		System.out.println(name + "이(가) 무리를 지어다닌다.");
	}
	
	public abstract void eat();
	
	public abstract void walk();
}

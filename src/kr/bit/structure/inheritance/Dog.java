package kr.bit.structure.inheritance;

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

	// Inherited fields / Inherited methods
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", species=" + species + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

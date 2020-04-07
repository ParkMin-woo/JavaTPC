package com.tpc.first;

import kr.bit.structure.inheritance.Animal;
import kr.bit.structure.inheritance.Cat;
import kr.bit.structure.inheritance.Dog;

public class TPC24 {
	public static void main(String[] args) {
		Animal animalParam = new Dog("아지" , 6, "푸들");
		TPC24 tpc24 = new TPC24();
		tpc24.display(animalParam);
		animalParam = new Cat("오레오" , 4 , "코숏");
		tpc24.display(animalParam);
		
		// 배열 예제
		Animal[] animalArray = new Animal[2];
		animalArray[0] = new Dog("진돌이" , 10 , "진돗개");
		animalArray[1] = new Cat("똘똘이" , 5 , "러시안블루");
		
		animalArray[0].eat();
		animalArray[0].walk();
		((Dog)animalArray[0]).follow();
		System.out.println("-----------------------------------------");
		animalArray[1].eat();
		animalArray[1].walk();
		((Cat)animalArray[1]).night();
		System.out.println("-----------------------------------------");
		System.out.println(animalArray[0]);
		System.out.println(animalArray[1]);
	}
	
	// 배열로 다형성을 가진 객체가 사용됨.
	public void display(Animal animal) {
		// animal = new Dog("아지" , 6, "푸들");
		int length = animal.getClass().toString().length();
		// System.out.println("animal type => " + animal.getClass().toString().substring(length - 3, length));
		String type = animal.getClass().toString().substring(length - 3, length);
		System.out.println("type => " + type);
		// if(type == "Dog") {
		if(type.equals("Dog")) {
			animal.eat();
			animal.walk();
			Dog d = (Dog)animal;
			d.follow();
		}
		else if(type.equals("Cat")) {
			animal.eat();
			animal.walk();
			Cat c = (Cat)animal;
			c.night();
		}
		System.out.println("-----------------------------------------");
	}
}

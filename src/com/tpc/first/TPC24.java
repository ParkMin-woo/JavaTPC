package com.tpc.first;

import kr.bit.structure.inheritance.animal.Animal;
import kr.bit.structure.inheritance.animal.Cat;
import kr.bit.structure.inheritance.animal.Dog;

public class TPC24 {
	public static void main(String[] args) {
		Animal animalParam = new Dog("아지" , 6, "푸들");
		TPC24 tpc24 = new TPC24();
		tpc24.display(animalParam);
		tpc24.instanceofDisplay(animalParam);
		animalParam = new Cat("오레오" , 4 , "코숏");
		tpc24.display(animalParam);
		tpc24.instanceofDisplay(animalParam);
		
		// 배열 예제
		Animal[] animalArray = new Animal[2];
		animalArray[0] = new Dog("진돌이" , 10 , "진돗개");
		animalArray[1] = new Cat("똘똘이" , 5 , "러시안블루");
		
		animalArray[0].eat();
		animalArray[0].walk();
		((Dog)animalArray[0]).follow();
		System.out.println("-----------------------------------------");
		tpc24.display(animalArray[0]);
		tpc24.instanceofDisplay(animalArray[0]);
		System.out.println("-----------------------------------------");
		animalArray[1].eat();
		animalArray[1].walk();
		((Cat)animalArray[1]).night();
		System.out.println("-----------------------------------------");
		tpc24.display(animalArray[1]);
		tpc24.instanceofDisplay(animalArray[1]);
		System.out.println("-----------------------------------------");
		// Advanced For LOOP
		for(Animal animal : animalArray) {
			System.out.println("Advanced For LOOP 이용");
			tpc24.display(animal);
			tpc24.instanceofDisplay(animal);
		}
		System.out.println(animalArray[0]);
		System.out.println(animalArray[1]);
	}
	
	// 메소드의 매개변수로 다형성을 가진 객체가 사용됨.
	public void display(Animal animal) {
		System.out.println("그냥 다형성 객체를 이용한 메서드");
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
	
	// instanceof 연산자 사용한 메서드
	public void instanceofDisplay(Animal animal) {
		System.out.println("instanceof 연산자를 이용한 다형성 객체를 이용한 메서드");
		if(animal instanceof Dog) {
			animal.eat();
			animal.walk();
			((Dog) animal).follow();
		}
		else if(animal instanceof Cat) {
			animal.eat();
			animal.walk();
			((Cat) animal).night();
		}
		System.out.println("-----------------------------------------");
	}
}

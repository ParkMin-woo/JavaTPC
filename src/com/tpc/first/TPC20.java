package com.tpc.first;

import kr.bit.structure.inheritance.Animal;
import kr.bit.structure.inheritance.Cat;
import kr.bit.structure.inheritance.Dog;


public class TPC20 {
	public static void main(String[] args) {
		Dog dog = new Dog("태양이", 2, "포메라니안");
		dog.eat();
		dog.walk();
		dog.follow();
		
		System.out.println("-----------------------------------------");
		
		Cat cat = new Cat("구름이" , 4 , "코숏");
		cat.eat();
		cat.night();
		cat.walk();
		
		System.out.println("-----------------------------------------");
		
		Animal animalDog1 = new Dog("사랑이" , 4, "요크셔태리어");
		animalDog1.eat();
		animalDog1.walk();
		((Dog) animalDog1).follow();
		
		System.out.println("-----------------------------------------");
		/*
		Animal animalDog2 = new Dog();
		animalDog2.eat();
		animalDog2.walk();
		*/
		
		Animal animalCat = new Cat("장군이" , 5 , "아비니시안");
		animalCat.eat();
		animalCat.walk();
		((Cat) animalCat).night();
		System.out.println("-----------------------------------------");
		
		// ※ 다형성 관련된 실습은 TPC24.java로 따로 빼놨음.
		
		/*
		Animal animalParam = new Dog("아지" , 6, "푸들");
		TPC20 tpc20 = new TPC20();
		tpc20.display(animalParam);
		animalParam = new Cat("오레오" , 4 , "코숏");
		tpc20.display(animalParam);
		
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
		*/
	}
	
	// 메소드의 매개변수로 객체가 사용됨.
	/*
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
	*/
}

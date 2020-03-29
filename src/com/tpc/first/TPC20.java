package com.tpc.first;

import kr.bit.structure.Animal;
import kr.bit.structure.Cat;
import kr.bit.structure.Dog;

public class TPC20 {
	public static void main(String[] args) {
		Dog dog = new Dog("태양이", 2, "포메라니안");
		dog.eat();
		dog.walk();
		
		Cat cat = new Cat("구름이" , 4 , "코숏");
		cat.eat();
		cat.night();
		cat.walk();
		
		Animal animalDog1 = new Dog("사랑이" , 4, "요크셔태리어");
		animalDog1.eat();
		animalDog1.walk();
		((Dog) animalDog1).follow();
		/*
		Animal animalDog2 = new Dog();
		animalDog2.eat();
		animalDog2.walk();
		*/
		
		Animal animalCat = new Cat("장군이" , 5 , "아비니시안");
		animalCat.eat();
		animalCat.walk();
		((Cat) animalCat).night();
	}
}

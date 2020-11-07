package com.tpc.first;

import kr.bit.structure.inheritance.animal.poly.Animal;
import kr.bit.structure.inheritance.animal.poly.Cat;
import kr.bit.structure.inheritance.animal.poly.Dog;

public class TPC30 {

	public static void main(String[] args) {
		Animal dog = new Dog("태양이", 10, "포메라니안");
		Animal cat = new Cat("나라", 2, "토이거");
		display(dog);
		display(cat);
		Animal[] animalArray = new Animal[2];
		animalArray[0] = new Dog("아지" , 14, "불독");
		animalArray[1] = new Cat("오레오" , 3 , "코숏");
		display(animalArray);
	}

	// 메소드 오버로딩
	private static void display(Animal animal) {
		if(animal instanceof Dog) {
			animal.eat();
			animal.walk();
			animal.move();
			((Dog) animal).follow();
		} else {
			animal.eat();
			animal.walk();
			animal.move();
			((Cat) animal).night();
		}
	}

	// 메소드 오버로딩
	private static void display(Animal[] animalArray) {
		for(Animal animalElement : animalArray) {
			if(animalElement instanceof Dog) {
				animalElement.eat();
				animalElement.walk();
				animalElement.move();
				((Dog) animalElement).follow();
			} else {
				animalElement.eat();
				animalElement.walk();
				animalElement.move();
				((Cat) animalElement).night();
			}
		}
	}
}

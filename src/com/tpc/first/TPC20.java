package com.tpc.first;

import kr.bit.structure.Cat;
import kr.bit.structure.Dog;

public class TPC20 {
	public static void main(String[] args) {
		Dog dog = new Dog("태양이", 2, "포메라니안");
		dog.eat();
		
		Cat cat = new Cat("구름이" , 4 , "코숏");
		cat.eat();
		cat.night();
	}
}

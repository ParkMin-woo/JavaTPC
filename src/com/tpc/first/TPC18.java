package com.tpc.first;

import kr.bit.structure.MovieVO;

public class TPC18 {
	public static void main(String[] args) {
		// 정수를 5개 담을 배열 선언
		int[] intArr = new int[5];
		for(int temp : intArr) {
			System.out.println("초기 배열값 => " + temp);
		}
		for(int i = 0 ; i < intArr.length ; i++) {
			intArr[i] = i;
			System.out.println("intArr = " + intArr[i]);
		}
		
		// 영화를 담을 객체를 선언
		MovieVO movie1 = new MovieVO();
		movie1.setTitle("국가부도의 날");
		movie1.setPrice(10000);
		movie1.setDirector("최국희");
		movie1.setLevel(2);
		movie1.setTime(114);
		System.out.println("movie1의 속성 => " + movie1);
		
		MovieVO movie2 = new MovieVO("1987", 12000, "장준환", 3, 129);
		System.out.println("movie2의 속성 => " + movie2);
		
		// Object Array
		MovieVO[] movieArr = new MovieVO[5];
		// System.out.println("movieArr 초기값 => " + movieArr);
		for(MovieVO movie : movieArr) {
			System.out.println("movieArr 초기값 => " + movie);
		}
		movieArr[0] = new MovieVO();
		movieArr[0].setTitle("노무현입니다");
		movieArr[0].setPrice(8000);
		movieArr[0].setDirector("이창재");
		movieArr[0].setLevel(2);
		movieArr[0].setTime(109);
		// System.out.println("movieArr[0]의 속성 => " + movieArr[0]);
		
		movieArr[1] = new MovieVO("택시운전사", 9000, "장훈", 3, 137);
		// System.out.println("movieArr[1]의 속성 => " + movieArr[1]);
		movieArr[2] = new MovieVO("변호인", 7500, "양우석", 3, 127);
		movieArr[3] = new MovieVO("조선명탐정: 사라진 놉의 딸", 8500, "김석윤", 2, 125);
		movieArr[4] = new MovieVO("반창꼬", 9000, "정기훈", 3, 120);
		// System.out.println("movieArr[2]의 속성 => " + movieArr[2]);
		// System.out.println("movieArr[3]의 속성 => " + movieArr[3]);
		// System.out.println("movieArr[4]의 속성 => " + movieArr[4]);
		
		for(MovieVO movie : movieArr) {
			System.out.println(movie);
		}
	}
}

package com.tpc.first;

import java.util.ArrayList;
import java.util.List;

import kr.bit.structure.BookDTO;

public class TPC40 {
	public static void main(String[] args) {
		List bookList = new ArrayList();
		
		// BookDTO(String title, int price, String company, int page)
		bookList.add(new BookDTO("이낙연의 언어", 15000, "타래", 350));
		bookList.add(new BookDTO("이낙연은 넥타이를 전날 밤에 고른다.", 15000, "북콤마", 300));
		bookList.add(new BookDTO("어록으로 본 이낙연", 15000, "삼인출판사", 325));
		
		// BookDTO book1 = (BookDTO) bookList.get(0);
		for(int i = 0 ; i < bookList.size() ; i++) {
			BookDTO book = (BookDTO) bookList.get(i);
			System.out.println("book => " + book);
		}
		
		// generic을 사용
		// generic의 사용 이유 : ArrayList는 배열과는 다르게 모든 객체를 담을 수 있다. 이건 배열과 비교하면 장점일 수 있지만, 동시에 단점도 된다.
		// 왜냐하면 나중에 get으로 ArrayList 내의 데이터를 가져올 때, downcasting을 각각 객체에 맞게 해줘야 되는 불편함이 있기 때문이다.
		// 그래서 보통은 ArrayList에 한 객체를 담아 get으로 편하게 데이터를 가져오기 위해서 generic을 사용한다.
		List<BookDTO> bookList2 = new ArrayList<BookDTO>();
		bookList2.add(new BookDTO("제3의 물결", 17000, "홍신문화사", 500));
		bookList2.add(new BookDTO("클라우스 슈밥의 제4차 산업혁명", 15000, "메가스터디북스", 350));
		bookList2.add(new BookDTO("어록으로 본 이낙연", 15000, "삼인출판사", 325));
		for(BookDTO bookElement : bookList2) {
			System.out.println("bookElement => " + bookElement);
		}
	}
}
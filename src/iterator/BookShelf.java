package iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements BookShelfService{	// iterator 의 기능을 바로 호출하지 않고,
	// BookShelfService 를 통해 위임 받은 기능 사용
	
	private Book[] books;
	private int last = 0;
	
//	List<Book> list = new ArrayList<Book>();
//	Book book = new Book();
	
	public BookShelf(int size) {
		this.books = new Book[size];
	}
	/**
	 * 추가(create)
	 */
	public void addBook(Book book){
		this.books[last] = book;
		last++;
	}
	/**
	 * 조회(read)
	 */
	public Book getBookAt(int index) {
		return books[index];
	}
	public int getCount(){	// 배열의 사이즈가 아닌 실제 요소들의 갯수
		return last;
	}
	
	/**
	 * 수정(update)
	 */
	/**
	 * 삭제(delete)
	 */

	@Override
	public MyIterator iterator() {
//		BookShelfIterator b = new BookShelfIterator(this);
//		return = b;
		return new BookShelfIterator(this);	// 본 클래스를 검색하는 객체
	}
}

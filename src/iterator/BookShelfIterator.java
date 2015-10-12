package iterator;

public class BookShelfIterator implements MyIterator{
	private BookShelf bookshelf;	// 필드에 dest(대상 클래스 고정함)
	private int index;
	
	public BookShelfIterator(BookShelf bookshelf) {
		this.bookshelf = bookshelf;
		this.index = 0;	//조회 인덱스는 0값
		
	}

	@Override
	public boolean hasnext() {
//		boolean flag = false;
		if (index < bookshelf.getCount()) {	// 배열이 가지고 있는 실제 요소의 갯수
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = bookshelf.getBookAt(index);
		index++;
		return book;
	}

}

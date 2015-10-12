package iterator;

public class BookMain {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(100); // 100권을 담을 수 있는 책장
		bookShelf.addBook(new Book("자바의 정석"));
		bookShelf.addBook(new Book("디자인 패턴"));
		bookShelf.addBook(new Book("오라클 문법"));
		bookShelf.addBook(new Book("JSP 프로그래밍"));
		MyIterator it = bookShelf.iterator(); // 얕은 카피
		while (it.hasnext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}

}

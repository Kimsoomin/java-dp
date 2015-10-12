package iterator;

public class Book {		// 빈(Bean)객체 클래스 (안에 객체들을 담고 있는 모습
	private String name;
	public Book(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

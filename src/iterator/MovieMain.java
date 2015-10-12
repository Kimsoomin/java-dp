package iterator;

public class MovieMain {
	public static void main(String[] args) {
		Multiplex multiplex = new Multiplex(100); // 100권을 담을 수 있는 책장
		multiplex.addMovie(new Movie("매트릭스"));
		multiplex.addMovie(new Movie("아이언맨"));
		multiplex.addMovie(new Movie("무한도전"));
		multiplex.addMovie(new Movie("베트맨"));
		MyIterator it = multiplex.iterator(); // 얕은 카피
		while (it.hasnext()) {
			Movie movie = (Movie) it.next();
			if (movie.getName().equals("아이언맨")) {
				System.out.println(movie.getName());
			}
			

		}
	}
}

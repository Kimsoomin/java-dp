package iterator;

public class Multiplex implements MultiplexService{
	private Movie[] movies;
	private int last = 0;	// 실제 상영관
	
	public Multiplex(int size) {
		this.movies = new Movie[size];
	}
	// 추가
	public void addMovie(Movie movie) {
		this.movies[last]=movie;
		last++;
	}
	// 조회
	public Movie getMovieAt(int index) {
		return movies[index];
	}
	public int getCount(){
		return last;
	}
	@Override
	public MyIterator iterator() {
//		BookShelfIterator b = new BookShelfIterator(this);
//		return = b;
		return new MultiplexIterator(this);
	}

}

package singleton;

public class SingletonMain {
	public static void main(String[] args) {
		// 단 하나의 인스턴스
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if (s == s2) {
			System.out.println("두 인스턴스가 동일 주소값");
		} else {
			System.out.println("두 인스턴스가 다른 주소값");
		}
		s.test();
		s2.test();
	}
}

package iterator;

import java.util.Scanner;

public class HanbitMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Student student = new Student();

		HanbitEni hb = new HanbitEni(10); // 10명
		MyIterator it = hb.iterator();
		
		hb.add(new Student("빅데이터", "길동"));
		hb.add(new Student("빅데이터", "유신"));
		hb.add(new Student("빅데이터", "순신"));
		hb.add(new Student("자바", "순환"));
		hb.add(new Student("자바", "준규"));
		hb.add(new Student("자바", "성한"));
		hb.add(new Student("자바", "혜숙"));

		System.out.println("빅데이터 반은 3명이며 길동,유신,순신 학생이 있고..");
		while (true) {
			System.out.println("1.학생추가 2.학생조회(유일한값이름) " 
		+ "3.학생조회(과목) 4.총학생수 5.전체학생 이름 6.종료");
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("반이름, 이름 입력해주세요");
				hb.add(new Student(scanner.next(), scanner.next()));
				System.out.println(hb.getCount());
				break;
			case 2:
				System.out.println("이름 입력");
				String name1 = scanner.next();
				while (it.hasnext()) {
					Student student = (Student) it.next();
					if (student.getName().equals(name1)) {
						System.out.println("이름: " +student.getName()+ "\t"
								+"과목: "+student.getSubject());
					}
				}
				break;
			case 3:
				System.out.println("과목 입력");
				String subject = scanner.next();
				while (it.hasnext()) {
					Student student = (Student) it.next();
					if (student.getSubject().equals(subject)) {
						System.out.println(student.getName());
					}
				}
				break;
			case 4:
				System.out.println(hb.getCount() + "명");
				break;
			case 5:
				while (it.hasnext()) {
					Student student = (Student) it.next();
					System.out.println("이름: "+ student.getName()+ "\t"
					+ "과목: "+student.getSubject());				
				}
				break;
			case 6:
				return;
			default:
				break;
			}
		}
		/**
		 * 1. HanbitEni 의 배열 버전 
		 * 2. HanbitEni 의 ArrayList 버전 (count 필요없이 last값만 필요??) 
		 * 3. HanbitEni 의 HashMap 버전 ( index 값을 강제로 ++??)
		 */
	}
}

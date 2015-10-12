package iterator;

public class HanbitEni implements HanbitEniService{
	private Student[] student;
	private int last = 0;	// 실제 학생수
	
	public HanbitEni(int size) {
		this.student = new Student[size];
	}

	//추가
	public void add(Student student) {	//10까지만 받기
		if (last<10) {
			this.student[last] = student;
			last++;
		} else {
			System.out.println("10까지만 입력 가능");
			return;
		}	
	}
	
	//조회
	public Student getStudentAt(int index) {
		return student[index];
	}
	public int getCount() {
		return last;
	}
	
	// 조회
	
	
	
	@Override
	public MyIterator iterator() {
//		BookShelfIterator b = new BookShelfIterator(this);
//		return = b;
		return new HanbitIterator(this);
	}
}

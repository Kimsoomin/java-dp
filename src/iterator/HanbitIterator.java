package iterator;

public class HanbitIterator implements MyIterator{
	private HanbitEni hanbiteni;
	private int index;
	public HanbitIterator(HanbitEni hanbitEni) {
		this.hanbiteni = hanbitEni;
		this.index=0;
		
	}

	@Override
	public boolean hasnext() {
		if (index < hanbiteni.getCount()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Student student = hanbiteni.getStudentAt(index);
		index++;
		return student;
	}

}

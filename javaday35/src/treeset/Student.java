package treeset;

public class Student implements Comparable {
	private int rollno;
	private String name;
	private String stream;
	
	public Student(int rollno, String name, String stream) {
		this.rollno = rollno;
		this.name = name;
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", stream=" + stream + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		Student s0 = (Student) arg0;
		
		if (this.rollno > s0.rollno) return 1;
		if (this.rollno < s0.rollno) return -1;
		return 0;
	}
}

package comparable;


public class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	private String stream;
	
	public Student(int rollNo, String name, String stream) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.stream = stream;
	}
	
	@Override
	public String toString() {
		
		return "Student [rollNo=" + rollNo + ", name=" + name + ", stream=" + stream + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		Student st=(Student)o;
		
		if (rollNo > st.rollNo) return -1;
		if (rollNo < st.rollNo)	return 1;
		return 0;
	}
}

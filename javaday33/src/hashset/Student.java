package hashset;

public class Student {
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
	public int hashCode() {
		
		return rollNo;
	}
}

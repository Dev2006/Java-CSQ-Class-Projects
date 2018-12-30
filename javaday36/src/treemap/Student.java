package treemap;

public class Student {
	private String name;
	private String stream;
	
	public Student(String name, String stream) {
		this.name = name;
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", stream=" + stream + "]";
	}
}

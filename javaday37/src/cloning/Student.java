package cloning;

public class Student {
	private String name;
	private int age;
	private String stream;
	
	public Student(String name, int age, String stream) {
		this.name = name;
		this.age = age;
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", stream=" + stream + "]";
	}
}

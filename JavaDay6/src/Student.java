
public class Student {
	int id;
	String name;
	
	public Student() {
		System.out.println("No-Arg constructor called");
	}
	
	public Student(int id_, String name_) {
		System.out.println("Parameterized constructor called");
		
		id = id_;
		name = name_;
	}
	
	public void display() {
		System.out.println("id: " + id + "\nname: " + name);
	}
}
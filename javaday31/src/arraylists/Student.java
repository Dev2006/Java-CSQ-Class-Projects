package arraylists;

public class Student {
	private String name;
	private int id;
	private String course;
	
	public Student(String name, int id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getCourse() {
		return course;
	}
}

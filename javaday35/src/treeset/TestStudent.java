package treeset;

import java.util.TreeSet;

public class TestStudent {
	
	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<Student>();
		set.add(new Student(112, "Dev", "Java"));
		set.add(new Student(104, "Aakash", "PHP"));
		set.add(new Student(107, "Mohit", "Java"));
		
		for (Student st : set) {
			System.out.println(st);
		}
	}
}

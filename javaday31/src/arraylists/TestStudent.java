package arraylists;

import java.util.*;

public class TestStudent {
	
	public static void main(String[] args) {
		Student st1 = new Student("Dev", 5, "Python");
		Student st2 = new Student("Aaskash", 6, "JavaScript");
		Student st3 = new Student("Mohit", 7, "Java");
		Student st4 = new Student("Ravi", 8, "C#");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext()) {
			Student temp = itr.next();
			System.out.println("id : " + temp.getId()
					+ ", Name : " + temp.getName()
					+ ", Course : " + temp.getCourse());
		}
	}
}

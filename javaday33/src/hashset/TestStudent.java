package hashset;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class TestStudent {

	public static void main(String[] args) {
		LinkedHashSet<Student> set=new LinkedHashSet<Student>();
		
		set.add(new Student(101,"Dev","C++"));
		set.add(new Student(102,"Aakash","java"));
		set.add(new Student(103,"Mohit","PHP"));
		set.add(new Student(101,"Dev","C"));
		
		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			
			Student student = it.next();
			System.out.println(student);
		}
	}
}

package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortStudent {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<>();
		
		list.add(new Student(112,"Aakash","java"));
		list.add(new Student(102,"Dev","PHP"));
		list.add(new Student(105,"Rahul","C++"));
		
		Collections.sort(list);
		
		Iterator<Student> itr=list.iterator();
		while (itr.hasNext()) {
			Student st=itr.next();
			
			System.out.println(st);
		}
	}
}

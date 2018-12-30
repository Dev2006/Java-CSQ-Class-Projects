package treemap;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TestStudent {
	
	public static void main(String[] args) {
		TreeMap<Integer, Student> map = new TreeMap<>();
		
		map.put(112, new Student("Dev", "Java"));
		map.put(104, new Student("Aakash", "PHP"));
		map.put(114, new Student("Mohit", "Java"));
		
		for (Entry<Integer, Student> ent:map.entrySet())
		{
			int id = ent.getKey();
			Student st = ent.getValue();
			System.out.println(id + " : " + st);
		}
	}
}

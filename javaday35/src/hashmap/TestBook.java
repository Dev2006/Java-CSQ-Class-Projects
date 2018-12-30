package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class TestBook {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer, Book> map = new LinkedHashMap<Integer, Book>();
		
		map.put(112, new Book("Java 101", "Aakash"));
		map.put(121, new Book("Nature Of Code", "Daniel Shiffman"));
		map.put(114, new Book("Lord Of The Rings", "JRR. Tolkien"));
		
		for (Entry<Integer,Book> ent:map.entrySet())
		{
			int id=ent.getKey();
			Book b=ent.getValue();
			System.out.println("Book " + id + ": " + b.getName() + ", by " + b.getAuthor());
		}
	}
}

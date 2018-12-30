package linkedlist;

import java.util.LinkedList;

public class Linked {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Dev");
		list.addFirst("Mohit");
		list.addLast("Aakash");
		list.add("Ravi");
		
		System.out.println("values : " + list);
		System.out.println("first element : " + list.getFirst());
		System.out.println("last element : " + list.getLast());
		System.out.println("size : " + list.size());
	}
}

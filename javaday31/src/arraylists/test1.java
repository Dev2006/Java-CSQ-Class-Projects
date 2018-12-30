package arraylists;

import java.util.ArrayList;

public class test1 {
	
	public static void main(String[] args) {
		//Initialization
		ArrayList<String> list = new ArrayList();
		
		//Adding elements
		list.add("Me");
		list.add("Myself");
		list.add("I");
		
		//Printing list
		System.out.println("Data : " + list + '\n');
		
		//Printing info. about list
		System.out.println("is it empty : " + list.isEmpty());
		System.out.println("size : " + list.size() + '\n');
		
		//Adding to a particular index
		list.add(0, "You");
		list.add(1, "Yourself");
		System.out.println("Data after additions : " + list + '\n');
		
		//Removing elements based on
		System.out.println("Element being removed : " + list.remove(0)); //index
		System.out.println("Is \"We\" being removed : " + list.remove("We")); //element value
		System.out.println("Data after deletions : " +  list + '\n');
		
		//Checking whether certain elements are contained
		System.out.println("Does \"Yourself\" exist : " + list.contains("Yourself"));
	}
}

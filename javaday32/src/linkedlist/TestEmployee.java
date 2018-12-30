package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class TestEmployee {
	
	public static void main(String[] args) {
		LinkedList<Employee> list = new LinkedList<Employee>();
		Employee emp1 = new Employee(1, "Ramesh", 15000);
		Employee emp2 = new Employee(2, "Suresh", 25000);
		
		list.add(emp1);
		list.add(emp2);
		
		Iterator<Employee> i = list.iterator();
			
		while (i.hasNext()) {
			Employee e = i.next();
			
			System.out.println("Employee " + e.getId() + ": Name-" + e.getName() + ", Salary-" + e.getSalary());
		}
	}
}

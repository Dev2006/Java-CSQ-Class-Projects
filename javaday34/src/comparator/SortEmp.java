package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmp {
public static void main(String[] args) {
	ArrayList<Employee> list=new ArrayList<>();
	list.add(new Employee(23,"vikash",1111));
	list.add(new Employee(20,"ravi", 3333));
	list.add(new Employee(21,"dev", 22333));
	
	System.out.println("\nSorting By Age....");
	Collections.sort(list, new AgeComparator());
	
	for (Employee employee : list) {
		System.out.println(employee);
	}
	
	System.out.println("\nSorting By Name...");
	
	Collections.sort(list, new NameComparator());
	for (Employee employee2 : list) {
		System.out.println(employee2);
	}
	
	System.out.println("\nSorting By Salary...");
	
	Collections.sort(list, new SalaryComparator());
	for (Employee employee2 : list) {
		System.out.println(employee2);
	}
	
}
}

package comparator.test;

import java.util.Comparator;

public class Employee {
	private int age;
	private String name;
	private int salary;

	public Employee(int age, String name, int salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [Age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	
	//Comparators for Employee class
	static class AgeComparator implements Comparator<Employee> {
		
		@Override
		public int compare(Employee arg0, Employee arg1) {
			if (arg0.age > arg1.age) return 1;
			if (arg0.age < arg1.age) return -1;
			return 0;
		}		
	}
	
	static class SalaryComparator implements Comparator<Employee> {
		
		@Override
		public int compare(Employee arg0, Employee arg1) {
			if (arg0.salary > arg1.salary) return 1;
			if (arg0.salary < arg1.salary) return -1;
			return 0;
		}
	}
	
	static class NameComparator implements Comparator<Employee>{
		
		@Override
		public int compare(Employee arg0, Employee arg1) {
			return arg0.name.compareTo(arg1.name);
		}
	}
}

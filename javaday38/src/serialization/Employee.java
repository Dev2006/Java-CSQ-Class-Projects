package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	static String office = "Google India";
	private transient int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [office=" + office + ", id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

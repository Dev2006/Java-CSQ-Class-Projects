package comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		if (arg0.salary > arg1.salary) return 1;
		if (arg0.salary < arg1.salary) return -1;
		return 0;
	}
}

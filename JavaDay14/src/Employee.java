
public class Employee {
	private double salary;
	
	public double getSalary() {
		
		return salary;
	}
	
	public void setSalary(double baseSalary, double HRA, double bonus) {
		
		//Setting base salary
		this.salary = baseSalary;
		
		//Adding HRA and Bonus
		this.salary += HRA;
		this.salary += bonus;
		
		//Deducting TDS (income tax)
		if((baseSalary * 12) > 800000) {
			
			this.salary += (baseSalary * 0.3);
		} else if((baseSalary * 12) > 500000) {
			
			this.salary += (baseSalary * 0.2);
		} else if((baseSalary * 12) > 350000) {
			
			this.salary += (baseSalary * 0.1);
		}
		
		//Deducting PF
		this.salary -= (baseSalary * 0.07);
	}
}

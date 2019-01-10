package Serialization;

public class Manager extends Employee{
private int salary;

public Manager(int id,String name,int salary) {
	super(id,name);
	this.salary = salary;
}
public void display()
{
System.out.println(id+" "+name+" "+salary);
}

}

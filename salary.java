package Salary;

public abstract class salary {

	protected String name;
	
	
	public salary(String n) {
		name = n;
	}
	
	public abstract void salaryCal();
	public abstract void display();
}

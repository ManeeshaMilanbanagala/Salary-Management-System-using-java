package Salary;

public class contractEmp extends salary{

	private int noDays;
	private double salaryDay;
	private double tot;
	public double getTot() {
		return tot;
	}
	public void setTot(double tot) {
		this.tot = tot;
	}
	public int getNoDays() {
		return noDays;
	}
	public void setNoDays(int noDays) {
		this.noDays = noDays;
	}
	public double getSalaryDay() {
		return salaryDay;
	}
	public void setSalaryDay(double salaryDay) {
		this.salaryDay = salaryDay;
	}
	
	public contractEmp(int nd, double sd, String n) {
		super(n);
		noDays = nd;
		salaryDay=sd;
	}
	
	@Override
	public void salaryCal() {
		tot = noDays * salaryDay;
	}
	
	@Override
	public void display() {
		System.out.println("name: " +name);
		System.out.println("Final salary:" + tot);
	}
}

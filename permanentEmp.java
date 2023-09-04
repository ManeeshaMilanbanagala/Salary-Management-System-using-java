package Salary;

public class permanentEmp extends salary{

	private double ot;
	private double rate;
	private double basicSalary;
	private double tot;
	public double getTot() {
		return tot;
	}
	public void setTot(double tot) {
		this.tot = tot;
	}
	public double getOt() {
		return ot;
	}
	public void setOt(double ot) {
		this.ot = ot;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public permanentEmp(double o, double r, double b, String n) {
		super(n);
		ot = o;
		rate = r;
		basicSalary = b;
	}
	
	@Override
	public void salaryCal() {
		tot = (ot*rate)+basicSalary;
	}
	@Override
	public void display() {
		System.out.println("name: " +name);
		System.out.println("Final salary:" + tot);
	}
}

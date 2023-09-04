package Salary;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {

	Scanner scn = new Scanner(System.in);
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Choose employee type");
	System.out.println("1. Permanent employee");
	System.out.println("2. Contract employee");
	
	int userInput = scn.nextInt();
	
	String empName;
	double bs;
	double ot;
	double rate;
	int days;
	double perDay;
	
	
	if(userInput == 1) {
		System.out.println("Enter employee name");
		empName = scanner.nextLine();
		
		
		System.out.println("Enter basic salary");
		bs = scn.nextDouble();
		
		System.out.println("Enter ot hours");
		ot = scn.nextDouble();
		
		System.out.println("Enter ot rate");
		rate = scn.nextDouble();
		
		permanentEmp pe = new permanentEmp(ot, rate, bs, empName);
		
		pe.salaryCal();
		pe.display();
		
	}else if(userInput == 2) {
		System.out.println("Enter employee name");
		empName = scanner.nextLine();
		
		
		System.out.println("Enter salary per day");
		days = scn.nextInt();
		
		System.out.println("Enter no of working days");
		perDay = scn.nextDouble();
		
		contractEmp ce  = new contractEmp(days, perDay, empName);
		ce.salaryCal();
		ce.display();
	}else {
		System.err.println("Invalid input");
	}
	
	
	
	
}

	
}
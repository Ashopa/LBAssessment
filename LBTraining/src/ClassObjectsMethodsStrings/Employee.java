package ClassObjectsMethodsStrings;

public class Employee {

		String firstname;
		String lastname;
		double monthlySalary;
		double yearlySalary;
		double salaryRaise;
		double raisePercent;
		
	public Employee(String firstname,String lastname,double monthlySalary,double raisePercent) {
		setFirstName(firstname);
		setLastName(lastname);
		setMonthlySalary(monthlySalary);
		setYearlySalary(monthlySalary);
		setSalaryRaise(raisePercent);
	}
	
	//Getter
	public String getFirstName() {
		return firstname;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public double getYearlySalary() {
		return yearlySalary;
	}
	
	public double getSalaryRaise() {
		return salaryRaise;
	}
	
	//Setter
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary > 0) {
		this.monthlySalary = monthlySalary; }
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public void setYearlySalary(double monthlySalary) {
		yearlySalary = monthlySalary * 12; 
	}
	
	public void setSalaryRaise(double raisePercent) {
		this.raisePercent = raisePercent;
		salaryRaise = ( yearlySalary * raisePercent )/100;
		salaryRaise += yearlySalary;		
	}
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Pavithra","Ashok",60000,10);
		Employee emp2 = new Employee("Antony","Marshal",90000,10);
		
		//Employee 1 Salary Info
		System.out.println("Employee 1 Salary Info:");
		System.out.println("Monthly Salary of " + emp1.getFirstName() + " " + emp1.getLastName() + " - " + emp1.getMonthlySalary());
		System.out.println("Yearly Salary of " + emp1.getFirstName() + " " + emp1.getLastName() + " before raise: " + emp1.yearlySalary);
		System.out.println("Yearly Salary of " + emp1.getFirstName() + " " + emp1.getLastName() + " after " + emp1.raisePercent + "raise: " + emp1.getSalaryRaise());
		
		//Employee 2 Salary Info
		System.out.println("\n" +  "Employee 2 Salary Info;");
		System.out.println("Monthly Salary of " + emp2.getFirstName() + " " + emp2.getLastName() + " - " + emp2.getMonthlySalary());
		System.out.println("Yearly Salary of " + emp2.getFirstName() + " " + emp2.getLastName() + " before raise: " + emp2.yearlySalary);
		System.out.println("Yearly Salary of " + emp2.getFirstName() + " " + emp2.getLastName() + " after " + emp2.raisePercent + " raise: " + emp2.getSalaryRaise());

	}

}

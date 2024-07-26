package abstraction;

public class Programmer extends Employee{

	private int overtimeHours;
	private double hourlyRate;
	
	public Programmer() {
	}

	public Programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
		super(name, baseSalary);
		this.overtimeHours = overtimeHours;
		this.hourlyRate = hourlyRate;
	}

	public int getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(int overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "Programmer [overtimeHours=" + overtimeHours + ", hourlyRate=" + hourlyRate + ", name=" + name
				+ ", baseSalary=" + baseSalary + "]";
	}

	@Override
	public double calculateSalary() {
		return baseSalary + (overtimeHours * hourlyRate);
	}

	@Override
	public void displayInfo() {
	    System.out.println("Programmer Name: " + name);
	    System.out.println("Base Salary: $" + baseSalary);
	    System.out.println("Overtime Hours: " + overtimeHours);
	    System.out.println("Hourly Rate: $" + hourlyRate);
	    System.out.println("Total Salary: $" + calculateSalary());
	}
	
}

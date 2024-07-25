package bean;

public class Manager extends EmployeeEx10{

	private int numberOfSubordinates;

	public Manager() {
		super();
	}

	public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) {
		super(name, address, salary, jobTitle);
		this.numberOfSubordinates = numberOfSubordinates;
	}

	public int getNumberOfSubordinates() {
		return numberOfSubordinates;
	}

	public void setNumberOfSubordinates(int numberOfSubordinates) {
		this.numberOfSubordinates = numberOfSubordinates;
	}
	
	@Override
	public double calculateBonus() {
		return getSalary() * 0.15;
	}
	
	@Override
	public String generatePerformanceReport() {
		return "Performance report for Manager " + getName() + ": Excelent";
	}
	
	public void manageProject() {
		System.out.println("Manager " + getName() + " is managing a project.");
	}
	
}

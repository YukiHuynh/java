package bean;

public class Developer extends EmployeeEx10{
	
	private String programmingLanguage;
	
	public Developer() {
	}

	public Developer(String name, String address, double salary, String jobTitle, String programingLanguage) {
		super(name, address, salary, jobTitle);
		this.programmingLanguage = programingLanguage;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	@Override
	public double calculateBonus() {
		return getSalary() * 0.10;
	}
	
	@Override
	public String generatePerformanceReport() {
		return "Performance report for Developer " + getName() + ": Good";
	}
	
	public void writeCode() {
		System.out.println("Developer " + getName() + " is writint code in " + programmingLanguage);
	}
	
}

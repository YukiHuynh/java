package bean;

public class Programmer extends Developer{

	public Programmer() {
		super();
	}

	public Programmer(String name, String address, double salary, String jobTitle, String programingLanguage) {
		super(name, address, salary, jobTitle, programingLanguage);
	}
	
	@Override
	public double calculateBonus() {
		return getSalary() * 0.12;
	}
	
	@Override
	public String generatePerformanceReport() {
		return "Performance report for Programmer " + getName() + ": Excellent.";
	}
	
	public void debubCode() {
		System.out.println("Programmer " + getName() + " is debugging code in " + getProgrammingLanguage());
	}
	
}

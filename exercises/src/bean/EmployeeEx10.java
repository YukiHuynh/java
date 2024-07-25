package bean;

public class EmployeeEx10 {

	private String name;
	private String address;
	private double salary;
	private String jobTitle;
	
	public EmployeeEx10() {
	}

	public EmployeeEx10(String name, String address, double salary, String jobTitle) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "EmployeeEx10 [name=" + name + ", address=" + address + ", salary=" + salary + ", jobTitle=" + jobTitle
				+ "]";
	}
	
	public double calculateBonus() {
		return 0.0;
	}
	
	public String generatePerformanceReport() {
		return "No performance report availabe.";
	}
	
}

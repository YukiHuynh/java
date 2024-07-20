package bean;

public class Employee {

	private String name;
	private String jobTitle;
	private double salary;
	
	public Employee() {
	}

	public Employee(String name, String jobTitle, int salary) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void raiseSalary(double percentage) {
		salary = salary + salary * percentage / 100;
	}
	
	public void printEmployeeDetail() {
		System.out.println("Name: " + name);
		System.out.println("Job Title: " + jobTitle);
		System.out.println("Salary: " + salary);
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", salary=" + salary + "]";
	}
	
}

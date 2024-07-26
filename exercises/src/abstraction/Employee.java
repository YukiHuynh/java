package abstraction;

public abstract class Employee {
	protected String name;
    protected double baseSalary;
    
    public Employee() {
		// TODO Auto-generated constructor stub
	}
    
    public Employee(String name, double baseSalary) {
        this.name = name; 
        this.baseSalary = baseSalary;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", baseSalary=" + baseSalary + "]";
	}

	public abstract double calculateSalary();

    public abstract void displayInfo();
}

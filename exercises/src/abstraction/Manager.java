package abstraction;

public class Manager extends Employee{

	private double bonus;
	
	public Manager() {
	}

	public Manager(String name, double baseSalary, double bonus) {
		super(name, baseSalary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", name=" + name + ", baseSalary=" + baseSalary + "]";
	}

	@Override
	public double calculateSalary() {
		return baseSalary + bonus;
	}

	@Override
	public void displayInfo() {
		System.out.println("Manager Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateSalary());
	}
	
}

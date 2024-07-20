package oop;

import bean.Employee;

public class Ex06Salary {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
		Employee employee2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);
		
		System.out.println("Employee details: ");
		employee1.printEmployeeDetail();
		employee2.printEmployeeDetail();
		
		employee1.raiseSalary(8);
		employee2.raiseSalary(20);
		System.out.println("\nAfter raising salary: ");
		employee1.printEmployeeDetail();
		employee2.printEmployeeDetail();
	}
	
}

package inheritance;

import bean.Developer;
import bean.Manager;
import bean.Programmer;

public class Ex10Main {

	public static void main(String[] args) {
		
		Manager manager = new Manager("Avril Aroldo", "1 ABC St", 80000.0, "Manager", 5);
		Developer developer = new Developer("Iver Dipali", "2 PQR St", 72000.0, "Developer", "Java");
		Programmer programmer = new Programmer("Yaron Gabriel", "3 ABC St", 76000.0, "Programmer", "Python");
		
		System.out.println("Manager's bonus: $" + manager.calculateBonus());
		System.out.println("Developer's bonus: $" + developer.calculateBonus());
		System.out.println("Programmer's bonus: $" + programmer.calculateBonus());
		
		System.out.println(manager.generatePerformanceReport());
		System.out.println(developer.generatePerformanceReport());
		System.out.println(programmer.generatePerformanceReport());
		
		manager.manageProject();
		developer.writeCode();
		programmer.debubCode();
		
	}
	
}

package javademos.emailApp;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Enter your first name: ");
			String fname = scanner.next();

			System.out.print("Enter your last name: ");
			String lname = scanner.next();

			System.out.println("\nEnter your department (as a index): ");
			InMemoryData.DEPARMENTS.forEach(App::showInfo);			
			Department dep = InMemoryData.DEPARMENTS.get(scanner.nextInt());

			Employee emp = new Employee(fname, lname, dep);
			System.out.println();
			showInfo(emp);
		}
	}
	
	public static void showInfo(Employee emp) {
				
		System.out.println("Employee: " + emp.getFirstName() + " " + emp.getLastName());
		showInfo(emp.getDepartment());
		showInfo(emp.getEmail());
	}

	public static void showInfo(Email email) {
		
		System.out.println("Email: " + email.getEmail());
		System.out.println("Password: " + email.getPassword());
		System.out.println("Alt email: " + email.getAlternativeEmail());
		System.out.println("Capacity: " + email.getMailBoxCapacity() + " mb");
	}	
	
	public static void showInfo(Department dep) {
		System.out.println("Department: " + dep.getName());
	}
	
}

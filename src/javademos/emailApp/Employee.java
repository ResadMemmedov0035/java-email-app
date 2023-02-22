package javademos.emailApp;

public class Employee {

	private String firstName;
	private String lastName;
	private Department department;
	private Email email;
	
	public Employee(String firstName, String lastName, Department department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.email = Email.fromEmployee(this);
	}	
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public Email getEmail() {
		return email;
	}
}

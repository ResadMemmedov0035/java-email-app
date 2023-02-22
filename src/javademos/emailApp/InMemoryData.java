package javademos.emailApp;

import java.util.List;

public class InMemoryData {
	
	public static final List<Department> DEPARMENTS = List.of(
			new Department("Human Resources", "hr"),
			new Department("IT Development", "it"),
			new Department("Sales", "sales"));
	
}

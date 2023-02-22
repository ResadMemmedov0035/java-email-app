package javademos.emailApp;

public class Department {
	
	private String name;
	private String shortName;
	
	public Department(String name, String shortName) {
		this.name = name;
		this.shortName = shortName;
	}

	public String getName() {
		return name;
	}

	public String getShortName() {
		return shortName;
	}
}

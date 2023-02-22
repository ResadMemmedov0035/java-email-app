package javademos.emailApp;

public class Email {

	private final static String companyDomain = "xyzcompany.com";	
	private final static int passwordLength = 8;
	
	private String email;
	private String password;
	private int mailBoxCapacity = 500;
	private String alternativeEmail;

	private Email(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public static Email fromEmployee(Employee emp) {

		String email = generateEmail(emp);		
		String password = generatePassword(passwordLength);
		
		return new Email(email, password);
	}	
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	public String getAlternativeEmail() {
		return alternativeEmail;
	}	
	
	public void setAlternativeEmail(String altEmail) {
		this.alternativeEmail = altEmail;
	}
	
	private static String generateEmail(Employee emp) {
		
		return emp.getFirstName().toLowerCase() + "." 
		+ emp.getLastName().toLowerCase() + "@" 
		+ emp.getDepartment().getShortName() + "." + companyDomain;
	}
	
	private static String generatePassword(int length) {
		
		String pool = "ABCDEFGHIJKLMNOUPQRSTUVWXYZ1234567890!#$%&";
		char[] raw = new char[length];
		
		for (int i = 0; i < raw.length; i++) {
			int rand = (int)(Math.random() * pool.length());
			raw[i] = pool.charAt(rand);
		}		
		return new String(raw);
	}
}
